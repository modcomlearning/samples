package com.modcom.jose.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
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

        })

        belts.setOnClickListener(View.OnClickListener {
            //to do intent to empty activity
        })

        caps.setOnClickListener(View.OnClickListener {
            //to do intent to empty activity
        })


        return root
    }
}