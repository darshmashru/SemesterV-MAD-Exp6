package com.darshmashru.madexperiment6;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void clickPictureIntent(View view) {
        Intent intent = new Intent(MainActivity.this, clickPicture.class);
        startActivity(intent);
    }
    public void clickVideoIntent(View view) {
        Intent intent = new Intent(MainActivity.this, clickVideo.class);
        startActivity(intent);
    }
}