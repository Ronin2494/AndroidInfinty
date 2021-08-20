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
import com.example.infinity.Models.productScrollModel;
import com.example.infinity.R;

import java.util.List;

public class productScrollAdapter extends RecyclerView.Adapter<productScrollAdapter.ViewHolder> {


    private List<productScrollModel> productScrollModelList;
    private Context context;

    public productScrollAdapter(List<productScrollModel> productScrollModelList, Context context) {
        this.productScrollModelList = productScrollModelList;
        this.context = context;
    }

    @NonNull
    @Override
    public productScrollAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.horizontal_scroll_item_layout, viewGroup, false);

        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull productScrollAdapter.ViewHolder holder, int position) {
        productScrollModel productModel = productScrollModelList.get(position);


        holder.product_title.setText(productModel.getProduct_title());
        holder.product_price.setText(productModel.getProduct_price());
        holder.product_tax.setText(productModel.getProduct_tax());
        Glide.with(context).load(productModel.getProduct_img()).placeholder(R.drawable.small_placeholder).into(holder.product_img);
    }

    @Override
    public int getItemCount() {
        return productScrollModelList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private ImageView product_img;
        private TextView product_title;
        private TextView product_price;
        private TextView product_tax;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            product_img = itemView.findViewById(R.id.productFoods);
            product_title = itemView.findViewById(R.id.productTitle);
            product_price = itemView.findViewById(R.id.productPrice);
            product_tax = itemView.findViewById(R.id.productTax);
        }
    }
}
