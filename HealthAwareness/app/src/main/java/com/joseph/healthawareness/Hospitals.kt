package com.joseph.healthawareness

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_hospitals.*

class Hospitals : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hospitals)

        val hospitals = arrayOf<String> ("KNH","Mater","Nairobi Hosipital","Meridian","Mediheal","Kiambu")

        //you need an adapter
        //android.R.layout.simple_list_item_1     is an android internal layout for basic lists
        val arrayAdapter  = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, hospitals)

        //put this adapter to your list
       listhosi.adapter  = arrayAdapter

        //DONE
    }
}