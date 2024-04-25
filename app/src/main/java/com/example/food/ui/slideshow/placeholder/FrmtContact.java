package com.example.food.ui.slideshow.placeholder;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.food.R;
import com.example.food.databinding.FragmentPackageBinding;

import java.util.ArrayList;
import java.util.List;

public class FrmtContact extends Fragment  {

    private FragmentPackageBinding binding;

    View v;
    RecyclerView recyclerView;
    List<Contact> listCont;

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
        listCont.add(new Contact("Amazon Package","01717677541"));
        listCont.add(new Contact("Best Buy Package ","01717677543"));
        listCont.add(new Contact("Shien Package","01717677544"));
        listCont.add(new Contact("US Mail","01717677545"));
        listCont.add(new Contact("Amazon Package","01717677546"));
        listCont.add(new Contact("Bookstore Package","01717677547"));
        listCont.add(new Contact("Walmart","01717677548"));
        listCont.add(new Contact("Target","01717677549"));


    }



    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }



}