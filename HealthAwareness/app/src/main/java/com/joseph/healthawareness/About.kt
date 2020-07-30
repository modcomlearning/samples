package com.joseph.healthawareness

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.text.HtmlCompat
import kotlinx.android.synthetic.main.activity_about.*

class About : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)

        //Load more data ot your text view
        //How to use HTML tags
        //put text data to Textview using textview id 'tvprevention'
        aboutdata.text =  HtmlCompat.fromHtml("\n" +
                "<body>" +
                " <h2>About Covid</h2>" +
                " <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod" +
                " tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim <i>veniam</i>," +
                " quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo" +
                " consequat. <b>Duis aute</b> irure dolor in reprehenderit in voluptate velit esse" +
                " cillpa qui officia deserunt mollit anim id est laborum.</p>" +
                "" +
                " <h2>How ....</h2>" +
                " <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod" +
                " tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam," +
                " quis nostrud <u>exercitation</u> ullamco laboris nisi ut aliquip ex ea commodo" +
                " consequat. Din culpa qui officia deserunt mollit anim id est laborum.</p>" +
                "" +
                "</body>", HtmlCompat.FROM_HTML_MODE_LEGACY)
    }
}