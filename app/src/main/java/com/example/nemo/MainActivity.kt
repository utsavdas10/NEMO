package com.example.nemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Window
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        actionBarHide()
        statusBarColour()
        setContentView(R.layout.activity_main)

        val rooms : Button = findViewById<Button>(R.id.rooms)
        val door : Button = findViewById<Button>(R.id.door)
        val garden : Button = findViewById<Button>(R.id.garden)
        val waterTank : Button= findViewById<Button>(R.id.waterTank)


        rooms.setOnClickListener(){
            TODO()
        }
        door.setOnClickListener(){
            TODO()
        }
        garden.setOnClickListener(){
            TODO()
        }
        waterTank.setOnClickListener(){
            TODO()
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