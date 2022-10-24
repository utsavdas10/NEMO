package com.example.nemo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Window
import android.widget.Button
import android.widget.TextView

public class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        actionBarHide()
        statusBarColour()
        setContentView(R.layout.activity_main)

        val heading : TextView = findViewById(R.id.Heading)
        val rooms : Button = findViewById<Button>(R.id.rooms)
        val door : Button = findViewById<Button>(R.id.door)
        val garden : Button = findViewById<Button>(R.id.garden)
        val waterTank : Button= findViewById<Button>(R.id.waterTank)

        heading.alpha = 0f
        heading.animate().alpha(1f).duration = 1500;
        heading.translationY = -150F
        heading.animate().alpha(1f).translationYBy(150F).duration = 1500

        rooms.alpha = 0f
        rooms.animate().alpha(1f).duration = 1500;
        rooms.translationY = 50F
        rooms.animate().alpha(1f).translationYBy(-50F).duration = 1000

        door.alpha = 0f
        door.animate().alpha(1f).duration = 1500;
        door.translationY = 50F
        door.animate().alpha(1f).translationYBy(-50F).duration = 1000

        garden.alpha = 0f
        garden.animate().alpha(1f).duration = 1500;
        garden.translationY = 50F
        garden.animate().alpha(1f).translationYBy(-50F).duration = 1000

        waterTank.alpha = 0f
        waterTank.animate().alpha(1f).duration = 1500;
        waterTank.translationY = 50F
        waterTank.animate().alpha(1f).translationYBy(-50F).duration = 1000

        rooms.setOnClickListener(){
            val intent = Intent(this, Rooms::class.java)
            startActivity(intent)
        }
        door.setOnClickListener(){
            val intent = Intent(this, Door::class.java)
            startActivity(intent)
        }
        garden.setOnClickListener(){
            val intent = Intent(this, Garden::class.java)
            startActivity(intent)
        }
        waterTank.setOnClickListener(){
            val intent = Intent(this, WaterTank::class.java)
            startActivity(intent)
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
