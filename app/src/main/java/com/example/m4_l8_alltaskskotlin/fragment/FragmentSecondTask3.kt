package com.example.m4_l8_alltaskskotlin.fragment

import android.content.Intent
import android.media.Image
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.example.m4_l8_alltaskskotlin.R
import com.example.m4_l8_alltaskskotlin.model.Contact

class FragmentSecondTask3 : Fragment() {
    private lateinit var tvFragmentName:TextView
    private lateinit var tvFragmentNumber:TextView
    private lateinit var imgCall:ImageView
    private lateinit var imgSms:ImageView
    private lateinit var imgRemove:ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_second_task3, container, false)
        initViews(view)
        return view
    }

    private fun initViews(view: View) {
        tvFragmentName = view.findViewById(R.id.tv_fragment_name)
        tvFragmentNumber = view.findViewById(R.id.tv_fragment_number)

        imgCall = view.findViewById(R.id.img_call)
        imgSms = view.findViewById(R.id.img_sms)
        imgRemove = view.findViewById(R.id.img_remove)

        imgCall.setOnClickListener{
            val intent =  Intent(Intent.ACTION_DIAL)
            intent.data = Uri.parse("tel:" + tvFragmentNumber.text)
            startActivity(intent)
        }

        imgSms.setOnClickListener {
            val smsIntent = Intent(Intent.ACTION_VIEW, Uri.fromParts("sms", tvFragmentNumber.text.toString(), null));
            smsIntent.putExtra("sms_body","");
            startActivity(smsIntent)
        }

        imgRemove.setOnClickListener {
            tvFragmentNumber.text = ""
            tvFragmentName.text = ""
        }

    }

    fun updateText(contanct: Contact) {
        tvFragmentName.text = contanct.name
        tvFragmentNumber.text = contanct.number
    }




}