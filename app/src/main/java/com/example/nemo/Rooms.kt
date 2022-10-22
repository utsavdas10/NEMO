package com.example.nemo


import android.os.Bundle
import android.view.View
import android.view.Window
import androidx.appcompat.app.AppCompatActivity


class Rooms : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        actionBarHide()
        statusBarColour()
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rooms)

    }

    private fun statusBarColour() {
        window.statusBarColor = resources.getColor(R.color.bg)
    }
    private fun actionBarHide() {
        requestWindowFeature(Window.FEATURE_NO_TITLE)
        supportActionBar?.hide()
    }
}