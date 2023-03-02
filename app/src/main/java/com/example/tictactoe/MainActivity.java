package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;

import com.airbnb.lottie.LottieAnimationView;

public class MainActivity extends AppCompatActivity {

    LottieAnimationView anim;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       anim = findViewById(R.id.laView);
       anim.playAnimation();

       Animation alpha = AnimationUtils.loadAnimation(MainActivity.this,R.anim.alpha);

        Button button1 =  findViewById(R.id.button1v1);
        Button button2 = findViewById(R.id.button1vComp);
        Button button3 = findViewById(R.id.button1vComp_intermediate);

        button1.setAnimation(alpha);
        button2.setAnimation(alpha);
        button3.setAnimation(alpha);

        button1.setOnClickListener(view -> openactivity1v1());

        button2.setOnClickListener(view -> openactivity1vComp());

        button3.setOnClickListener(view -> openactivity1vComp_intermediate());
    }
    public void openactivity1v1(){
        Intent intent = new Intent(this,activity1v1.class);
        startActivity(intent);
    }

    public void openactivity1vComp(){
        Intent intent = new Intent(this,activity1vComp.class);
        startActivity(intent);
     }

    public void openactivity1vComp_intermediate() {
        Intent intent = new Intent(this,activity1vComp_intermediate.class);
        startActivity(intent);
    }
}