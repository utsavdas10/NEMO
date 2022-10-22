package com.example.nemo


import android.os.Bundle
import android.view.View
import android.view.Window
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.mikhaellopez.circularprogressbar.CircularProgressBar

class Rooms : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        actionBarHide()
        statusBarColour()
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rooms)

        val gaugeText : TextView = findViewById<TextView>(R.id.gaugeText)
        gaugeText.setText("65")
        val circularProgressBar = findViewById<CircularProgressBar>(R.id.Gauge1)
        circularProgressBar.apply {
            // with animation
            setProgressWithAnimation(65f, 5000)// =1s

            // Set Progress Max
            progressMax = 100f
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