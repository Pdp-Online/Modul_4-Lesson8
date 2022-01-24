package com.example.m4_l8_alltaskskotlin.adapter

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.m4_l8_alltaskskotlin.R
import com.example.m4_l8_alltaskskotlin.fragment.FragmentFirstTask3
import com.example.m4_l8_alltaskskotlin.fragment.PageOneFragmentTask5
import com.example.m4_l8_alltaskskotlin.fragment.PageThreeFragmentTask5
import com.example.m4_l8_alltaskskotlin.model.Contact
import com.example.m4_l8_alltaskskotlin.model.InstagramProfile

class RecyclerAdapterPage3Task5(private val context: PageThreeFragmentTask5, private val instagramProfile:List<InstagramProfile>) :
    RecyclerView.Adapter<RecyclerAdapterPage3Task5.ViewHolder>() {



    @SuppressLint("ResourceType")
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_instagram_pageone_task5, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val instagramProfile = instagramProfile[position]

        if (holder is ViewHolder) {
            holder.tvNick.text = instagramProfile.nick
            holder.tvNickBottom.text = instagramProfile.nick
            holder.tvView.text = instagramProfile.view.toString()
            holder.tvImage.setImageResource(instagramProfile.image)
            holder.tvLocation.text = instagramProfile.location
            holder.tvComment.text = instagramProfile.comment

            holder.apply {
                imgLike0.setOnClickListener{
                    imgLike0.visibility = View.GONE
                    imgLike1.visibility = View.VISIBLE
                }
                imgLike1.setOnClickListener {
                    imgLike0.visibility = View.VISIBLE
                    imgLike1.visibility = View.GONE
                }
            }
        }




    }

    override fun getItemCount(): Int {
        return instagramProfile.size
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val tvNick = itemView.findViewById<TextView>(R.id.tv_nick)
        val tvNickBottom = itemView.findViewById<TextView>(R.id.tv_nick_bottom)
        val tvView = itemView.findViewById<TextView>(R.id.tv_views)
        val tvImage = itemView.findViewById<ImageView>(R.id.img_post)
        val tvLocation = itemView.findViewById<TextView>(R.id.tv_location)
        val tvComment = itemView.findViewById<TextView>(R.id.tv_comment)
        val imgLike0 = itemView.findViewById<ImageView>(R.id.img_like_0)
        val imgLike1 = itemView.findViewById<ImageView>(R.id.img_like_1)


    }
}