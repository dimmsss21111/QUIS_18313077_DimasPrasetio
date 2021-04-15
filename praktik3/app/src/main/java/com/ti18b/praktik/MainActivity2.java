package com.ti18b.praktik;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {


    TextView tvEmail, tvPass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        tvEmail = findViewById(R.id.textView);
        tvPass = findViewById(R.id.textView2);

        Intent ambil = getIntent();
        String email = ambil.getStringExtra("Email");
        String pswd = ambil.getStringExtra("Password");

        tvEmail.setText(email);
        tvPass.setText(pswd);

    }
}