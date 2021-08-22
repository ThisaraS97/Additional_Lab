package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.media.MediaPlayer;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    protected void onCreate(Bundle savedInstance){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MediaPlayer player =
                MediaPalyer.create(this,Settings.System.DEFAULT_NOTIFICATION_URI);
        player.setLooping(true);
        palyer.start();

    }
    btnStart.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            startService(new Intent(MainActivity.this, MyServices.class));
        }
    });
btnStop.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            stopService(new Intent(MainActivity.this, MyServices.class));
        }
    });
}