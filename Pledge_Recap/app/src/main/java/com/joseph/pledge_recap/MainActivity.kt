package com.joseph.pledge_recap

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.google.firebase.FirebaseApp
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        FirebaseApp.initializeApp(this) //initialize your app
        val rootref: DatabaseReference  = FirebaseDatabase.getInstance().reference //your db
        val demoref:  DatabaseReference = rootref.child("members") //table


        //button to link to another

        buttonpledge.setOnClickListener(View.OnClickListener {
            //set up firebase
            //Put your editexts texts, in a hashmap
            val userData: MutableMap<String, String> = HashMap();
            userData["Id"]  = editId.text.toString()
            userData["Name"]  = editName.text.toString()
            userData["Amount"]  = editAmount.text.toString()

            //save them to demoref
            //child(editId.text.toString()) below specifies the PK
            demoref.child(editId.text.toString()).setValue(userData) //Done
            Toast.makeText(this, "Saved", Toast.LENGTH_SHORT).show()

        });


    }
}