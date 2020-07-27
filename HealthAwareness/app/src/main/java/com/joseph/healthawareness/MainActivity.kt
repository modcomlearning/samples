package com.joseph.healthawareness

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //Find the 3 buttons and set listeners


        buttonabout.setOnClickListener(View.OnClickListener {
             //link/intent
            //i now have an activity for about
            val i  = Intent(this, About::class.java)
            startActivity(i) //explicit intent

        });

        buttonsymptoms.setOnClickListener(View.OnClickListener {
            //link/intent
            val i  = Intent(this, Symptoms::class.java)
            startActivity(i)
        });

        buttonprevention.setOnClickListener(View.OnClickListener {
            //link/intent  explicit
            val i  = Intent(this, Prevention::class.java)
            startActivity(i)
        });



        buttonwho.setOnClickListener(View.OnClickListener {

            //implicit
            val i = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.who.int/emergencies/diseases/novel-coronavirus-2019?gclid=CjwKCAjw9vn4BRBaEiwAh0muDLDtO5rRnLrMB9fKOIDZi91-d2lM4f-YGbPyCka5n0x9_CIDLRHuphoCJ0kQAvD_BwE"))
            startActivity(i)
        });


        buttoncall.setOnClickListener(View.OnClickListener {
            val i = Intent(Intent.ACTION_DIAL, Uri.parse("tel: 911"))
            startActivity(i)
            //implicit intent to connect to google map, camera, contacts.
        });


    }
}