package com.example.makandimana_10120195;

/*
 *NIM   : 10120195
 *Nama  : Muhammad Raihan Firdaus
 *Kelas : IF5
 * */

import android.Manifest;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.example.makandimana_10120195.R;

public class MakanFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Initialize view
        View view = inflater.inflate(R.layout.fragment_lokasi, container, false);

        SupportMapFragment mapFragment=(SupportMapFragment) getChildFragmentManager().findFragmentById(R.id.google_map);

        // check condition
        if (ContextCompat.checkSelfPermission(getActivity(), Manifest.permission.ACCESS_FINE_LOCATION) == PackageManager.PERMISSION_GRANTED && ContextCompat.checkSelfPermission(getActivity(),
                Manifest.permission.ACCESS_COARSE_LOCATION) == PackageManager.PERMISSION_GRANTED) {

            mapFragment.getMapAsync(googleMap -> {
                //Lokasi 1
                LatLng lokasi1 = new LatLng(-6.897528398539874, 107.61353062569584);
                MarkerOptions options1 = new MarkerOptions().position(lokasi1).title("Mie Gacoan Dipatiukur");
                //Lokasi 2
                LatLng lokasi2 = new LatLng(-6.887657436817013, 107.61542263655201);
                MarkerOptions options2 = new MarkerOptions().position(lokasi2).title("Warkop SukaRasa");
                //Lokasi 3
                LatLng lokasi3 = new LatLng(-6.894435851260762, 107.61095334558806);
                MarkerOptions options3 = new MarkerOptions().position(lokasi3).title("Black Romantic");
                //Lokasi 4
                LatLng lokasi4 = new LatLng(-6.885942430991306, 107.61484173644);
                MarkerOptions options4 = new MarkerOptions().position(lokasi4).title("Rumah Makan Boga Raso");
                //Lokasi 5
                LatLng lokasi5 = new LatLng(-6.884929233246223, 107.61349537906565);
                MarkerOptions options5 = new MarkerOptions().position(lokasi5).title("McDonald's Simpang Dago Bandung");

                googleMap.setMapType(GoogleMap.MAP_TYPE_HYBRID);
                googleMap.animateCamera(CameraUpdateFactory.newLatLngZoom(lokasi3,17));
                googleMap.addMarker(options1);
                googleMap.addMarker(options2);
                googleMap.addMarker(options3);
                googleMap.addMarker(options4);
                googleMap.addMarker(options5);


            });
        }
        else {
            // When permission is not granted
            // Call method
            requestPermissions(new String[] {Manifest.permission.ACCESS_FINE_LOCATION, Manifest.permission.ACCESS_COARSE_LOCATION }, 100);
        }
        // Return view
        return view;
    }

}