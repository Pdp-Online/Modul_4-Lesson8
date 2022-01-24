package com.example.m4_l8_alltaskskotlin.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.ViewPager
import com.example.demokotlinproject.adapter.ViewPagerAdapterTask4
import com.example.m4_l8_alltaskskotlin.R
import com.example.m4_l8_alltaskskotlin.fragment.PageOneFragmentTask4
import com.example.m4_l8_alltaskskotlin.fragment.PageTwoFragmentTask4
import com.google.android.material.tabs.TabLayout

class FourthActivity : AppCompatActivity() {

    private var viewPagerAdapter: ViewPagerAdapterTask4? = null
    private var viewPager: ViewPager? = null
    private var tabLayout: TabLayout? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fourth)
        initViews()
    }

    fun initViews() {
        viewPager = findViewById(R.id.viewPager)
        // setting up the adapter
        viewPagerAdapter = ViewPagerAdapterTask4(supportFragmentManager)
        // add the fragments
        viewPagerAdapter!!.add(PageOneFragmentTask4(), "Flowers")
        viewPagerAdapter!!.add(PageTwoFragmentTask4(), "Animals")
        // Set the adapter
        viewPager!!.setAdapter(viewPagerAdapter)
        // The Page (fragment) titles will be displayed in the
        // tabLayout hence we need to  set the page viewer
        // we use the setupWithViewPager().
        tabLayout = findViewById(R.id.tab_layout)
        tabLayout!!.setupWithViewPager(viewPager)
    }
}