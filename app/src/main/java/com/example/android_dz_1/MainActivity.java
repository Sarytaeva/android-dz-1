package com.example.android_dz_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class MainActivity extends AppCompatActivity {
    private ImageView image;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        image = findViewById(R.id.image);
        Glide.with(this).load("https://i.pinimg.com/474x/23/ab/a6/23aba60b66ef08174bb7455c4a8a2d2f.jpg").into(image);
        Log.d("olol", "onCreate: Rojdaemsya");

    }
    @Override
    protected void onStart () {
        super.onStart ();
        Log.d("ololo","onStart: Дышим ");
    }
    @Override
    protected void onResume () {
        super.onResume ();
        Log.d("ololo" ,"onResume: Jivem ");
    }
    @Override
    protected void onPause () {
        super.onPause();
        Log.d("ololo" ,"onPause: spat' ");
    }
    @Override
    protected void onStop () {
        super.onStop ();
        Log.e("ololo", "onStart:  ");
    }
    @Override
    protected void onDestroy () {
        super.onDestroy();
        Log.d("ololo", "onStart: Umiraet ");

    }
}

