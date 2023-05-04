package com.example.yogaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Otp extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent = getIntent();
        Toast.makeText(this,  intent.getStringExtra("mobileNumber"), Toast.LENGTH_SHORT).show();

        setContentView(R.layout.activity_main2);
    }
    public void openActivity(View v) {
        Toast.makeText(this, "Opening", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, Home.class);
        startActivity(intent);
    }
}