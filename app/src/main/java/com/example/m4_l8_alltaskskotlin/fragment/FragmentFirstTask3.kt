package com.example.m4_l8_alltaskskotlin.fragment

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.m4_l8_alltaskskotlin.R
import com.example.m4_l8_alltaskskotlin.adapter.RecyclerAdapterTask3
import com.example.m4_l8_alltaskskotlin.model.Contact
import java.lang.RuntimeException


class FragmentFirstTask3 : Fragment() {

    private lateinit var rvTask3: RecyclerView

    private var listener:Listener? = null



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_first_task3, container, false)
        initViews(view)
        return view
    }

    private fun initViews(view: View) {

        rvTask3 = view.findViewById(R.id.rv_fragment_first)
        rvTask3.layoutManager = GridLayoutManager(context, 1)

        val contact = prepareContact()
        refreshAdapter(contact)

    }



    private fun refreshAdapter(contact: List<Contact>) {
        val adapter = RecyclerAdapterTask3(this, contact)
        rvTask3.adapter = adapter
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


    fun getDataContact(contact: Contact) {
        listener!!.onSendContact(contact)
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        if (context is Listener) {
            listener = context
        }else {
            throw RuntimeException("$context must implementation Listener")
        }
    }

    override fun onDetach() {
        super.onDetach()
        listener
    }

    interface Listener {
        fun onSendContact(contact: Contact)
    }




}