package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.airbnb.lottie.LottieAnimationView;

import java.util.Random;

public class activity1vComp extends AppCompatActivity{
    private static int XC= 0,OC=0;
    Button cell1,cell2,cell3,cell4,cell5,cell6,cell7,cell8,cell9;
    LottieAnimationView anim;
    TextView XCount,OCount,score,sX,sO;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity1v_comp);

        iniBut();

        Animation inVi = AnimationUtils.loadAnimation(activity1vComp.this,R.anim.alpha);
        Animation Anim = AnimationUtils.loadAnimation(activity1vComp.this,R.anim.scale);
        Animation move_d1 = AnimationUtils.loadAnimation(activity1vComp.this,R.anim.move_d1);
        Animation move_d2 = AnimationUtils.loadAnimation(activity1vComp.this,R.anim.move_d2);
        Animation move_down_x = AnimationUtils.loadAnimation(activity1vComp.this,R.anim.move_down_x);
        Animation move_down_y = AnimationUtils.loadAnimation(activity1vComp.this,R.anim.move_down_y);
        Animation move_up_x = AnimationUtils.loadAnimation(activity1vComp.this,R.anim.move_up_x);
        Animation move_up_y = AnimationUtils.loadAnimation(activity1vComp.this,R.anim.move_up_y);
        Animation move_d3 = AnimationUtils.loadAnimation(activity1vComp.this,R.anim.move_d3);
        Animation move_d4= AnimationUtils.loadAnimation(activity1vComp.this,R.anim.move_d4);

        cell1.setAnimation(move_d1);
        cell2.setAnimation(move_up_x);
        cell3.setAnimation(move_d3);
        cell4.setAnimation(move_down_y);
        cell5.setAnimation(inVi);
        cell6.setAnimation(move_down_x);
        cell7.setAnimation(move_d4);
        cell8.setAnimation(move_up_y);
        cell9.setAnimation(move_d2);
        sO.setAnimation(inVi);
        sX.setAnimation(inVi);
        XCount.setAnimation(inVi);
        OCount.setAnimation(inVi);
    }
    private void iniBut(){
        score = findViewById(R.id.score);
        sO = findViewById(R.id.sO);
        sX = findViewById(R.id.sX);
        XCount = findViewById(R.id.xCount);
        OCount = findViewById(R.id.oCount);
        cell1 = findViewById(R.id.cell1);
        cell2 = findViewById(R.id.cell2);
        cell3 = findViewById(R.id.cell3);
        cell4 = findViewById(R.id.cell4);
        cell5 = findViewById(R.id.cell5);
        cell6 = findViewById(R.id.cell6);
        cell7 = findViewById(R.id.cell7);
        cell8 = findViewById(R.id.cell8);
        cell9 = findViewById(R.id.cell9);
    }
    public void setChar(View view){
        Button curBut = (Button) view;
        if(curBut.getText().toString().isEmpty()){
            curBut.setText("X");
        }else{
            Toast.makeText(getApplicationContext(),"Cell is already Filled.", Toast.LENGTH_SHORT).show();
        }
        if((cell1.getText().toString().equals("X"))&&(cell2.getText().toString().equals("X"))&&(cell3.getText().toString().equals("X"))){
            XC++;
            XCount.setText(XC+" ");
            Toast.makeText(getApplicationContext(),"Player X Won!!!", Toast.LENGTH_LONG).show();

            anim = findViewById(R.id.laView3);
            anim.playAnimation();

            Animation Anim = AnimationUtils.loadAnimation(activity1vComp.this,R.anim.rotate);
            cell1.setAnimation(Anim);
            cell2.setAnimation(Anim);
            cell3.setAnimation(Anim);

            restart();
            return;
        }
        if((cell4.getText().toString().equals("X"))&&(cell5.getText().toString().equals("X"))&&(cell6.getText().toString().equals("X"))){
            XC++;
            XCount.setText(XC+" ");
            Toast.makeText(getApplicationContext(),"Player X Won!!!", Toast.LENGTH_LONG).show();

            anim = findViewById(R.id.laView3);
            anim.playAnimation();

            Animation Anim = AnimationUtils.loadAnimation(activity1vComp.this,R.anim.rotate);
            cell4.setAnimation(Anim);
            cell5.setAnimation(Anim);
            cell6.setAnimation(Anim);

            restart();
            return;
        }
        if((cell1.getText().toString().equals("X"))&&(cell4.getText().toString().equals("X"))&&(cell7.getText().toString().equals("X"))){
            XC++;
            XCount.setText(XC+" ");
            Toast.makeText(getApplicationContext(),"Player X Won!!!", Toast.LENGTH_LONG).show();

            anim = findViewById(R.id.laView3);
            anim.playAnimation();

            Animation Anim = AnimationUtils.loadAnimation(activity1vComp.this,R.anim.rotate);
            cell1.setAnimation(Anim);
            cell4.setAnimation(Anim);
            cell7.setAnimation(Anim);

            restart();
            return;
        }
        if((cell7.getText().toString().equals("X"))&&(cell8.getText().toString().equals("X"))&&(cell9.getText().toString().equals("X"))){
            XC++;
            XCount.setText(XC+" ");
            Toast.makeText(getApplicationContext(),"Player X Won!!!", Toast.LENGTH_LONG).show();

            anim = findViewById(R.id.laView3);
            anim.playAnimation();

            Animation Anim = AnimationUtils.loadAnimation(activity1vComp.this,R.anim.rotate);
            cell7.setAnimation(Anim);
            cell8.setAnimation(Anim);
            cell9.setAnimation(Anim);

            restart();
            return;
        }
        if((cell2.getText().toString().equals("X"))&&(cell5.getText().toString().equals("X"))&&(cell8.getText().toString().equals("X"))){
            XC++;
            XCount.setText(XC+" ");
            Toast.makeText(getApplicationContext(),"Player X Won!!!", Toast.LENGTH_LONG).show();

            anim = findViewById(R.id.laView3);
            anim.playAnimation();

            Animation Anim = AnimationUtils.loadAnimation(activity1vComp.this,R.anim.rotate);
            cell5.setAnimation(Anim);
            cell2.setAnimation(Anim);
            cell8.setAnimation(Anim);

            restart();
            return;
        }
        if((cell3.getText().toString().equals("X"))&&(cell6.getText().toString().equals("X"))&&(cell9.getText().toString().equals("X"))){
            XC++;
            XCount.setText(XC+" ");
            Toast.makeText(getApplicationContext(),"Player X Won!!!", Toast.LENGTH_LONG).show();

            anim = findViewById(R.id.laView3);
            anim.playAnimation();

            Animation Anim = AnimationUtils.loadAnimation(activity1vComp.this,R.anim.rotate);
            cell3.setAnimation(Anim);
            cell6.setAnimation(Anim);
            cell9.setAnimation(Anim);

            restart();
            return;
        }
        if((cell1.getText().toString().equals("X"))&&(cell5.getText().toString().equals("X"))&&(cell9.getText().toString().equals("X"))){
            XC++;
            XCount.setText(XC+" ");
            Toast.makeText(getApplicationContext(),"Player X Won!!!", Toast.LENGTH_LONG).show();

            anim = findViewById(R.id.laView3);
            anim.playAnimation();

            Animation Anim = AnimationUtils.loadAnimation(activity1vComp.this,R.anim.rotate);
            cell1.setAnimation(Anim);
            cell5.setAnimation(Anim);
            cell9.setAnimation(Anim);

            restart();
            return;
        }
        if((cell3.getText().toString().equals("X"))&&(cell5.getText().toString().equals("X"))&&(cell7.getText().toString().equals("X"))){
            XC++;
            XCount.setText(XC+" ");
            Toast.makeText(getApplicationContext(),"Player X Won!!!", Toast.LENGTH_LONG).show();

            anim = findViewById(R.id.laView3);
            anim.playAnimation();

            Animation Anim = AnimationUtils.loadAnimation(activity1vComp.this,R.anim.rotate);
            cell3.setAnimation(Anim);
            cell5.setAnimation(Anim);
            cell7.setAnimation(Anim);

            restart();
            return;
        }
        if(((cell1.getText().toString().equals("X"))||(cell1.getText().toString().equals("O")))){
            if(((cell2.getText().toString().equals("X"))||(cell2.getText().toString().equals("O")))){
                if(((cell3.getText().toString().equals("X"))||(cell3.getText().toString().equals("O")))){
                    if(((cell4.getText().toString().equals("X"))||(cell4.getText().toString().equals("O")))){
                        if(((cell5.getText().toString().equals("X"))||(cell5.getText().toString().equals("O")))){
                            if(((cell6.getText().toString().equals("X"))||(cell6.getText().toString().equals("O")))){
                                if(((cell7.getText().toString().equals("X"))||(cell7.getText().toString().equals("O")))){
                                    if(((cell8.getText().toString().equals("X"))||(cell8.getText().toString().equals("O")))){
                                        if(((cell9.getText().toString().equals("X"))||(cell9.getText().toString().equals("O")))){
                                            Toast.makeText(getApplicationContext(),"Game Draw!!!", Toast.LENGTH_LONG).show();

                                            Animation Anim = AnimationUtils.loadAnimation(activity1vComp.this,R.anim.rotate);
                                            cell1.setAnimation(Anim);
                                            cell2.setAnimation(Anim);
                                            cell3.setAnimation(Anim);
                                            cell4.setAnimation(Anim);
                                            cell5.setAnimation(Anim);
                                            cell6.setAnimation(Anim);
                                            cell7.setAnimation(Anim);
                                            cell8.setAnimation(Anim);
                                            cell9.setAnimation(Anim);

                                            restart();
                                            return;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        int isC =0;
        for(int i=1; i<=9; i++){
            if(!(isC ==0)){
                break;
            }
            switch(i){
                case 1: if((cell1.getText().toString().equals(""))) {
                    cell1.setText("X");
                    if ((cell1.getText().toString().equals("X")) && (cell2.getText().toString().equals("X")) && (cell3.getText().toString().equals("X"))) {
                        cell1.setText("O");
                        isC++;
                        break;
                    }
                    if ((cell4.getText().toString().equals("X")) && (cell5.getText().toString().equals("X")) && (cell6.getText().toString().equals("X"))) {
                        cell1.setText("O");
                        isC++;
                        break;
                    }
                    if ((cell7.getText().toString().equals("X")) && (cell8.getText().toString().equals("X")) && (cell9.getText().toString().equals("X"))) {
                        cell1.setText("O");
                        isC++;
                        break;
                    }
                    if ((cell1.getText().toString().equals("X")) && (cell4.getText().toString().equals("X")) && (cell7.getText().toString().equals("X"))) {
                        cell1.setText("O");
                        isC++;
                        break;
                    }
                    if ((cell2.getText().toString().equals("X")) && (cell5.getText().toString().equals("X")) && (cell8.getText().toString().equals("X"))) {
                        cell1.setText("O");
                        isC++;
                        break;
                    }
                    if ((cell3.getText().toString().equals("X")) && (cell6.getText().toString().equals("X")) && (cell9.getText().toString().equals("X"))) {
                        cell1.setText("O");
                        isC++;
                        break;
                    }
                    if ((cell1.getText().toString().equals("X")) && (cell5.getText().toString().equals("X")) && (cell9.getText().toString().equals("X"))) {
                        cell1.setText("O");
                        isC++;
                        break;
                    }
                    if ((cell3.getText().toString().equals("X")) && (cell5.getText().toString().equals("X")) && (cell7.getText().toString().equals("X"))) {
                        cell1.setText("O");
                        isC++;
                        break;
                    }else{
                        cell1.setText(null);
                    }
                }
                    break;
                case 2: if((cell2.getText().toString().equals(""))) {
                    cell2.setText("X");
                    if ((cell1.getText().toString().equals("X")) && (cell2.getText().toString().equals("X")) && (cell3.getText().toString().equals("X"))) {
                        cell2.setText("O");
                        isC++;
                        break;
                    }
                    if ((cell4.getText().toString().equals("X")) && (cell5.getText().toString().equals("X")) && (cell6.getText().toString().equals("X"))) {
                        cell2.setText("O");
                        isC++;
                        break;
                    }
                    if ((cell7.getText().toString().equals("X")) && (cell8.getText().toString().equals("X")) && (cell9.getText().toString().equals("X"))) {
                        cell2.setText("O");
                        isC++;
                        break;
                    }
                    if ((cell1.getText().toString().equals("X")) && (cell4.getText().toString().equals("X")) && (cell7.getText().toString().equals("X"))) {
                        cell2.setText("O");
                        isC++;
                        break;
                    }
                    if ((cell2.getText().toString().equals("X")) && (cell5.getText().toString().equals("X")) && (cell8.getText().toString().equals("X"))) {
                        cell2.setText("O");
                        isC++;
                        break;
                    }
                    if ((cell3.getText().toString().equals("X")) && (cell6.getText().toString().equals("X")) && (cell9.getText().toString().equals("X"))) {
                        cell2.setText("O");
                        isC++;
                        break;
                    }
                    if ((cell1.getText().toString().equals("X")) && (cell5.getText().toString().equals("X")) && (cell9.getText().toString().equals("X"))) {
                        cell2.setText("O");
                        return;
                    }
                    if ((cell3.getText().toString().equals("X")) && (cell5.getText().toString().equals("X")) && (cell7.getText().toString().equals("X"))) {
                        cell2.setText("O");
                        isC++;
                        break;
                    }else{
                        cell2.setText(null);
                    }
                }
                    break;
                case 3: if((cell3.getText().toString().equals(""))) {
                    cell3.setText("X");
                    if ((cell1.getText().toString().equals("X")) && (cell2.getText().toString().equals("X")) && (cell3.getText().toString().equals("X"))) {
                        cell3.setText("O");
                        isC++;
                        break;
                    }
                    else if ((cell4.getText().toString().equals("X")) && (cell5.getText().toString().equals("X")) && (cell6.getText().toString().equals("X"))) {
                        cell3.setText("O");
                        isC++;
                        break;
                    }
                    else if ((cell7.getText().toString().equals("X")) && (cell8.getText().toString().equals("X")) && (cell9.getText().toString().equals("X"))) {
                        cell3.setText("O");
                        isC++;
                        break;
                    }
                    else  if ((cell1.getText().toString().equals("X")) && (cell4.getText().toString().equals("X")) && (cell7.getText().toString().equals("X"))) {
                        cell3.setText("O");
                        isC++;
                        break;
                    }
                    else if ((cell2.getText().toString().equals("X")) && (cell5.getText().toString().equals("X")) && (cell8.getText().toString().equals("X"))) {
                        cell3.setText("O");
                        isC++;
                        break;
                    }
                    else if ((cell3.getText().toString().equals("X")) && (cell6.getText().toString().equals("X")) && (cell9.getText().toString().equals("X"))) {
                        cell3.setText("O");
                        isC++;
                        break;
                    }
                    else if ((cell1.getText().toString().equals("X")) && (cell5.getText().toString().equals("X")) && (cell9.getText().toString().equals("X"))) {
                        cell3.setText("O");
                        isC++;
                        break;
                    }
                    else if ((cell3.getText().toString().equals("X")) && (cell5.getText().toString().equals("X")) && (cell7.getText().toString().equals("X"))) {
                        cell3.setText("O");
                        isC++;
                        break;
                    }else{
                        cell3.setText(null);
                    }
                }
                    break;
                case 4: if((cell4.getText().toString().equals(""))) {
                    cell4.setText("X");
                    if ((cell1.getText().toString().equals("X")) && (cell2.getText().toString().equals("X")) && (cell3.getText().toString().equals("X"))) {
                        cell4.setText("O");
                        isC++;
                        break;
                    }
                    if ((cell4.getText().toString().equals("X")) && (cell5.getText().toString().equals("X")) && (cell6.getText().toString().equals("X"))) {
                        cell4.setText("O");
                        isC++;
                        break;
                    }
                    if ((cell7.getText().toString().equals("X")) && (cell8.getText().toString().equals("X")) && (cell9.getText().toString().equals("X"))) {
                        cell4.setText("O");
                        isC++;
                        break;
                    }
                    if ((cell1.getText().toString().equals("X")) && (cell4.getText().toString().equals("X")) && (cell7.getText().toString().equals("X"))) {
                        cell4.setText("O");
                        isC++;
                        break;
                    }
                    if ((cell2.getText().toString().equals("X")) && (cell5.getText().toString().equals("X")) && (cell8.getText().toString().equals("X"))) {
                        cell4.setText("O");
                        isC++;
                        break;
                    }
                    if ((cell3.getText().toString().equals("X")) && (cell6.getText().toString().equals("X")) && (cell9.getText().toString().equals("X"))) {
                        cell4.setText("O");
                        isC++;
                        break;
                    }
                    if ((cell1.getText().toString().equals("X")) && (cell5.getText().toString().equals("X")) && (cell9.getText().toString().equals("X"))) {
                        cell4.setText("O");
                        isC++;
                        break;
                    }
                    if ((cell3.getText().toString().equals("X")) && (cell5.getText().toString().equals("X")) && (cell7.getText().toString().equals("X"))) {
                        cell4.setText("O");
                        isC++;
                        break;
                    }else{
                        cell4.setText(null);
                    }
                }
                    break;
                case 5: if((cell5.getText().toString().equals(""))) {
                    cell5.setText("X");
                    if ((cell1.getText().toString().equals("X")) && (cell2.getText().toString().equals("X")) && (cell3.getText().toString().equals("X"))) {
                        cell5.setText("O");
                        isC++;
                        break;
                    }
                    if ((cell4.getText().toString().equals("X")) && (cell5.getText().toString().equals("X")) && (cell6.getText().toString().equals("X"))) {
                        cell5.setText("O");
                        isC++;
                        break;
                    }
                    if ((cell7.getText().toString().equals("X")) && (cell8.getText().toString().equals("X")) && (cell9.getText().toString().equals("X"))) {
                        cell5.setText("O");
                        isC++;
                        break;
                    }
                    if ((cell1.getText().toString().equals("X")) && (cell4.getText().toString().equals("X")) && (cell7.getText().toString().equals("X"))) {
                        cell5.setText("O");
                        isC++;
                        break;
                    }
                    if ((cell2.getText().toString().equals("X")) && (cell5.getText().toString().equals("X")) && (cell8.getText().toString().equals("X"))) {
                        cell5.setText("O");
                        isC++;
                        break;
                    }
                    if ((cell3.getText().toString().equals("X")) && (cell6.getText().toString().equals("X")) && (cell9.getText().toString().equals("X"))) {
                        cell5.setText("O");
                        isC++;
                        break;
                    }
                    if ((cell1.getText().toString().equals("X")) && (cell5.getText().toString().equals("X")) && (cell9.getText().toString().equals("X"))) {
                        cell5.setText("O");
                        isC++;
                        break;
                    }
                    if ((cell3.getText().toString().equals("X")) && (cell5.getText().toString().equals("X")) && (cell7.getText().toString().equals("X"))) {
                        cell5.setText("O");
                        isC++;
                        break;
                    }else{
                        cell5.setText(null);
                    }
                }
                    break;
                case 6: if((cell6.getText().toString().equals(""))) {
                    cell6.setText("X");
                    if ((cell1.getText().toString().equals("X")) && (cell2.getText().toString().equals("X")) && (cell3.getText().toString().equals("X"))) {
                        cell6.setText("O");
                        isC++;
                        break;
                    }
                    if ((cell4.getText().toString().equals("X")) && (cell5.getText().toString().equals("X")) && (cell6.getText().toString().equals("X"))) {
                        cell6.setText("O");
                        isC++;
                        break;
                    }
                    if ((cell7.getText().toString().equals("X")) && (cell8.getText().toString().equals("X")) && (cell9.getText().toString().equals("X"))) {
                        cell6.setText("O");
                        isC++;
                        break;
                    }
                    if ((cell1.getText().toString().equals("X")) && (cell4.getText().toString().equals("X")) && (cell7.getText().toString().equals("X"))) {
                        cell6.setText("O");
                        isC++;
                        break;
                    }
                    if ((cell2.getText().toString().equals("X")) && (cell5.getText().toString().equals("X")) && (cell8.getText().toString().equals("X"))) {
                        cell6.setText("O");
                        isC++;
                        break;
                    }
                    if ((cell3.getText().toString().equals("X")) && (cell6.getText().toString().equals("X")) && (cell9.getText().toString().equals("X"))) {
                        cell6.setText("O");
                        isC++;
                        break;
                    }
                    if ((cell1.getText().toString().equals("X")) && (cell5.getText().toString().equals("X")) && (cell9.getText().toString().equals("X"))) {
                        cell6.setText("O");
                        isC++;
                        break;
                    }
                    if ((cell3.getText().toString().equals("X")) && (cell5.getText().toString().equals("X")) && (cell7.getText().toString().equals("X"))) {
                        cell6.setText("O");
                        isC++;
                        break;
                    }else{
                        cell6.setText(null);
                    }
                }
                    break;
                case 7: if((cell7.getText().toString().equals(""))) {
                    cell7.setText("X");
                    if ((cell1.getText().toString().equals("X")) && (cell2.getText().toString().equals("X")) && (cell3.getText().toString().equals("X"))) {
                        cell7.setText("O");
                        isC++;
                        break;
                    }
                    if ((cell4.getText().toString().equals("X")) && (cell5.getText().toString().equals("X")) && (cell6.getText().toString().equals("X"))) {
                        cell7.setText("O");
                        isC++;
                        break;
                    }
                    if ((cell7.getText().toString().equals("X")) && (cell8.getText().toString().equals("X")) && (cell9.getText().toString().equals("X"))) {
                        cell7.setText("O");
                        isC++;
                        break;
                    }
                    if ((cell1.getText().toString().equals("X")) && (cell4.getText().toString().equals("X")) && (cell7.getText().toString().equals("X"))) {
                        cell7.setText("O");
                        isC++;
                        break;
                    }
                    if ((cell2.getText().toString().equals("X")) && (cell5.getText().toString().equals("X")) && (cell8.getText().toString().equals("X"))) {
                        cell7.setText("O");
                        isC++;
                        break;
                    }
                    if ((cell3.getText().toString().equals("X")) && (cell6.getText().toString().equals("X")) && (cell9.getText().toString().equals("X"))) {
                        cell7.setText("O");
                        isC++;
                        break;
                    }
                    if ((cell1.getText().toString().equals("X")) && (cell5.getText().toString().equals("X")) && (cell9.getText().toString().equals("X"))) {
                        cell7.setText("O");
                        isC++;
                        break;
                    }
                    if ((cell3.getText().toString().equals("X")) && (cell5.getText().toString().equals("X")) && (cell7.getText().toString().equals("X"))) {
                        cell7.setText("O");
                        isC++;
                        break;
                    }else{
                        cell7.setText(null);
                    }
                }
                    break;
                case 8: if((cell8.getText().toString().equals(""))) {
                    cell8.setText("X");
                    if ((cell1.getText().toString().equals("X")) && (cell2.getText().toString().equals("X")) && (cell3.getText().toString().equals("X"))) {
                        cell8.setText("O");
                        isC++;
                        break;
                    }
                    if ((cell4.getText().toString().equals("X")) && (cell5.getText().toString().equals("X")) && (cell6.getText().toString().equals("X"))) {
                        cell8.setText("O");
                        isC++;
                        break;
                    }
                    if ((cell7.getText().toString().equals("X")) && (cell8.getText().toString().equals("X")) && (cell9.getText().toString().equals("X"))) {
                        cell8.setText("O");
                        isC++;
                        break;
                    }
                    if ((cell1.getText().toString().equals("X")) && (cell4.getText().toString().equals("X")) && (cell7.getText().toString().equals("X"))) {
                        cell8.setText("O");
                        isC++;
                        break;
                    }
                    if ((cell2.getText().toString().equals("X")) && (cell5.getText().toString().equals("X")) && (cell8.getText().toString().equals("X"))) {
                        cell8.setText("O");
                        isC++;
                        break;
                    }
                    if ((cell3.getText().toString().equals("X")) && (cell6.getText().toString().equals("X")) && (cell9.getText().toString().equals("X"))) {
                        cell8.setText("O");
                        isC++;
                        break;
                    }
                    if ((cell1.getText().toString().equals("X")) && (cell5.getText().toString().equals("X")) && (cell9.getText().toString().equals("X"))) {
                        cell8.setText("O");
                        isC++;
                        break;
                    }
                    if ((cell3.getText().toString().equals("X")) && (cell5.getText().toString().equals("X")) && (cell7.getText().toString().equals("X"))) {
                        cell8.setText("O");
                        isC++;
                        break;
                    }else{
                        cell8.setText(null);
                    }
                }
                    break;
                case 9: if((cell9.getText().toString().equals(""))) {
                    cell9.setText("X");
                    if ((cell1.getText().toString().equals("X")) && (cell2.getText().toString().equals("X")) && (cell3.getText().toString().equals("X"))) {
                        cell9.setText("O");
                        isC++;
                        break;
                    }
                    if ((cell4.getText().toString().equals("X")) && (cell5.getText().toString().equals("X")) && (cell6.getText().toString().equals("X"))) {
                        cell9.setText("O");
                        isC++;
                        break;
                    }
                    if ((cell7.getText().toString().equals("X")) && (cell8.getText().toString().equals("X")) && (cell9.getText().toString().equals("X"))) {
                        cell9.setText("O");
                        isC++;
                        break;
                    }
                    if ((cell1.getText().toString().equals("X")) && (cell4.getText().toString().equals("X")) && (cell7.getText().toString().equals("X"))) {
                        cell9.setText("O");
                        isC++;
                        break;
                    }
                    if ((cell2.getText().toString().equals("X")) && (cell5.getText().toString().equals("X")) && (cell8.getText().toString().equals("X"))) {
                        cell9.setText("O");
                        isC++;
                        break;
                    }
                    if ((cell3.getText().toString().equals("X")) && (cell6.getText().toString().equals("X")) && (cell9.getText().toString().equals("X"))) {
                        cell9.setText("O");
                        isC++;
                        break;
                    }
                    if ((cell1.getText().toString().equals("X")) && (cell5.getText().toString().equals("X")) && (cell9.getText().toString().equals("X"))) {
                        cell9.setText("O");
                        isC++;
                        break;
                    }
                    if ((cell3.getText().toString().equals("X")) && (cell5.getText().toString().equals("X")) && (cell7.getText().toString().equals("X"))) {
                        cell9.setText("O");
                        isC++;
                        break;
                    }else{
                        cell9.setText(null);
                    }
                }
                    break;
            }
        }
        if((cell1.getText().toString().equals("O"))&&(cell2.getText().toString().equals("O"))&&(cell3.getText().toString().equals("O"))){
            OC++;
            OCount.setText(OC+" ");
            Toast.makeText(getApplicationContext(),"Computer Won!!!", Toast.LENGTH_LONG).show();

            anim = findViewById(R.id.laView3);
            anim.playAnimation();

            Animation Anim = AnimationUtils.loadAnimation(activity1vComp.this,R.anim.rotate);
            cell1.setAnimation(Anim);
            cell2.setAnimation(Anim);
            cell3.setAnimation(Anim);

            restart();
            return;
        }
        if((cell4.getText().toString().equals("O"))&&(cell5.getText().toString().equals("O"))&&(cell6.getText().toString().equals("O"))){
            OC++;
            OCount.setText(OC+" ");
            Toast.makeText(getApplicationContext(),"Computer Won!!!", Toast.LENGTH_LONG).show();

            anim = findViewById(R.id.laView3);
            anim.playAnimation();

            Animation Anim = AnimationUtils.loadAnimation(activity1vComp.this,R.anim.rotate);
            cell4.setAnimation(Anim);
            cell5.setAnimation(Anim);
            cell6.setAnimation(Anim);

            restart();
            return;
        }
        if((cell7.getText().toString().equals("O"))&&(cell8.getText().toString().equals("O"))&&(cell9.getText().toString().equals("O"))){
            OC++;
            OCount.setText(OC+" ");
            Toast.makeText(getApplicationContext(),"Computer Won!!!", Toast.LENGTH_LONG).show();

            anim = findViewById(R.id.laView3);
            anim.playAnimation();

            Animation Anim = AnimationUtils.loadAnimation(activity1vComp.this,R.anim.rotate);
            cell7.setAnimation(Anim);
            cell8.setAnimation(Anim);
            cell9.setAnimation(Anim);

            restart();
            return;
        }
        if((cell1.getText().toString().equals("O"))&&(cell4.getText().toString().equals("O"))&&(cell7.getText().toString().equals("O"))){
            OC++;
            OCount.setText(OC+" ");
            Toast.makeText(getApplicationContext(),"Computer Won!!!", Toast.LENGTH_LONG).show();

            anim = findViewById(R.id.laView3);
            anim.playAnimation();

            Animation Anim = AnimationUtils.loadAnimation(activity1vComp.this,R.anim.rotate);
            cell1.setAnimation(Anim);
            cell4.setAnimation(Anim);
            cell7.setAnimation(Anim);

            restart();
            return;
        }
        if((cell2.getText().toString().equals("O"))&&(cell5.getText().toString().equals("O"))&&(cell8.getText().toString().equals("O"))){
            OC++;
            OCount.setText(OC+" ");
            Toast.makeText(getApplicationContext(),"Computer Won!!!", Toast.LENGTH_LONG).show();

            anim = findViewById(R.id.laView3);
            anim.playAnimation();

            Animation Anim = AnimationUtils.loadAnimation(activity1vComp.this,R.anim.rotate);
            cell2.setAnimation(Anim);
            cell5.setAnimation(Anim);
            cell8.setAnimation(Anim);

            restart();
            return;
        }
        if((cell3.getText().toString().equals("O"))&&(cell6.getText().toString().equals("O"))&&(cell9.getText().toString().equals("O"))){
            OC++;
            OCount.setText(OC+" ");
            Toast.makeText(getApplicationContext(),"Computer Won!!!", Toast.LENGTH_LONG).show();

            anim = findViewById(R.id.laView3);
            anim.playAnimation();

            Animation Anim = AnimationUtils.loadAnimation(activity1vComp.this,R.anim.rotate);
            cell3.setAnimation(Anim);
            cell6.setAnimation(Anim);
            cell9.setAnimation(Anim);

            restart();
            return;
        }
        if((cell1.getText().toString().equals("O"))&&(cell5.getText().toString().equals("O"))&&(cell9.getText().toString().equals("O"))){
            OC++;
            OCount.setText(OC+" ");
            Toast.makeText(getApplicationContext(),"Computer Won!!!", Toast.LENGTH_LONG).show();

            anim = findViewById(R.id.laView3);
            anim.playAnimation();

            Animation Anim = AnimationUtils.loadAnimation(activity1vComp.this,R.anim.rotate);
            cell1.setAnimation(Anim);
            cell5.setAnimation(Anim);
            cell9.setAnimation(Anim);

            restart();
            return;
        }
        if((cell3.getText().toString().equals("O"))&&(cell5.getText().toString().equals("O"))&&(cell7.getText().toString().equals("O"))){
            OC++;
            OCount.setText(OC+" ");
            Toast.makeText(getApplicationContext(),"Computer Won!!!", Toast.LENGTH_LONG).show();

            anim = findViewById(R.id.laView3);
            anim.playAnimation();

            Animation Anim = AnimationUtils.loadAnimation(activity1vComp.this,R.anim.rotate);
            cell3.setAnimation(Anim);
            cell5.setAnimation(Anim);
            cell7.setAnimation(Anim);

            restart();
        }

        if(isC==0){
            int count =0;
            while(count==0){
                Random random = new Random();
                int num = random.nextInt(10);
                    switch (num) {
                        case 1:
                            if (cell1.getText().toString().equals("")) {
                                cell1.setText("O");
                                count++;
                            }
                            break;
                        case 2:
                            if (cell2.getText().toString().equals("")) {
                                cell2.setText("O");
                                count++;
                            }
                            break;
                        case 3:
                            if (cell3.getText().toString().equals("")) {
                                cell3.setText("O");
                                count++;
                            }
                            break;
                        case 4:
                            if (cell4.getText().toString().equals("")) {
                                cell4.setText("O");
                                count++;
                            }
                            break;
                        case 5:
                            if (cell5.getText().toString().equals("")) {
                                cell5.setText("O");
                                count++;
                            }
                            break;
                        case 6:
                            if (cell6.getText().toString().equals("")) {
                                cell6.setText("O");
                                count++;
                            }
                            break;
                        case 7:
                            if (cell7.getText().toString().equals("")) {
                                cell7.setText("O");
                                count++;
                            }
                            break;
                        case 8:
                            if (cell8.getText().toString().equals("")) {
                                cell8.setText("O");
                                count++;
                            }
                            break;
                        case 9:
                            if (cell9.getText().toString().equals("")) {
                                cell9.setText("O");
                                count++;
                            }
                            break;
                }
            }
            if((cell1.getText().toString().equals("O"))&&(cell2.getText().toString().equals("O"))&&(cell3.getText().toString().equals("O"))){
                OC++;
                OCount.setText(OC+" ");
                Toast.makeText(getApplicationContext(),"Computer Won!!!", Toast.LENGTH_LONG).show();

                anim = findViewById(R.id.laView3);
                anim.playAnimation();

                Animation Anim = AnimationUtils.loadAnimation(activity1vComp.this,R.anim.rotate);
                cell1.setAnimation(Anim);
                cell2.setAnimation(Anim);
                cell3.setAnimation(Anim);

                restart();
                return;
            }
            if((cell4.getText().toString().equals("O"))&&(cell5.getText().toString().equals("O"))&&(cell6.getText().toString().equals("O"))){
                OC++;
                OCount.setText(OC+" ");
                Toast.makeText(getApplicationContext(),"Computer Won!!!", Toast.LENGTH_LONG).show();

                anim = findViewById(R.id.laView3);
                anim.playAnimation();

                Animation Anim = AnimationUtils.loadAnimation(activity1vComp.this,R.anim.rotate);
                cell4.setAnimation(Anim);
                cell5.setAnimation(Anim);
                cell6.setAnimation(Anim);

                restart();
                return;
            }
            if((cell7.getText().toString().equals("O"))&&(cell8.getText().toString().equals("O"))&&(cell9.getText().toString().equals("O"))){
                OC++;
                OCount.setText(OC+" ");
                Toast.makeText(getApplicationContext(),"Computer Won!!!", Toast.LENGTH_LONG).show();

                anim = findViewById(R.id.laView3);
                anim.playAnimation();

                Animation Anim = AnimationUtils.loadAnimation(activity1vComp.this,R.anim.rotate);
                cell7.setAnimation(Anim);
                cell8.setAnimation(Anim);
                cell9.setAnimation(Anim);

                restart();
                return;
            }
            if((cell1.getText().toString().equals("O"))&&(cell4.getText().toString().equals("O"))&&(cell7.getText().toString().equals("O"))){
                OC++;
                OCount.setText(OC + " ");
                XCount.setText(OC+" ");
                Toast.makeText(getApplicationContext(),"Computer Won!!!", Toast.LENGTH_LONG).show();

                anim = findViewById(R.id.laView3);
                anim.playAnimation();

                Animation Anim = AnimationUtils.loadAnimation(activity1vComp.this,R.anim.rotate);
                cell1.setAnimation(Anim);
                cell4.setAnimation(Anim);
                cell7.setAnimation(Anim);

                restart();
                return;
            }
            if((cell2.getText().toString().equals("O"))&&(cell5.getText().toString().equals("O"))&&(cell8.getText().toString().equals("O"))){
                OC++;
                OCount.setText(OC+" ");
                Toast.makeText(getApplicationContext(),"Computer Won!!!", Toast.LENGTH_LONG).show();

                anim = findViewById(R.id.laView3);
                anim.playAnimation();

                Animation Anim = AnimationUtils.loadAnimation(activity1vComp.this,R.anim.rotate);
                cell2.setAnimation(Anim);
                cell5.setAnimation(Anim);
                cell8.setAnimation(Anim);

                restart();
                return;
            }
            if((cell3.getText().toString().equals("O"))&&(cell6.getText().toString().equals("O"))&&(cell9.getText().toString().equals("O"))){
                OC++;
                OCount.setText(OC+" ");
                Toast.makeText(getApplicationContext(),"Computer Won!!!", Toast.LENGTH_LONG).show();

                anim = findViewById(R.id.laView3);
                anim.playAnimation();

                Animation Anim = AnimationUtils.loadAnimation(activity1vComp.this,R.anim.rotate);
                cell3.setAnimation(Anim);
                cell6.setAnimation(Anim);
                cell9.setAnimation(Anim);

                restart();
                return;
            }
            if((cell1.getText().toString().equals("O"))&&(cell5.getText().toString().equals("O"))&&(cell9.getText().toString().equals("O"))){
                OC++;
                OCount.setText(OC+" ");
                Toast.makeText(getApplicationContext(),"Computer Won!!!", Toast.LENGTH_LONG).show();

                anim = findViewById(R.id.laView3);
                anim.playAnimation();

                Animation Anim = AnimationUtils.loadAnimation(activity1vComp.this,R.anim.rotate);
                cell1.setAnimation(Anim);
                cell5.setAnimation(Anim);
                cell9.setAnimation(Anim);

                restart();
                return;
            }
            if((cell3.getText().toString().equals("O"))&&(cell5.getText().toString().equals("O"))&&(cell7.getText().toString().equals("O"))){
                OC++;
                OCount.setText(OC+" ");
                Toast.makeText(getApplicationContext(),"Computer Won!!!", Toast.LENGTH_LONG).show();

                anim = findViewById(R.id.laView3);
                anim.playAnimation();

                Animation Anim = AnimationUtils.loadAnimation(activity1vComp.this,R.anim.rotate);
                cell3.setAnimation(Anim);
                cell5.setAnimation(Anim);
                cell7.setAnimation(Anim);

                restart();
            }
        }
    }
    private void restart(){
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                cell1.setText("");
                cell2.setText("");
                cell3.setText("");
                cell4.setText("");
                cell5.setText("");
                cell6.setText("");
                cell7.setText("");
                cell8.setText("");
                cell9.setText("");
            }
        },1700);
    }
}