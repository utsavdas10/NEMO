package com.example.nemo.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.nemo.R
import com.mikhaellopez.circularprogressbar.CircularProgressBar

class Room1 : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_room1, container, false)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val room1gauge1text2 :TextView = view.findViewById(R.id.room1gauge1Text2) as TextView
        val room1gauge2text2 :TextView = view.findViewById(R.id.room1gauge2Text2) as TextView

        val room1gauge1text1: TextView = view.findViewById(R.id.room1gauge1Text1) as TextView
        room1gauge1text1.text = "65"
        val room1gauge1 = view.findViewById<CircularProgressBar>(R.id.Room1Gauge1)
        room1gauge1.apply {
            // with animation
            setProgressWithAnimation(65f, 4000)// =1s

            // Set Progress Max
            progressMax = 100f

        }
        val room1gauge2text1: TextView = view.findViewById(R.id.room1gauge2Text1) as TextView
        room1gauge2text1.text = "32°"
        val room1gauge2 = view.findViewById<CircularProgressBar>(R.id.Room1Gauge2)
        room1gauge2.apply {
            // with animation
            setProgressWithAnimation(32f, 4000)// =1s

            // Set Progress Max
            progressMax = 100f
        }

        room1gauge1text1.alpha = 0f
        room1gauge1text1.animate().alpha(1f).duration = 3000;
        room1gauge1text1.translationY = -120F
        room1gauge1text1.animate().alpha(1f).translationYBy(120F).duration = 1800

        room1gauge1text2.alpha = 0f
        room1gauge1text2.animate().alpha(1f).duration = 3000;
        room1gauge1text2.translationY = 120F
        room1gauge1text2.animate().alpha(1f).translationYBy(-120F).duration = 1800

        room1gauge2text1.alpha = 0f
        room1gauge2text1.animate().alpha(1f).duration = 3000;
        room1gauge2text1.translationY = -120F
        room1gauge2text1.animate().alpha(1f).translationYBy(120F).duration = 1800

        room1gauge2text2.alpha = 0f
        room1gauge2text2.animate().alpha(1f).duration = 3000;
        room1gauge2text2.translationY = 120F
        room1gauge2text2.animate().alpha(1f).translationYBy(-120F).duration = 1800
    }
}