package com.example.m4_l8_alltaskskotlin.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.ViewPager
import com.example.demokotlinproject.adapter.ViewPagerAdapterTask4
import com.example.m4_l8_alltaskskotlin.R
import com.example.m4_l8_alltaskskotlin.fragment.*
import com.google.android.material.tabs.TabLayout

class FifthActivity : AppCompatActivity() {

    private var viewPagerAdapter: ViewPagerAdapterTask4? = null
    private var viewPager: ViewPager? = null
    private var tabLayout: TabLayout? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fifth)
        initViews()
    }

    fun initViews() {
        viewPager = findViewById(R.id.viewPager_task5)
        // setting up the adapter
        viewPagerAdapter = ViewPagerAdapterTask4(supportFragmentManager)
        // add the fragments
        viewPagerAdapter!!.add(PageOneFragmentTask5(), "Contacts")
        viewPagerAdapter!!.add(PageTwoFragmentTask5(), "Users")
        viewPagerAdapter!!.add(PageThreeFragmentTask5(), "Posts")
        // Set the adapter
        viewPager!!.setAdapter(viewPagerAdapter)
        // The Page (fragment) titles will be displayed in the
        // tabLayout hence we need to  set the page viewer
        // we use the setupWithViewPager().
        tabLayout = findViewById(R.id.tab_layout_task5)
        tabLayout!!.setupWithViewPager(viewPager)
    }
}