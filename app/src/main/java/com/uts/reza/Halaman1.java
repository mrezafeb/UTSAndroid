package com.uts.reza;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.uts.reza.R;

// Tanggal Pengerjaan : 23 Mei 2019
// NIM : 10116310
// NAMA : MUHAMAD REZA FEBRIANA
// KELAS : IF-7 / AKB-7


/**
 * A simple {@link Fragment} subclass.
 */
public class Halaman1 extends Fragment {


    public Halaman1() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_halaman1, container, false);
    }

}
