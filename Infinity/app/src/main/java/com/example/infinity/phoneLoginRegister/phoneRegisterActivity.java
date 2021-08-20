package com.example.infinity.phoneLoginRegister;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.blogspot.atifsoftwares.animatoolib.Animatoo;
import com.example.infinity.EmailLoginRegister.EmailLoginActivity;
import com.example.infinity.MainActivity;
import com.example.infinity.ProductsActivity;
import com.example.infinity.R;

public class phoneRegisterActivity extends AppCompatActivity {

    Button btnContinue;

    EditText regPhone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phone_register);

        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);

        btnContinue = findViewById(R.id.btnPhRegister);
        regPhone = findViewById(R.id.txtPhRegister);

        btnContinue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnContinue();
            }
        });

    }

    public void gotoLogin(View view) {

        Intent i = new Intent(phoneRegisterActivity.this, phoneLoginActivity.class);
        startActivity(i);
        Animatoo.animateSlideDown(this);
        finish();
    }

    public void btnContinue(){

        String phoneNumber = regPhone.getText().toString().trim();

        if(phoneNumber.equals("5483332899")){

            Intent i = new Intent(phoneRegisterActivity.this, ProductsActivity.class);
            startActivity(i);
            finish();
            Animatoo.animateSwipeRight(this);


        }else{
            Toast.makeText(this, "Incorrect Phone Number", Toast.LENGTH_LONG).show();
        }

    }

    public void gotoHome(View view) {

        Intent i = new Intent(phoneRegisterActivity.this, MainActivity.class);
        startActivity(i);
        Animatoo.animateSwipeRight(this);
        finish();
    }
}