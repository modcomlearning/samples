package com.modcom.jose

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_bags2.*

class Bags : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bags2)
        //Static way
        //Firebase
        //Use HTML to load the bags with descriptions
        webView.loadUrl("file:///android_asset/bags.html")
        //To run this one.
    }
}