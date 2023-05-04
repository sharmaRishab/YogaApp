package com.example.yogaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
    }
    public void openActivity4(View v) {

        Intent intent = new Intent(this, MainActivity4.class);
        startActivity(intent);
    }
    public void openActivity5(View v) {

        Intent intent = new Intent(this, MainActivity5.class);
        startActivity(intent);
    }
    public void openActivity6(View v) {

        Intent intent = new Intent(this, MainActivity6.class);
        startActivity(intent);
    }
    public void openActivity7(View v) {

        Intent intent = new Intent(this, MainActivity7.class);
        startActivity(intent);
    }
    public void openActivity8(View v) {

        Intent intent = new Intent(this, MainActivity8.class);
        startActivity(intent);
    }
}
