package com.example.m4_l8_alltaskskotlin.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.m4_l8_alltaskskotlin.R
import com.example.m4_l8_alltaskskotlin.adapter.RecyclerAdapterPage1Task5
import com.example.m4_l8_alltaskskotlin.adapter.RecyclerAdapterPage3Task5
import com.example.m4_l8_alltaskskotlin.model.Contact
import com.example.m4_l8_alltaskskotlin.model.InstagramProfile

class PageThreeFragmentTask5 : Fragment() {

    private lateinit var rvPage3Task5: RecyclerView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_page_three_task5, container, false)
        initViews(view)
        return view
    }

    private fun initViews(view: View) {

        rvPage3Task5 = view.findViewById(R.id.rv_page_three_task5)
        rvPage3Task5.layoutManager = GridLayoutManager(context, 1)

        val instagramProfile = prepareInstagramProfile()
        refreshAdapter(instagramProfile)


    }

    private fun refreshAdapter(instagramProfile :List<InstagramProfile>) {
        val adapter = RecyclerAdapterPage3Task5(this, instagramProfile)
        rvPage3Task5.adapter = adapter
    }



    private fun prepareInstagramProfile():List<InstagramProfile> {
        val instagramProfile = ArrayList<InstagramProfile>()

        for (i in 0..29) {
            instagramProfile.add(InstagramProfile("Shercha", R.drawable.im_lion, 10589, "Tashkent", "Zo'rsan gap yo'q"))
        }

        return instagramProfile
    }

}