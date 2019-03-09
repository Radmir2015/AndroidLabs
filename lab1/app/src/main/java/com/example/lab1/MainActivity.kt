package com.example.lab1

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val basicThread = object : Thread() {
            override fun run() {
                try {
                    super.run()
                    Thread.sleep(2000)  //Delay of 2 seconds
                } catch (e: Exception) {
                } finally {
                    val i = Intent(this@MainActivity, SecondActivity::class.java)
                    startActivity(i)
                    finish()
                }
            }
        }
        basicThread.start()
    }
}
