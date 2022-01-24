package com.example.m4_l8_alltaskskotlin.activity

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.m4_l8_alltaskskotlin.R
import com.example.m4_l8_alltaskskotlin.adapter.RecyclerAdapterTask3
import com.example.m4_l8_alltaskskotlin.fragment.FragmentFirstTask3
import com.example.m4_l8_alltaskskotlin.fragment.FragmentSecondTask3
import com.example.m4_l8_alltaskskotlin.model.Contact

class ThirdActivity : AppCompatActivity(), FragmentFirstTask3.Listener{



    private lateinit var fragmentFirstTask3 :FragmentFirstTask3
    private lateinit var fragmentSecondTask3 :FragmentSecondTask3



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)

        initViews()


    }

    private fun initViews() {
        fragmentFirstTask3 = FragmentFirstTask3()
        fragmentSecondTask3 = FragmentSecondTask3()


        supportFragmentManager.beginTransaction()
            .replace(R.id.frame_task3_1, fragmentFirstTask3)
            .replace(R.id.frame_task3_2, fragmentSecondTask3)
            .commit()


    }

    override fun onSendContact(contact: Contact) {
        fragmentSecondTask3.updateText(contact)
    }






}