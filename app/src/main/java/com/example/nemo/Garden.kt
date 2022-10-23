package com.example.nemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Window
import android.widget.Button
import android.widget.TextView
import com.mikhaellopez.circularprogressbar.CircularProgressBar

class Garden : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        actionBarHide()
        statusBarColour()
        setContentView(R.layout.activity_garden)
        val gaugeText1: TextView = findViewById<TextView>(R.id.gaugeText1)
        gaugeText1.text = "65"
        val circularProgressBar1 = findViewById<CircularProgressBar>(R.id.Gauge1)
        circularProgressBar1.apply {
            // with animation
            setProgressWithAnimation(65f, 5000)// =1s

            // Set Progress Max
            progressMax = 100f
        }
        val gaugeText2: TextView = findViewById<TextView>(R.id.gaugeText2)
        gaugeText2.text = "65"
        val circularProgressBar2 = findViewById<CircularProgressBar>(R.id.Gauge2)
        circularProgressBar2.apply {
            // with animation
            setProgressWithAnimation(65f, 5000)// =1s

            // Set Progress Max
            progressMax = 100f
        }
        val gaugeText3: TextView = findViewById<TextView>(R.id.gaugeText3)
        gaugeText3.text = "65"
        val circularProgressBar3 = findViewById<CircularProgressBar>(R.id.Gauge3)
        circularProgressBar3.apply {
            // with animation
            setProgressWithAnimation(65f, 5000)// =1s

            // Set Progress Max
            progressMax = 100f
        }
        val gaugeText4: TextView = findViewById<TextView>(R.id.gaugeText4)
        gaugeText4.text = "65"
        val circularProgressBar4 = findViewById<CircularProgressBar>(R.id.Gauge4)
        circularProgressBar4.apply {
            // with animation
            setProgressWithAnimation(65f, 5000)// =1s

            // Set Progress Max
            progressMax = 100f
        }
        val gButton: Button = findViewById<Button>(R.id.gButton)
        gButton.alpha = 0f
        gButton.animate().alpha(1f).duration = 1500;
        gButton.translationY = 50F
        gButton.animate().alpha(1f).translationYBy(-50F).duration = 1000

        gButton.setOnClickListener {
            if (gButton.text == "ON") {
                gButton.text = "OFF"
            } else if (gButton.text == "OFF") {
                gButton.text = "ON"

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