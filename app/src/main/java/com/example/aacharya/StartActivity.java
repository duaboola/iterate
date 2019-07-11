package com.example.aacharya;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class StartActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
    }
    public void login(View view){
        startActivity(new Intent(this,FeedActivity.class));
    }
    public void register(View view){
        startActivity(new Intent(this,RegisterActivity.class));
    }
}
