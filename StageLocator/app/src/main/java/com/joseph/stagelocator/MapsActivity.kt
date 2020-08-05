package com.joseph.stagelocator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.BitmapDescriptorFactory
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions

class MapsActivity : AppCompatActivity(), OnMapReadyCallback {

    private lateinit var mMap: GoogleMap

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_maps)
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        val mapFragment = supportFragmentManager
                .findFragmentById(R.id.map) as SupportMapFragment
        mapFragment.getMapAsync(this) //load map in bits, sections
    }

    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    override fun onMapReady(googleMap: GoogleMap) {
        mMap = googleMap

        // Add a marker in Sydney and move the camera
        val chiromo = LatLng(-1.269650, 36.808920)
        mMap.addMarker(MarkerOptions().position(chiromo).title("Chiromo Bus Terminus")
            .snippet("To: Kagemi, Ruaka, Waiyaki Way, ")
            .icon(BitmapDescriptorFactory.fromResource(R.drawable.bus1)))

        //another stage
        val westiemain = LatLng(-1.2654394,36.8006158)
        mMap.addMarker(MarkerOptions().position(westiemain).title("Westlands Main Terminus")
            .snippet("To: Kagemi, Town, ")
            .icon(BitmapDescriptorFactory.fromResource(R.drawable.bus1)))


        val stmarks = LatLng(-1.2605439,36.7948584)
        mMap.addMarker(MarkerOptions().position(stmarks).title("ST Marks Terminus")
            .icon(BitmapDescriptorFactory.fromResource(R.drawable.bus1)))


        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(chiromo, 14f))
            //check latlong.net
    }
}