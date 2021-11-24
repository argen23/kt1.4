package com.example.kt14.adapters

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter

import androidx.fragment.app.FragmentActivity
import com.example.kt14.ui.FirstFragment
import com.example.kt14.ui.SecondFragment
import com.example.kt14.ui.ThirdFragment

class PagerAdapter(fragment: FragmentActivity) : FragmentStateAdapter(fragment) {

    override fun createFragment(position: Int): Fragment {
        when (position) {
            0 -> return FirstFragment()
            1 -> return SecondFragment()
            2 -> return ThirdFragment()
        }
      return FirstFragment()
    }

    override fun getItemCount(): Int {
        return 3
    }
}
