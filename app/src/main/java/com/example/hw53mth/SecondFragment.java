package com.example.hw53mth;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class SecondFragment extends Fragment {
private SecondAdapter adapter;
private ArrayList<String> data;
private RecyclerView recyclerView;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_second, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    loudData();
    recyclerView=view.findViewById(R.id.recyclerview);
    adapter=new SecondAdapter(data);
    recyclerView.setAdapter(adapter);

    }

    private void loudData() {
        data=new ArrayList<>();
        data.add("Java");
        data.add("Java");
        data.add("Java");
    }
}