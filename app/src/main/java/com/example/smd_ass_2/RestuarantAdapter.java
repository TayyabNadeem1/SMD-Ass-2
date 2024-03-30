package com.example.smd_ass_2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RestuarantAdapter extends RecyclerView.Adapter<RestuarantAdapter.ViewHolder> {

    ArrayList<Restuarant> restuarant;

    public RestuarantAdapter(Context context, ArrayList<Restuarant> list){
        restuarant=list;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView tvName, tvLocation, tvPhone, tvDescription, tvRating;

        public ViewHolder(View itemView) {
            super(itemView);
            tvName = itemView.findViewById(R.id.nameText);
            tvLocation = itemView.findViewById(R.id.locationText);
            tvPhone = itemView.findViewById(R.id.phoneText);
            tvDescription = itemView.findViewById(R.id.descriptionText);
            tvRating = itemView.findViewById(R.id.ratingText);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                }

            });
        }
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.tvName.setText(restuarant.get(position).getName());
        holder.tvLocation.setText(restuarant.get(position).getLocation());
        holder.tvPhone.setText(restuarant.get(position).getPhone());
        holder.tvDescription.setText(restuarant.get(position).getDescription());
        holder.tvRating.setText(restuarant.get(position).getRating());


    }

    @Override
    public int getItemCount() {
        return restuarant.size();
    }

}
