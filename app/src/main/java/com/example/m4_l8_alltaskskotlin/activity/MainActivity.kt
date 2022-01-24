package com.example.m4_l8_alltaskskotlin.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.m4_l8_alltaskskotlin.R
import com.google.android.material.button.MaterialButton

class MainActivity : AppCompatActivity() {

    private lateinit var btn1 :MaterialButton
    private lateinit var btn2 :MaterialButton
    private lateinit var btn3 :MaterialButton
    private lateinit var btn4 :MaterialButton
    private lateinit var btn5 :MaterialButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initViews()
    }

    private fun initViews() {
        btn1 = findViewById(R.id.btn_task1)
        btn2 = findViewById(R.id.btn_task2)
        btn3 = findViewById(R.id.btn_task3)
        btn4 = findViewById(R.id.btn_task4)
        btn5 = findViewById(R.id.btn_task5)

        btn1.setOnClickListener {
            open1()
        }
        btn2.setOnClickListener {
            open2()
        }

        btn3.setOnClickListener {
            open3()
        }
        btn4.setOnClickListener {
            open4()
        }
        btn5.setOnClickListener {
            open5()
        }


    }

    private fun open1() {
        val intent = Intent(this, FirstActivity::class.java)
        startActivity(intent)

    }
    private fun open2() {
        val intent = Intent(this, SecondActivity::class.java)
        startActivity(intent)
    }


    private fun open3() {
        val intent = Intent(this, ThirdActivity::class.java)
        startActivity(intent)
    }

    private fun open4() {
        val intent = Intent(this, FourthActivity::class.java)
        startActivity(intent)
    }

    private fun open5() {
        val intent = Intent(this, FifthActivity::class.java)
        startActivity(intent)
    }



}