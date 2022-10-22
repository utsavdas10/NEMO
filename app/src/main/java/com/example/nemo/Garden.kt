package com.example.nemo

import android.graphics.Color
import android.os.Bundle
import android.os.Handler
import android.view.Window
import android.widget.ProgressBar
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.mikhaellopez.circularprogressbar.CircularProgressBar


class Garden : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        actionBarHide()
        statusBarColour()
        setContentView(R.layout.activity_garden)

    }



    private fun statusBarColour() {
        window.statusBarColor = resources.getColor(R.color.bg)
    }
    private fun actionBarHide() {
        requestWindowFeature(Window.FEATURE_NO_TITLE)
        supportActionBar?.hide()
    }
}