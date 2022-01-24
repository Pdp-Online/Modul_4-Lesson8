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
import com.example.m4_l8_alltaskskotlin.adapter.RecyclerAdapterTask3
import com.example.m4_l8_alltaskskotlin.model.Contact

class PageOneFragmentTask5 : Fragment() {

    private lateinit var rvPage1Task5: RecyclerView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_page_one_task5, container, false)
        initViews(view)
        return view
    }

    private fun initViews(view: View) {

        rvPage1Task5 = view.findViewById(R.id.rv_page_one_task5)
        rvPage1Task5.layoutManager = GridLayoutManager(context, 1)

        val contacts = prepareContact()
        refreshAdapter(contacts)


    }

    private fun refreshAdapter(contacts :List<Contact>) {
        val adapter = RecyclerAdapterPage1Task5(this, contacts)
        rvPage1Task5.adapter = adapter
    }



    private fun prepareContact():List<Contact> {
        val contact = ArrayList<Contact>()

        for (i in 0..29) {
            contact.add(Contact("Shahriyor", "+998994216148"))
            contact.add(Contact("Diyorbek", "+998995472665"))
            contact.add(Contact("Sardor", "+998992586314"))
            contact.add(Contact("Siroj", "+998993517823"))
            contact.add(Contact("Bilol", "+998997892639"))
            contact.add(Contact("Asadbek", "+998997514259"))
        }

        return contact
    }


}