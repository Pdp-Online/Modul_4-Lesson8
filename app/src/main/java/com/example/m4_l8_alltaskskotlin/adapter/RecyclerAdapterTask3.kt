package com.example.m4_l8_alltaskskotlin.adapter

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.m4_l8_alltaskskotlin.R
import com.example.m4_l8_alltaskskotlin.fragment.FragmentFirstTask3
import com.example.m4_l8_alltaskskotlin.fragment.PageOneFragmentTask5
import com.example.m4_l8_alltaskskotlin.model.Contact

class RecyclerAdapterTask3(private val context: FragmentFirstTask3, private val contacts:List<Contact>) :
    RecyclerView.Adapter<RecyclerAdapterTask3.ViewHolder>() {



    @SuppressLint("ResourceType")
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_contact_task3, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val contact = contacts[position]

        holder.tvName.text = contact.name
        holder.tvNumber.text = contact.number
        holder.llClick.setOnClickListener {
            context.getDataContact(contact)
        }


    }

    override fun getItemCount(): Int {
        return contacts.size
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val tvName = itemView.findViewById<TextView>(R.id.tv_item_name)
        val tvNumber = itemView.findViewById<TextView>(R.id.tv_item_number)
        val llClick = itemView.findViewById<LinearLayout>(R.id.ll_click)

    }
}