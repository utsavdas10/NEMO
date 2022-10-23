package com.example.nemo.Adapter

import android.content.Context
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.nemo.Fragments.Room1
import com.example.nemo.Fragments.Room2

internal class MyAdapter(var context : Context, fm : FragmentManager, var totalTabs: Int ): FragmentPagerAdapter(fm) {
    override fun getCount(): Int {
        return totalTabs
    }

    override fun getItem(position: Int): Fragment {
        return when(position){
            0 -> {
                Room1()
            }
            1 -> {
                Room2()
            }
            else -> getItem(position)
        }
    }
}