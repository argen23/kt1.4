package com.example.kt14.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import androidx.viewpager2.widget.ViewPager2
import com.example.kt14.adapters.PagerAdapter
import com.example.kt14.R
import com.example.kt14.databinding.ActivityMainBinding
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {

    val tabs : Array<String> = arrayOf("+ - ","LiveData" , "history")

    private lateinit var binding: ActivityMainBinding

    private lateinit var viewPager: ViewPager2
    private lateinit var viewModel: MainViewModel
    private lateinit var tabLayout: TabLayout
    private lateinit var first: FirstFragment

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        viewModel = ViewModelProvider(this).get(MainViewModel::class.java)

        viewPager = findViewById(R.id.viewPager)

        viewPager.adapter = PagerAdapter(this)

        tabLayout = findViewById(R.id.tabs)
            TabLayoutMediator(tabLayout, viewPager) { tab, position ->
                tab.text = tabs[position]
            }.attach()

    }

}