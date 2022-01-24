package com.example.m4_l8_alltaskskotlin.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.m4_l8_alltaskskotlin.R
import com.example.m4_l8_alltaskskotlin.adapter.RecyclerAdapterPage2Task5
import com.example.m4_l8_alltaskskotlin.adapter.RecyclerAdapterPage3Task5
import com.example.m4_l8_alltaskskotlin.model.InstagramProfile
import com.example.m4_l8_alltaskskotlin.model.UserTask5

class PageTwoFragmentTask5 : Fragment() {

    private lateinit var rvPage2Task5: RecyclerView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_page_two_task5, container, false)
        initViews(view)
        return view
    }

    private fun initViews(view: View) {

        rvPage2Task5 = view.findViewById(R.id.rv_page_two_task5)
        rvPage2Task5.layoutManager = GridLayoutManager(context, 1)

        val userTask5 = prepareUser()
        refreshAdapter(userTask5)


    }

    private fun refreshAdapter(userTask5 :List<UserTask5>) {
        val adapter = RecyclerAdapterPage2Task5(this, userTask5)
        rvPage2Task5.adapter = adapter
    }



    private fun prepareUser():List<UserTask5> {
        val userTask5 = ArrayList<UserTask5>()

        for (i in 0..29) {
            userTask5.add(UserTask5("Shahriyor", "+998994216148"))

        }

        return userTask5
    }

}