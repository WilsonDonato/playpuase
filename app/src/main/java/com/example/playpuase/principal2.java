package com.example.playpuase;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class principal2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal2);
    }

    public void cali(View view) {
        Intent intent = new Intent(principal2.this,californi.class);
        startActivity(intent);
    }

    public void other(View view) {
        Intent intent = new Intent(principal2.this,otherside.class);
        startActivity(intent);
    }

    public void dark(View view) {
        Intent intent = new Intent(principal2.this,darkne.class);
        startActivity(intent);
    }

    public void dani(View view) {
        Intent intent = new Intent(principal2.this,danical.class);
        startActivity(intent);
    }

    public void cant(View view) {
        Intent intent = new Intent(principal2.this,cantstop.class);
        startActivity(intent);
    }

    public void info(View view) {
        Intent intent = new Intent(principal2.this,infoRHCP.class);
        startActivity(intent);
    }
}