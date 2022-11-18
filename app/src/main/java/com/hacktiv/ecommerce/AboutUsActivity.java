package com.hacktiv.ecommerce;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.hacktiv.ecommerce.Login.LoginActivity;

public class AboutUsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_us);
    }

    public void icback(View view) {
        startActivity(new Intent(AboutUsActivity.this, LoginActivity.class));
        finish();
    }
}