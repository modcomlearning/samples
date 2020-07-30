package com.joseph.healthawareness

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_hospitals.*

class Hospitals : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hospitals)
         //create an array of hospitals
        val hospitals = arrayOf<String> ("KNH","Mater","Nairobi Hosipital","Meridian","Mediheal","Kiambu")

        //you need an adapter, observe below thjta we pass the 'hospitals' array above to the adapter , towards the end of below line
        val arrayAdapter  = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, hospitals)

        //set the adapter on line 16 to your listview
        listhosi.adapter  = arrayAdapter

    }
}