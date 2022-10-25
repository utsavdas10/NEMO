package com.example.nemo.Fragments

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.core.content.ContextCompat
import com.example.nemo.R
import com.github.mikephil.charting.charts.LineChart
import com.github.mikephil.charting.components.XAxis
import com.github.mikephil.charting.data.Entry
import com.github.mikephil.charting.data.LineData
import com.github.mikephil.charting.data.LineDataSet
import com.github.mikephil.charting.interfaces.datasets.ILineDataSet
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
        room1gauge1text1.animate().alpha(1f).duration = 2000;
        room1gauge1text1.translationY = -120F
        room1gauge1text1.animate().alpha(1f).translationYBy(120F).duration = 1800

        room1gauge1text2.alpha = 0f
        room1gauge1text2.animate().alpha(1f).duration = 2000;
        room1gauge1text2.translationY = 120F
        room1gauge1text2.animate().alpha(1f).translationYBy(-120F).duration = 1800

        room1gauge2text1.alpha = 0f
        room1gauge2text1.animate().alpha(1f).duration = 2000;
        room1gauge2text1.translationY = -120F
        room1gauge2text1.animate().alpha(1f).translationYBy(120F).duration = 1800

        room1gauge2text2.alpha = 0f
        room1gauge2text2.animate().alpha(1f).duration = 2000;
        room1gauge2text2.translationY = 120F
        room1gauge2text2.animate().alpha(1f).translationYBy(-120F).duration = 1800


        val lineChart : LineChart = view.findViewById(R.id.lineChart)
        val lineDataSet : LineDataSet = LineDataSet(lineChartDataSet(), "Temperature")
        val iLineDataSet : ArrayList<ILineDataSet> = ArrayList<ILineDataSet>()
        iLineDataSet.add(lineDataSet)

        val lineData : LineData = LineData(iLineDataSet)
        lineChart.data = lineData
        lineChart.invalidate()
        lineChart.legend.isEnabled = false

        lineChart.xAxis.apply {
            setDrawGridLines(false)
            axisMinimum = -0.5f
            axisMaximum = 7.5f
            position = XAxis.XAxisPosition.BOTTOM
            textSize = 10f
            textColor = context?.let { ContextCompat.getColor(it, R.color.teal_200) }!!
            axisLineColor = context?.let { ContextCompat.getColor(it, R.color.teal_200) }!!
        }
        lineChart.axisLeft.apply {
            isEnabled = true
            setDrawGridLines(false)
            axisMinimum = 15f
            axisMaximum = 40f
            textSize = 10f
            textColor = context?.let { ContextCompat.getColor(it, R.color.teal_200) }!!
            axisLineColor = context?.let { ContextCompat.getColor(it, R.color.teal_200) }!!
        }
        lineChart.axisRight.apply {
            isEnabled = false
        }
        lineDataSet.apply {
            color = context?.let { ContextCompat.getColor(it, R.color.teal_200) }!!
            valueTextColor = context?.let { ContextCompat.getColor(it, R.color.teal_200) }!!
            lineWidth = 4f
            setDrawCircles(false)
            setDrawHighlightIndicators(false)
            mode = LineDataSet.Mode.HORIZONTAL_BEZIER
            setDrawFilled(true)
            fillDrawable = context?.let { ContextCompat.getDrawable(it, R.drawable.bg_line) }!!
        }
    }
    private fun lineChartDataSet() : ArrayList<Entry>
    {
        val dataSet = ArrayList<Entry>()
        dataSet.add(Entry(0f,20f))
        dataSet.add(Entry(1f,22f))
        dataSet.add(Entry(2f,30f))
        dataSet.add(Entry(3f,28f))
        dataSet.add(Entry(4f,25f))
        dataSet.add(Entry(5f,32f))
        dataSet.add(Entry(6f,35f))
        dataSet.add(Entry(7f,27f))

        return dataSet
    }
}