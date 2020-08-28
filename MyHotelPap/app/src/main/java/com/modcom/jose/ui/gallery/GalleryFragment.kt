package com.modcom.jose.ui.gallery

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.GridView
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.modcom.jose.Bags
import com.modcom.jose.R

class GalleryFragment : Fragment() {

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {

        val root = inflater.inflate(R.layout.fragment_gallery, container, false)
        val grid: GridView = root.findViewById(R.id.gridview)
        //load image in this griview

        val hospitals = arrayOf<String> ("KNH","Mater","Nairobi ","Meridian","Mediheal","Kiambu")
        //you need an adapter, observe below thjta we pass the 'hospitals' array above to the adapter , towards the end of below line
        val arrayAdapter  =
            activity?.let { ArrayAdapter<String>(it, android.R.layout.simple_list_item_1, hospitals) }

        //set the adapter on line 16 to your listview
        grid.adapter  = arrayAdapter
        //project submision is 30th Sept.

        //add a list listner
        grid.onItemClickListener = AdapterView.OnItemClickListener{ parent: AdapterView<*>?, view: View?, position: Int, id: Long ->
            //position is what was clicked, counting from 0
            if (position==0){//knh
                //intent - explicit, implicit
                val i = Intent(Intent.ACTION_VIEW, Uri.parse("geo:-1.2054030000000047, 36.854067000000015z=15"))
                startActivity(i)
            }

            if (position==1){ //mater
                //intent - explicit, implicit
                val i = Intent(Intent.ACTION_VIEW, Uri.parse("geo:-1.2054030000000047, 36.854067000000015z=15"))
                startActivity(i)
            }
            //more here
            if (position==2){ //nairobi hosi
                //intent - explicit, implicit
                val i = Intent(activity, Bags::class.java) //example
                startActivity(i)
            }

            //do more ifs
        };







        return root
    }
}