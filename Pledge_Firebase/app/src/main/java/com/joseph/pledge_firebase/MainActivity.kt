package com.joseph.pledge_firebase

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.google.firebase.FirebaseApp
import com.google.firebase.database.*
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        FirebaseApp.initializeApp(this) //initialize your app
        val rootref: DatabaseReference  = FirebaseDatabase.getInstance().reference //your db
        val demoref:  DatabaseReference = rootref.child("members") //table


            val postListener = object : ValueEventListener {
            override fun onDataChange(dataSnapshot: DataSnapshot) {

                if (dataSnapshot.exists()) {
                    data.text = ""
                    //show the data found in the Textview
                    for (singleSnapshot in dataSnapshot.children) {
                        //show data in Tetxview

                        data.append("Confirmed.  ${singleSnapshot.child("Name").getValue(String::class.java)} has pledged");
                        data.append(" ${singleSnapshot.child("Amount").getValue(String::class.java)} KES, Thank You!");
                        data.append("\n\n")

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
        }
        demoref.addValueEventListener(postListener)


        buttonpledge.setOnClickListener(View.OnClickListener {
            //save to firebase
            val userdata : MutableMap<String, String>  = HashMap()
            userdata["Name"] = editName.text.toString()
            userdata["IdNo"] = editId.text.toString()
            userdata["Amount"] = editAmount.text.toString()
            demoref.child(editId.text.toString()).setValue(userdata)
            //above setValue to your table
        });


    }
}