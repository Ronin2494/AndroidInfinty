package com.example.infinity.Fragments;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.GridView;
import android.widget.TextView;

import com.example.infinity.Adapters.CatgAdapter;
import com.example.infinity.Adapters.gridProductAdapter;
import com.example.infinity.Adapters.productScrollAdapter;
import com.example.infinity.Models.CategoryModel;
import com.example.infinity.Models.productScrollModel;
import com.example.infinity.R;

import java.util.ArrayList;
import java.util.List;

public class OrdersFragment extends Fragment {


    public OrdersFragment() {
        // Required empty public constructor
    }

    private View view;

    private RecyclerView rViewCateg;
    private CatgAdapter catgAdapter;
    private List<CategoryModel> categoryModelList;


    ///horizontal product layout//
    private TextView layout_title;
    private Button btnViewAll;
    private RecyclerView horizontalRView;
    private productScrollAdapter productScrollAdapter;
    private List<productScrollModel> productScrollModelList;

    ///end//


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.layout_orders_dashboard, container, false);

        category();
        productScroll();
        gridProduct();
        return view;
    }

    private void category() {

        rViewCateg = view.findViewById(R.id.rViewCategory);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext());
        layoutManager.setOrientation(rViewCateg.HORIZONTAL);
        rViewCateg.setLayoutManager(layoutManager);

        categoryModelList = new ArrayList<>();
        categoryModelList.add(new CategoryModel(R.drawable.foods, "North Indian"));
        categoryModelList.add(new CategoryModel(R.drawable.southindian, "South Indian"));
        categoryModelList.add(new CategoryModel(R.drawable.drinks, "Drinks"));
        categoryModelList.add(new CategoryModel(R.drawable.desserts, "Dessert"));
        categoryModelList.add(new CategoryModel(R.drawable.korean, "Korean"));
        categoryModelList.add(new CategoryModel(R.drawable.italian, "Italian"));
        categoryModelList.add(new CategoryModel(R.drawable.german, "German"));
        categoryModelList.add(new CategoryModel(R.drawable.thai, "Thai"));

        catgAdapter = new CatgAdapter(categoryModelList, getContext());
        rViewCateg.setAdapter(catgAdapter);
        catgAdapter.notifyDataSetChanged();

    }
    private void productScroll(){

        layout_title = view.findViewById(R.id.horizontalScrollLayoutTitle);
        btnViewAll = view.findViewById(R.id.horizontalScrollLayoutButton);
        horizontalRView = view.findViewById(R.id.rViewProductsHorizontal);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext());
        layoutManager.setOrientation(horizontalRView.HORIZONTAL);
        horizontalRView.setLayoutManager(layoutManager);

        productScrollModelList = new ArrayList<>();
        productScrollModelList.add(new productScrollModel(R.drawable.foods, "Grilled Chicken", "$18", "AllTaxesInclusive"));
        productScrollModelList.add(new productScrollModel(R.drawable.southindian, "Podi Dosa", "$15", "AllTaxesInclusive"));
        productScrollModelList.add(new productScrollModel(R.drawable.drinks, "Mango Juice", "$14", "AllTaxesInclusive"));
        productScrollModelList.add(new productScrollModel(R.drawable.desserts, "Mint ice-cream", "$20", "AllTaxesInclusive"));
        productScrollModelList.add(new productScrollModel(R.drawable.korean, "Abcd", "$25", "AllTaxesInclusive"));
        productScrollModelList.add(new productScrollModel(R.drawable.italian, "Gnocchi", "$30", "AllTaxesInclusive"));
        productScrollModelList.add(new productScrollModel(R.drawable.german, "Noodles", "$12", "AllTaxesInclusive"));
        productScrollModelList.add(new productScrollModel(R.drawable.thai, "Bizarre", "$20", "AllTaxesInclusive"));

        productScrollAdapter = new productScrollAdapter(productScrollModelList, getContext());
        horizontalRView.setAdapter(productScrollAdapter);
        productScrollAdapter.notifyDataSetChanged();

        btnViewAll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    ////Not Working///

            }
        });


    }
    private void gridProduct(){
        TextView gridLayoutTitle = view.findViewById(R.id.gridTitle);
        Button gridBtnViewAll = view.findViewById(R.id.gridBtnViewAll);
        GridView gView = view.findViewById(R.id.gridViewLayouyt);

        gView.setAdapter(new gridProductAdapter(productScrollModelList));

        gridBtnViewAll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    ///Not Working
            }
        });


    }
}