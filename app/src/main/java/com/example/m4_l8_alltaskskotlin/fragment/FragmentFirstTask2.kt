package com.example.m4_l8_alltaskskotlin.fragment

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import com.example.m4_l8_alltaskskotlin.R
import com.example.m4_l8_alltaskskotlin.model.Contact
import com.example.m4_l8_alltaskskotlin.model.User
import java.lang.RuntimeException


class FragmentFirstTask2 : Fragment() {

    private var listener:FirstListener? = null
    private var tvObject:TextView? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_first_task2, container, false)
        initViews(view)
        return view
    }

    private fun initViews(view: View) {
        tvObject = view.findViewById(R.id.tv_first_frag_task2)
        val btnSend = view.findViewById<Button>(R.id.btn_first_frag_task2)
        btnSend.setOnClickListener {
            listener!!.onSendFirst(User("Shahriyor", "Abdullayev", "+998994216148"))
        }

    }

    fun updateFirstText(user: User) {
        tvObject!!.text = user.toString()
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        if (context is FirstListener) {
            listener = context
        }else{
            throw RuntimeException("$context must implementation FirstListener")
        }
    }

    override fun onDetach() {
        super.onDetach()
        listener
    }



    interface FirstListener{
        fun onSendFirst(user:User)
    }

}