package com.example.infinity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.LinearLayout;

import com.blogspot.atifsoftwares.animatoolib.Animatoo;
import com.example.infinity.Adapters.eComAdapter;
import com.example.infinity.EmailLoginRegister.EmailLoginActivity;
import com.example.infinity.Models.eComModel;
import com.example.infinity.phoneLoginRegister.phoneLoginActivity;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rView;
    private List<eComModel> eComModelList;
    private eComAdapter eComAdapter;
    private LinearLayout logEmail;
    private LinearLayout logPhone;
    Button btnSkip;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);   //to hide status bar//

        setContentView(R.layout.activity_main);

        logEmail = findViewById(R.id.lLayoutEm);
        logPhone = findViewById(R.id.lLayoutPh);
        btnSkip = findViewById(R.id.btnSkip);

        rView = findViewById(R.id.recyclerViewMain);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        layoutManager.setOrientation(RecyclerView.HORIZONTAL);
        rView.setLayoutManager( layoutManager);
        rView.setKeepScreenOn(true);
        rView.setHasFixedSize(true);

        eComModelList = new ArrayList<>();
        eComModelList.add(new eComModel((R.drawable.desserts)));
        eComModelList.add(new eComModel((R.drawable.foods)));
        eComModelList.add(new eComModel((R.drawable.drinks)));
        eComModelList.add(new eComModel((R.drawable.italian)));
        eComModelList.add(new eComModel((R.drawable.korean)));
        eComModelList.add(new eComModel((R.drawable.thai)));
        eComModelList.add(new eComModel((R.drawable.german)));

        eComAdapter = new eComAdapter(eComModelList, this);
        rView.setAdapter((eComAdapter));
        eComAdapter.notifyDataSetChanged();

        autoScroll(); //calling the autoscroll for the images to scroll automatically

        logEmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, EmailLoginActivity.class);
                startActivity(i);
                Animatoo.animateSlideDown(MainActivity.this);
            }
        });

        logPhone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, phoneLoginActivity.class);
                startActivity(i);
                Animatoo.animateSlideDown(MainActivity.this);
            }
        });

        btnSkip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnSkip();
            }
        });


    }

    public void autoScroll(){
        final int scrollSpeed = 0;
        final Handler handler = new Handler();
        final Runnable runnable = new Runnable() {

            int count = 0;
            @Override
            public void run() {
                if(count == eComAdapter.getItemCount() )
                    count = 0;
                if(count < eComAdapter.getItemCount()){
                    rView.smoothScrollToPosition(++count);
                    handler.postDelayed(this, scrollSpeed);
                }

            }
        };
        handler.postDelayed(runnable, scrollSpeed);
    }


    public void btnSkip(){
        Intent i = new Intent(MainActivity.this, ProductsActivity.class);
        startActivity(i);
        finish();
        Animatoo.animateFade(this);
    }

}
