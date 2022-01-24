package com.example.m4_l8_alltaskskotlin.fragment

import android.content.Context
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import com.example.m4_l8_alltaskskotlin.R
import com.example.m4_l8_alltaskskotlin.model.User
import java.lang.RuntimeException


class FragmentSecond : Fragment() {

    private var listener: SecondListener? = null
    private var tvSecond:TextView? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_second, container, false)
        initViews(view)
        return view
    }

    private fun initViews(view: View) {
        tvSecond = view.findViewById(R.id.tv_second_frag)
        val btnSecond = view.findViewById<Button>(R.id.btn_second_frag)


        btnSecond.setOnClickListener {
            listener!!.onSecondSend("Valaykum assalom")
        }


    }

    fun updateSecondText(text: String) {
        tvSecond!!.text = text
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        if (context is SecondListener) {
            listener = context
        } else {
            throw RuntimeException("$context must implementation SecondListener")
        }
    }

    override fun onDetach() {
        super.onDetach()
        listener = null
    }


    interface SecondListener{
        fun onSecondSend(text: String)
    }



}