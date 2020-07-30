package com.joseph.healthawareness

import android.Manifest
import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import androidx.core.content.ContextCompat
import kotlinx.android.synthetic.main.activity_main.*



class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //Find the 3 buttons and set listeners


        buttonabout.setOnClickListener(View.OnClickListener {
             //link/intent
            //i now have an activity for about
            //Link to About class
            val i  = Intent(this, About::class.java)
            startActivity(i) //explicit intent

        });

        buttonsymptoms.setOnClickListener(View.OnClickListener {
            //link/intent
            //Link to Symptoms class
            val i  = Intent(this, Symptoms::class.java)
            startActivity(i)
        });

        buttonprevention.setOnClickListener(View.OnClickListener {
            //link/intent  explicit
            //link to Prevention class
            val i  = Intent(this, Prevention::class.java)
            startActivity(i)
        });


        //implicit intents
        buttonwho.setOnClickListener(View.OnClickListener {

            //implicit  - link to a website
            val i = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.who.int/emergencies/diseases/novel-coronavirus-2019?gclid=CjwKCAjw9vn4BRBaEiwAh0muDLDtO5rRnLrMB9fKOIDZi91-d2lM4f-YGbPyCka5n0x9_CIDLRHuphoCJ0kQAvD_BwE"))
            startActivity(i)
        });


        buttoncall.setOnClickListener(View.OnClickListener {
            //trigger a call intent
            val i = Intent(Intent.ACTION_DIAL, Uri.parse("tel: 911"))
            startActivity(i)
            //implicit intent to connect to google map, camera, contacts, share
        });


        buttontest.setOnClickListener(View.OnClickListener {
            //link to a google maps with latitude and longitude, zoom = 15
            val i = Intent(Intent.ACTION_VIEW, Uri.parse("geo:-1.2054030000000047, 36.854067000000015z=15"))
            startActivity(i)

        });

        buttonaddress.setOnClickListener(View.OnClickListener {

            //link to contacts
            val i = Intent(Intent.ACTION_VIEW, Uri.parse("content://contacts/people"))
            startActivity(i)
            //permission is needed -
        });

        buttonshare.setOnClickListener(View.OnClickListener {
            //This is share intent to share content on social media apps i.e gnail , twitter, whatstapp
            val i:Intent = Intent().apply {
                action = Intent.ACTION_SEND
                putExtra(Intent.EXTRA_TEXT, "I am using COVID19 App, check on Google play")
                type = "text/plain"
            }

            val shareIntent = Intent.createChooser(i, null)
            startActivity(shareIntent)
        });//end

        buttonhosi.setOnClickListener(View.OnClickListener {
            //do an intent/link to hospitals activity
            val i = Intent(this, Hospitals::class.java)
            startActivity(i) //This button takes you to Hospitals

        });







    }


}