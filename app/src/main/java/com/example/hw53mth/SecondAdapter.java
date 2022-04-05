package com.example.hw53mth;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class SecondAdapter extends RecyclerView.Adapter<SecondAdapter.SecondViewHolder> {
    private ArrayList<String> data;

    public SecondAdapter(ArrayList<String> data) {
        this.data = data;
    }

    @NonNull
    @Override
    public SecondViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new SecondViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull SecondViewHolder holder, int position) {
        holder.bind(data.get(position));

    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    class SecondViewHolder extends RecyclerView.ViewHolder {

        private TextView dies;
        public SecondViewHolder(@NonNull View itemView) {
            super(itemView);
            dies=itemView.findViewById(R.id.tv_dies);
        }

        public void bind(String s) {
            dies.setText(s);
        }
    }
}
