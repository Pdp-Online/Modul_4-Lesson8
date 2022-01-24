package com.example.m4_l8_alltaskskotlin.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.m4_l8_alltaskskotlin.R
import com.example.m4_l8_alltaskskotlin.fragment.FragmentFirst
import com.example.m4_l8_alltaskskotlin.fragment.FragmentSecond
import com.example.m4_l8_alltaskskotlin.model.User

class FirstActivity : AppCompatActivity(), FragmentFirst.FirstListener,
    FragmentSecond.SecondListener{

    private lateinit var firstFragment: FragmentFirst
    private lateinit var secondFragment: FragmentSecond

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first)
        initViews()

    }

    private fun initViews() {


        firstFragment = FragmentFirst()
        secondFragment = FragmentSecond()

        supportFragmentManager.beginTransaction()
            .replace(R.id.frame_1, firstFragment)
            .replace(R.id.frame_2, secondFragment)
            .commit()

    }



    override fun onFirstSend(text: String) {
        secondFragment.updateSecondText(text)
    }

    override fun onSecondSend(text: String) {
        firstFragment.updateFirstText(text)
    }






    }