package com.joseph.pledge_recap

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.firebase.FirebaseApp
import com.google.firebase.database.*
import kotlinx.android.synthetic.main.activity_pledges.*

class Pledges : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pledges)

        //get posted pledges from firebase
        FirebaseApp.initializeApp(this) //initialize your app
        val rootref: DatabaseReference = FirebaseDatabase.getInstance().reference //your db
        val demoref: DatabaseReference = rootref.child("members") //table

        //fetching the pledges
        val listener = object: ValueEventListener{
            override fun onCancelled(error: DatabaseError) {
                   tvpledges.setText("Database Error!")

            }

            override fun onDataChange(snapshot: DataSnapshot) {
                //snapshot has the data
                if (snapshot.exists()){
                    //okay, snapshot has the colmns,
                    for (singleSnapshot in snapshot.children){
                        tvpledges.append("Confirmed : ${singleSnapshot.child("Name")} has pledged. ")
                        tvpledges.append("KES : ${singleSnapshot.child("Amount")}.")
                        tvpledges.append("\n\n")
                    }//end for
                }

                else {
                      tvpledges.setText("Error, Not Data")
                }

            }//end snapshot

        }//end of listener
        demoref.addValueEventListener(listener) //end




    }
}