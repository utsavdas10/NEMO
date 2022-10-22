package com.example.nemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Window

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