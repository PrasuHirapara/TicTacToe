package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

import com.airbnb.lottie.LottieAnimationView;

public class splashActivity extends AppCompatActivity {

    LottieAnimationView anim;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);


        anim = findViewById(R.id.laView2);
        anim.playAnimation();


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                Intent iHome = new Intent(splashActivity.this, MainActivity.class);
                startActivity(iHome);

            }
        },3000);
    }
}