package com.example.infinity.Adapters;

import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.infinity.Models.productScrollModel;
import com.example.infinity.R;

import java.util.List;

public class gridProductAdapter extends BaseAdapter {

    List<productScrollModel> productScrollModelList;

    public gridProductAdapter(List<productScrollModel> productScrollModelList) {
        this.productScrollModelList = productScrollModelList;
    }

    @Override
    public int getCount() {
        return 4;  ///just to show 4 items in the view at a time.
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v;

        if(convertView == null){
            v = LayoutInflater.from(parent.getContext()).inflate(R.layout.horizontal_scroll_item_layout, null);

            v.setElevation(0);
            v.setBackgroundColor(Color.parseColor("#ffffff"));

            // To find the data///
            ImageView productImage = v.findViewById(R.id.productFoods);
            TextView productTitle = v.findViewById(R.id.productTitle);
            TextView productPrice = v.findViewById(R.id.productPrice);
            TextView productTax = v.findViewById(R.id.productTax);

            //to set data on elements
            productImage.setImageResource(productScrollModelList.get(position).getProduct_img());
            productTitle.setText(productScrollModelList.get(position).getProduct_title());
            productPrice.setText(productScrollModelList.get(position).getProduct_price());
            productTax.setText(productScrollModelList.get(position).getProduct_tax());

        }else{
            v = convertView;

        }
        return v;
    }
}
