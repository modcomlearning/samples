package com.joseph.fb

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.FirebaseApp
import com.google.firebase.database.*
import kotlinx.android.synthetic.main.activity_view_data.*


class ViewData : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_data)

        FirebaseApp.initializeApp(this);
        // Database reference pointing to root of database
        val rootRef: DatabaseReference = FirebaseDatabase.getInstance().reference
        // Database reference pointing to demo node
        val demoRef: DatabaseReference = rootRef.child("details")

        demoRef.addListenerForSingleValueEvent(object : ValueEventListener {

            override fun onDataChange(dataSnapshot: DataSnapshot) {

                if (dataSnapshot.exists()) {
                    //show the data found in the Textview
                    for (singleSnapshot in dataSnapshot.children) {
                        //show data in Tetxview
                        data.append(
                            "ID: ${singleSnapshot.child("Client_ID").getValue(String::class.java)}\n\n Phone: ${singleSnapshot.child("Client_Phone")
                                .getValue(
                                    String::class.java
                                )}\n\n Amount: ${singleSnapshot.child("Client_Amount").getValue(
                                String::class.java
                            )}"
                        )
                    }
                } else {
                    //display Toast, No data
                    data.setText("No data! Try Again")
                }
            }

            override fun onCancelled(databaseError: DatabaseError) {
                Toast.makeText(applicationContext, "Error fetching data", Toast.LENGTH_LONG)
                    .show()
            }
        })

    }
}