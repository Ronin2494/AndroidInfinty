package com.example.infinity.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.infinity.Models.eComModel;
import com.example.infinity.R;

import java.util.List;

public class eComAdapter extends RecyclerView.Adapter<eComAdapter.PlateViewHolder> {


    private List<eComModel> eComModelList;
    private Context context;

    public eComAdapter(List<eComModel> eComModelList, Context context) {
        this.eComModelList = eComModelList;
        this.context = context;
    }

    @NonNull
    @Override
    public eComAdapter.PlateViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
            View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.layout_ecom, viewGroup, false);

            return new PlateViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull eComAdapter.PlateViewHolder holder, int position) {
        eComModel eComModel = eComModelList.get(position);

        Glide.with(context).load(eComModel.getPlate_img()).into(holder.plateImg);
    }

    @Override
    public int getItemCount() {
        return eComModelList.size();
    }

    public class PlateViewHolder extends RecyclerView.ViewHolder {

        private ImageView plateImg;

        public PlateViewHolder(@NonNull View itemView) {
            super(itemView);

            plateImg = itemView.findViewById(R.id.imageView2);
        }
    }
}
