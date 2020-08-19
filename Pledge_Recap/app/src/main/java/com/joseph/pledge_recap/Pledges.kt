package com.joseph.pledge_recap

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.firebase.FirebaseApp
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase

class Pledges : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pledges)

        //get posted pledges from firebase
        FirebaseApp.initializeApp(this) //initialize your app
        val rootref: DatabaseReference = FirebaseDatabase.getInstance().reference //your db
        val demoref: DatabaseReference = rootref.child("members") //table

        //fetching the pledges


    }
}