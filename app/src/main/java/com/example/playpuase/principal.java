package com.example.playpuase;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class principal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rpincipal);
    }

    public void roke(View view) {
        Intent intent = new Intent(principal.this,principal2.class);
        startActivity(intent);
    }
}