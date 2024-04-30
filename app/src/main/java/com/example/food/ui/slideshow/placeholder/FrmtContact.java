package com.example.food.ui.slideshow.placeholder;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.food.R;
import com.example.food.databinding.FragmentAccountBinding;
import com.example.food.databinding.FragmentPackageBinding;

import java.util.ArrayList;
import java.util.List;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Mahadi on 3/7/2018.
 */

public class FrmtContact extends Fragment {
    private FragmentPackageBinding binding;

    View v;
    RecyclerView recyclerView;
    List<Contact> listCont;

    Button gotoDetails;

    public FrmtContact() {

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        v = inflater.inflate(R.layout.contact_frmt,container,false);
        recyclerView = (RecyclerView) v.findViewById(R.id.contact_recycleView);
        RecycleViewAdapter viewAdapter = new RecycleViewAdapter(getContext(), listCont);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setAdapter(viewAdapter);
        return v;
    }

        @Override
        public void onCreate(@Nullable Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            listCont = new ArrayList<>();
            listCont.add(new Contact("Amazon Package","01717677541", "4/19/2024"));
            listCont.add(new Contact("Best Buy Package ","01717677543", "5/05/2024"));
            listCont.add(new Contact("Shien Package","01717677544", "3/17/2024"));
            listCont.add(new Contact("US Mail","01717677545","1/12/2024"));
            listCont.add(new Contact("Amazon Package","01717677546","1/12/2024"));
            listCont.add(new Contact("Bookstore Package","01717677547","1/12/2024"));
            listCont.add(new Contact("Walmart","01717677548","1/12/2024"));



        }




    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }



}