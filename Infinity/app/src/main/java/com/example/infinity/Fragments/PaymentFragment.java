package com.example.infinity.Fragments;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;

import com.braintreepayments.cardform.view.CardForm;
import com.example.infinity.CheckOutActivity;
import com.example.infinity.R;


public class PaymentFragment extends Fragment {


    public PaymentFragment() {
        // Required empty public constructor
    }

    Button buyNow;
    ImageButton btnBack;
    private View view;




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.layout_payment, container, false);
        form();
        return view;
    }
    public void form(){

        buyNow = view.findViewById(R.id.btnBuyNow);
        btnBack = view.findViewById(R.id.btnBackPayment);


        btnBack.setOnClickListener(v -> {
            FragmentManager  selectFragment = getFragmentManager();
            selectFragment.beginTransaction().replace(R.id.frameLayout, new OrdersFragment()).commit();
        });

        buyNow.setOnClickListener(v -> {

            Intent intent = new Intent(getActivity(), CheckOutActivity.class);
            startActivity(intent);

        });
    }



}