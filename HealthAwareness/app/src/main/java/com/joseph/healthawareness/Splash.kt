package com.joseph.healthawareness

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class Splash : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        // This is a splash that delays, Splash.java for 5 seconds, then proceeds to MainActivity

        Handler().postDelayed(Runnable {
            val i  = Intent(this, MainActivity::class.java)
            startActivity(i)
        }, 5000); //5 sec

    }
}