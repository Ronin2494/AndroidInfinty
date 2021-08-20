package com.example.infinity.phoneLoginRegister;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
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

public class phoneLoginActivity extends AppCompatActivity {

    Button btnContinue;

    EditText logPhone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phone_login);

        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);

        btnContinue = findViewById(R.id.btnPhLogin);
        logPhone = findViewById(R.id.txtPhLogin);

        btnContinue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    btnContinue();
            }
        });

    }

    public void gotoRegister(View view) {

        Intent i = new Intent(phoneLoginActivity.this, phoneRegisterActivity.class);
        startActivity(i);
        Animatoo.animateSlideUp(this);
        finish();
    }

    public void btnContinue(){
            String phoneNumber = logPhone.getText().toString().trim();

            if(phoneNumber.equals("5483332899")){
                Intent i = new Intent(phoneLoginActivity.this, ProductsActivity.class);
                startActivity(i);
                finish();
                Animatoo.animateSwipeRight(this);
            }else{
                Toast.makeText(this, "Incorrect Phone Number", Toast.LENGTH_LONG).show();
            }
    }

    public void gotoHome(View view) {

        Intent i = new Intent(phoneLoginActivity.this, MainActivity.class);
        startActivity(i);
        Animatoo.animateSwipeRight(this);
        finish();
    }
}