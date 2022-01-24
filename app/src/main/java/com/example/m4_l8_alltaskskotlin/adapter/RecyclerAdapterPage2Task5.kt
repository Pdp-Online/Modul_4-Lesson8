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
import com.example.m4_l8_alltaskskotlin.fragment.PageTwoFragmentTask5
import com.example.m4_l8_alltaskskotlin.model.Contact
import com.example.m4_l8_alltaskskotlin.model.UserTask5

class RecyclerAdapterPage2Task5(private val context: PageTwoFragmentTask5, private val userTask5:List<UserTask5>) :
    RecyclerView.Adapter<RecyclerAdapterPage2Task5.ViewHolder>() {



    @SuppressLint("ResourceType")
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_user_task5, parent, false)
        return ViewHolder(view)

    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val userTask5 = userTask5[position]

        holder.tvName.text = userTask5.name
        holder.tvNumber.text = userTask5.number

    }

    override fun getItemCount(): Int {
        return userTask5.size
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val tvName = itemView.findViewById<TextView>(R.id.tv_name)
        val tvNumber = itemView.findViewById<TextView>(R.id.tv_number)

    }
}