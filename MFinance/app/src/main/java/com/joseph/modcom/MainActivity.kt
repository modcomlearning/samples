package com.joseph.modcom

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.sample.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.sample)
        //how do we  connect to our 3 EditTexts, 1 Button, 1 TextView
        //You need to remember the ids you used in XML
        //make the button listen to click, currently the button is not working
        //What is the button id in XML?
        //am reapeting
        submit.setOnClickListener(View.OnClickListener {
            //what are the ids for our edit text?
            val name  = editTextTextPersonName.text   //get text and store in val 'name'
            val pass = editTextTextPassword.text   //get text and store in val 'pass'
            val email = editTextTextEmailAddress.text   //get text and store in val 'email'

            //now show the 3 val above to textview
            //remove/clear default text
            tvoutput.setText("")
            tvoutput.append(name.append("\n"))  //append name to Textview
            tvoutput.append(pass.append("\n"))  //append pass to textview
            tvoutput.append(email.append("\n"))  //append email to textview
            //Done

        });
    }
}