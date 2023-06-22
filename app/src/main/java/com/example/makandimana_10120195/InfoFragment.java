package com.example.makandimana_10120195;

/*
 *NIM   : 10120195
 *Nama  : Muhammad Raihan Firdaus
 *Kelas : IF5
 * */

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import com.example.makandimana_10120195.DialogAbout;
import com.example.makandimana_10120195.R;

public class InfoFragment extends Fragment {
    TextView Abouts;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root = inflater.inflate(R.layout.fragment_info, container, false);


        Abouts = root.findViewById(R.id.about);



        Abouts.setOnClickListener(view -> {
            DialogAbout DialogAbout = new DialogAbout();
            DialogAbout.show(requireFragmentManager(),"Muhammad Raihan firdaus");
        });

        return root;
    }
}