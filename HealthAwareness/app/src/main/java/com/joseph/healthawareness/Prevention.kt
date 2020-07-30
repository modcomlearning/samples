package com.joseph.healthawareness

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.text.HtmlCompat
import kotlinx.android.synthetic.main.activity_prevention.*

class Prevention : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_prevention)

        //put text data to Textview using textview id 'tvprevention'
        tvprevention.text = HtmlCompat.fromHtml("\n" +
                "\n" +
                "<body>\n" +
                "" +
                "<style type=\"text/css\">\n" +
                "h2{\n" +
                "\t\t\tcolor: red;\n" +
                "\t\t}\n" +
                "\t</style>\n" +
                "\t <h2>About Covid</h2>\n" +
                "\t <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod" +
                "\t tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim <i>veniam</i>,\n" +
                "\t quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo" +
                "\t consequat. <b>Duis aute</b> irure dolor in reprehenderit in voluptate velit esse" +
                "\t cillpa qui officia deserunt mollit anim id est laborum.</p>\n" +
                "\n" +
                "\t <h2>How ....</h2>\n" +
                "\t <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod\n" +
                "\t tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam,\n" +
                "\t quis nostrud <u>exercitation</u> ullamco laboris nisi ut aliquip ex ea commodo\n" +
                "\t consequat. Din culpa qui officia deserunt mollit anim id est laborum.</p>\n" +
                "\n" +
                "</body>", HtmlCompat.FROM_HTML_MODE_LEGACY)
    }
}