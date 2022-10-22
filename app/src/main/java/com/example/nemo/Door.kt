package com.example.nemo

import android.os.Bundle
import android.view.MotionEvent
import android.view.Window
import android.widget.Button
import android.widget.MediaController
import android.widget.Toast
import android.widget.VideoView
import androidx.appcompat.app.AppCompatActivity

class Door : AppCompatActivity() {
    private var vView: VideoView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        actionBarHide()
        statusBarColour()
        setContentView(R.layout.activity_door)
        val vView = findViewById<VideoView>(R.id.videoView)
        vView.setVideoPath("android.resource://" + packageName + "/" + R.raw.clip)
        val mediaController = MediaController(this)
        vView.setMediaController(mediaController)
        mediaController.setAnchorView(vView)
        val dButton : Button = findViewById<Button>(R.id.WaterButton)

        dButton.setOnTouchListener { v, event ->
            val action = event.action
            when(action){

                MotionEvent.ACTION_DOWN -> {
                    vView?.start()
                }
                MotionEvent.ACTION_UP -> {
                    vView.stopPlayback()
                }
            }
            true
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