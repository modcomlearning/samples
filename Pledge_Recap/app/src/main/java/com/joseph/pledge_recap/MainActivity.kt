package com.joseph.pledge_recap

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.google.firebase.FirebaseApp
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        FirebaseApp.initializeApp(this);
        //database reference
        val rootref :DatabaseReference = FirebaseDatabase.getInstance().reference
        //reference a table
        val demoref : DatabaseReference = rootref.child("users")

        buttonpledge.setOnClickListener(View.OnClickListener {
            //set up firebase
            


        });


    }
}