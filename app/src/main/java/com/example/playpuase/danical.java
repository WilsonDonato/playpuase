package com.example.playpuase;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class danical extends AppCompatActivity {
    Button play_pause;
    MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_danical);
        play_pause = (Button) findViewById(R.id.play_pause);
        mp = MediaPlayer.create(this,R.raw.dani);
        play_pause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mp.isPlaying()){
                    mp.pause();
                    play_pause.setBackgroundResource(R.drawable.play);
                    Toast.makeText(danical.this, "Pausa", Toast.LENGTH_SHORT).show();
                }else{
                    mp.start();
                    play_pause.setBackgroundResource(R.drawable.pausa);
                    Toast.makeText(danical.this, "Dani California - Red Hot Chili Peppers", Toast.LENGTH_SHORT).show();
                }
            }
        });




    }
}