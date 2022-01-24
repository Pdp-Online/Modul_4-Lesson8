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


class FragmentFirst : Fragment() {

    private var listener: FirstListener? = null
    var tvFirst:TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_first, container, false)
        initViews(view)
        return view
    }


    private fun initViews(view: View) {
        tvFirst = view.findViewById(R.id.tv_first_frag)
        val btnFirst = view.findViewById<Button>(R.id.btn_first_frag)





        btnFirst.setOnClickListener {
            listener!!.onFirstSend("Assalomu alaykum")
        }

    }

    fun updateFirstText(text: String) {
        tvFirst!!.text = text
    }


    override fun onAttach(context: Context) {
        super.onAttach(context)
        if (context is FirstListener) {
            listener = context
        } else{
            throw RuntimeException("$context must implementation FirstListener")
        }

    }

    override fun onDetach() {
        super.onDetach()
        listener = null
    }

    interface FirstListener {
        fun onFirstSend(text :String)
    }

}