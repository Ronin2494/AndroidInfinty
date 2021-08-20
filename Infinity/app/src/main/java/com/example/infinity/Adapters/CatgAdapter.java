package com.example.infinity.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.infinity.Models.CategoryModel;
import com.example.infinity.R;

import java.util.List;

public class CatgAdapter extends RecyclerView.Adapter<CatgAdapter.PlateViewHolder> {


    private List<CategoryModel> CategoryModelList;
    private Context context;

    public CatgAdapter(List<CategoryModel> categoryModelList, Context context) {
        CategoryModelList = categoryModelList;
        this.context = context;
    }

    @NonNull
    @Override
    public CatgAdapter.PlateViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.categories, viewGroup, false);

        return new PlateViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull CatgAdapter.PlateViewHolder holder, int position) {
        CategoryModel categoryModel = CategoryModelList.get(position);


        holder.title_cat.setText(categoryModel.getTitle_cat());
        Glide.with(context).load(categoryModel.getImg_cat()).placeholder(R.drawable.small_placeholder).into(holder.img_cat);
    }

    @Override
    public int getItemCount() {
        return CategoryModelList.size();
    }

    public class PlateViewHolder extends RecyclerView.ViewHolder {

        private ImageView img_cat;
        private TextView title_cat;

        public PlateViewHolder(@NonNull View itemView) {
            super(itemView);

            img_cat = itemView.findViewById(R.id.categoryImage);
            title_cat = itemView.findViewById(R.id.categoryText);

        }
    }
}
