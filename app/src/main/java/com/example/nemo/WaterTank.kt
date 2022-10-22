package com.example.nemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.Window
import android.widget.Button
import android.widget.ProgressBar
import android.widget.TextView

class WaterTank : AppCompatActivity() {
    private var progressBar: ProgressBar? = null
    private var i = 0
    private var txtView: TextView? = null
    private val handler = Handler()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        actionBarHide()
        statusBarColour()
        setContentView(R.layout.activity_water_tank)
        progressBar = findViewById<ProgressBar>(R.id.WaterprogressBar) as ProgressBar
        txtView = findViewById<TextView>(R.id.currlevel)
        val wButton : Button = findViewById<Button>(R.id.WaterButton)

        wButton.setOnClickListener {
            if(wButton.text =="ON"){
                wButton.text = "OFF"
                i = progressBar!!.progress
                Thread(Runnable {
                    // this loop will run until the value of i becomes 99
                    while (i < 80) {
                        i += 1
                        // Update the progress bar and display the current value
                        handler.post(Runnable {
                            progressBar!!.progress = i
                            // setting current progress to the textview
                            txtView!!.text = i.toString()
                        })
                        try {
                            Thread.sleep(100)
                        } catch (e: InterruptedException) {
                            e.printStackTrace()
                        }
                    }
                    wButton.text = "ON"

                }).start()
            }
            else if(wButton.text =="OFF"){
                wButton.text = "ON"
                progressBar!!.progress=i
            }
        }

    }





    private fun statusBarColour() {
        window.statusBarColor = resources.getColor(R.color.bg)
    }
    private fun actionBarHide() {
        requestWindowFeature(Window.FEATURE_NO_TITLE)
        supportActionBar?.hide()
    }
}