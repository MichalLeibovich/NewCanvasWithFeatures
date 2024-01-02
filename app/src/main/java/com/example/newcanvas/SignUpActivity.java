package com.example.newcanvas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class SignUpActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
    }

    private void MoveToNextActivity()
    {
        Intent intent = new Intent(SignUpActivity.this, MainActivity.class);
    }

}