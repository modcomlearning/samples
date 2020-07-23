package com.joseph.modcom

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.bmi.*
//modcom.co.ke/zoom
//0729 225 710
class BMI : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.bmi)
        //do calculations
        buttonfind.setOnClickListener(View.OnClickListener {
            //calc logic here
            val weight = edittextweight.text //get weight from edittext
            val height = edittextheight.text //get height from edit text

            //lets make weight and height to ints  or float
            val converted_height: Int  = height.toString().toInt()   //height is now converted to int
            val converted_weight: Int  = weight.toString().toInt() // weight is now converted to int

            //we do the maths
            //NB: use the converted ones
            val answer: Int = converted_weight/(converted_height*converted_height)

            //we now put the answer in the textview
            textviewanswer.setText("");  //clear any text before putting your answer
            textviewanswer.append("Your BMI is: "+answer)

            //Done! Run it
        });

    }
}