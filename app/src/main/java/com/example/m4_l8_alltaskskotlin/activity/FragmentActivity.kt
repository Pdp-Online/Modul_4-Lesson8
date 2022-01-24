package com.example.m4_l8_alltaskskotlin.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.m4_l8_alltaskskotlin.R

class FragmentActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fragment)
    }
}