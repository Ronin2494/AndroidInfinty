package com.example.infinity.EmailLoginRegister;

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
import com.example.infinity.MainActivity;
import com.example.infinity.ProductsActivity;
import com.example.infinity.R;
import com.example.infinity.phoneLoginRegister.phoneRegisterActivity;

public class EmailLoginActivity extends AppCompatActivity {

    Button btnContinue;

    EditText emailID, Password;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_email_login);

        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);

        btnContinue = findViewById(R.id.btnELogin);
        emailID = findViewById(R.id.txtLogEmail);
        Password = findViewById(R.id.txtLogPassword);


        btnContinue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnContinue();
            }
        });

    }

    public void registrationPage(View view) {

        Intent i = new Intent(EmailLoginActivity.this, EmailRegisterActivity.class);
        startActivity(i);
        Animatoo.animateSwipeLeft(this);
        finish();
    }

    public void btnContinue(){
        String email = emailID.getText().toString().trim();
        String pass = Password.getText().toString().trim();

        if(email.equals("deepaksharma@test.com") && pass.equals("helloApp.com1")){
            Intent i = new Intent(EmailLoginActivity.this, ProductsActivity.class);
            startActivity(i);
            finish();
            Animatoo.animateSwipeRight(this);
        }else{
            Toast.makeText(this, "Either Username or Password is incorrect", Toast.LENGTH_LONG).show();
        }
    }

    public void gotoHome(View view) {

        Intent i = new Intent(EmailLoginActivity.this, MainActivity.class);
        startActivity(i);
        Animatoo.animateSwipeRight(this);
        finish();
    }
}