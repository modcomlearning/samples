package com.joseph.fb

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.FirebaseApp
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        FirebaseApp.initializeApp(this);
        // Database reference pointing to root of database
        val rootRef: DatabaseReference = FirebaseDatabase.getInstance().reference
        // Database reference pointing to demo node
        val demoRef: DatabaseReference = rootRef.child("details")

        btnSubmit.setOnClickListener {

            val userData: MutableMap<String, String> = HashMap()
            userData["Client_ID"] = tvID.text.toString()
            userData["Client_Phone"] = tvPhone.text.toString()
            userData["Client_Amount"] = tvAmount.text.toString()

            demoRef.child(tvID.text.toString()).setValue(userData)
        }

        btnData.setOnClickListener(View.OnClickListener {

            var i = Intent(this, ViewData::class.java)
            startActivity(i)
        });


    }
}