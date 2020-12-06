package com.example.tommyhard;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_screen);
    }
    public void onButtonClick(View v)
    {
        Intent intent = new Intent(this, FriendsActivity.class);
        startActivity(intent);
    }
}