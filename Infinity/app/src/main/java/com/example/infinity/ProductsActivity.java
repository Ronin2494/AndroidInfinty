package com.example.infinity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;

import com.example.infinity.Fragments.GoOutFragment;
import com.example.infinity.Fragments.OrdersFragment;
import com.example.infinity.Fragments.PaymentFragment;
import com.example.infinity.Fragments.VideosFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.List;

public class ProductsActivity extends AppCompatActivity {

    BottomNavigationView btmNavigation;
    FrameLayout frameLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);

        setContentView(R.layout.activity_products);

        btmNavigation = findViewById(R.id.bottomNavigation);
        btmNavigation.setOnNavigationItemSelectedListener(navigation);
        frameLayout = findViewById(R.id.frameLayout);

        getSupportFragmentManager().beginTransaction().replace(R.id.frameLayout, new OrdersFragment()).commit(); /// to call the default fragment


    }

    private BottomNavigationView.OnNavigationItemSelectedListener navigation =
            new BottomNavigationView.OnNavigationItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem item) {


                    Fragment selectFragment = null;

                    switch(item.getItemId())
                    {
                        case R.id.orders:
                            selectFragment = new OrdersFragment();

                            break;

                        case R.id.goOut:
                            selectFragment = new GoOutFragment();
                            break;

                        case R.id.paymentMethod:
                            selectFragment = new PaymentFragment();
                            break;


                        case R.id.videos:
                            selectFragment = new VideosFragment();
                            break;

                    }

                    getSupportFragmentManager().beginTransaction().replace(R.id.frameLayout, selectFragment).commit();
                    return true;
                }
            };


}