package com.example.nemo.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.nemo.R
import com.mikhaellopez.circularprogressbar.CircularProgressBar

class Room2 : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_room2, container, false)
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val room2gauge1text1: TextView = view.findViewById(R.id.room2gauge1Text1) as TextView
        room2gauge1text1.text = "78"
        val room2gauge1 = view.findViewById<CircularProgressBar>(R.id.Room2Gauge1)
        room2gauge1.apply {
            // with animation
            setProgressWithAnimation(78f, 5000)// =1s

            // Set Progress Max
            progressMax = 100f

        }
        val room2gauge2text1: TextView = view.findViewById(R.id.room2gauge2Text1) as TextView
        room2gauge2text1.text = "34°"
        val room2gauge2 = view.findViewById<CircularProgressBar>(R.id.Room2Gauge2)
        room2gauge2.apply {
            // with animation
            setProgressWithAnimation(34f, 5000)// =1s

            // Set Progress Max
            progressMax = 100f
        }
    }
}