package com.example.m4_l8_alltaskskotlin.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.m4_l8_alltaskskotlin.R
import com.example.m4_l8_alltaskskotlin.fragment.FragmentFirstTask2
import com.example.m4_l8_alltaskskotlin.fragment.FragmentSecondTask2
import com.example.m4_l8_alltaskskotlin.model.User

class SecondActivity : AppCompatActivity(), FragmentFirstTask2.FirstListener, FragmentSecondTask2.SecondListener {

    private lateinit var firstFragment :FragmentFirstTask2
    private lateinit var secondFragment :FragmentSecondTask2

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        initViews()
    }

    private fun initViews() {
        firstFragment = FragmentFirstTask2()
        secondFragment = FragmentSecondTask2()

        supportFragmentManager.beginTransaction()
            .replace(R.id.frame_task2_1, firstFragment)
            .replace(R.id.frame_task2_2, secondFragment)
            .commit()
    }

    override fun onSendFirst(user: User) {
        secondFragment.updateSecondText(user)
    }

    override fun onSecondSend(user: User) {
        firstFragment.updateFirstText(user)
    }
}