package com.joseph.healthawareness

import android.content.Intent
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
            //link/intent
            val i  = Intent(this, Prevention::class.java)
            startActivity(i)
        });



    }
}