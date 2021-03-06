package com.modcom.jose.ui.home

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.modcom.jose.Bags
import com.modcom.jose.R

class HomeFragment : Fragment() {



    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {

        val root = inflater.inflate(R.layout.fragment_home, container, false)
        //Finding of ids is different from how its used in activity
        val bags: Button = root.findViewById(R.id.buttonbags)
        val belts: Button = root.findViewById(R.id.buttonbelts)
        val caps: Button = root.findViewById(R.id.buttoncaps)
        // do the same for other 2 buttons
        bags.setOnClickListener(View.OnClickListener {
            //to do intent to empty activity
            //do an empty activity named bags
            val i = Intent(activity, Bags::class.java)
            startActivity(i)
        })

        belts.setOnClickListener(View.OnClickListener {
            //to do intent to empty activity
            val i = Intent(activity, Bags::class.java) //do an activity for Belts
            startActivity(i)
        })

        caps.setOnClickListener(View.OnClickListener {
            //to do intent to empty activity
            val i = Intent(activity, Bags::class.java) ////do an activity for Beltscaps
            startActivity(i)

        })


        return root
    }
}