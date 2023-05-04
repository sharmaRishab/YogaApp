package com.example.yogaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openActivity(View v) {
        EditText editText = findViewById(R.id.mobileNumber);

        Toast.makeText(this, "Opening" + editText.getText(), Toast.LENGTH_SHORT).show();

        Intent intent = new Intent(getApplicationContext(), Otp.class);
        intent.putExtra("mNumber", editText.getText());
        startActivity(intent);

    }
}