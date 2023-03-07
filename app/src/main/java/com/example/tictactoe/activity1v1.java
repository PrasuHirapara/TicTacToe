package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.airbnb.lottie.LottieAnimationView;

public class activity1v1 extends AppCompatActivity {
    private static int flag = 0,XC=00,OC=00;
    Button cell1,cell2,cell3,cell4,cell5,cell6,cell7,cell8,cell9;
    TextView XCount,OCount,score,sX,sO;

    LottieAnimationView anim;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity1v1);

        iniBut();

        Animation inVi = AnimationUtils.loadAnimation(activity1v1.this, R.anim.alpha);
        Animation move_d1 = AnimationUtils.loadAnimation(activity1v1.this, R.anim.move_d1);
        Animation move_d2 = AnimationUtils.loadAnimation(activity1v1.this, R.anim.move_d2);
        Animation move_down_x = AnimationUtils.loadAnimation(activity1v1.this, R.anim.move_down_x);
        Animation move_down_y = AnimationUtils.loadAnimation(activity1v1.this, R.anim.move_down_y);
        Animation move_up_x = AnimationUtils.loadAnimation(activity1v1.this, R.anim.move_up_x);
        Animation move_up_y = AnimationUtils.loadAnimation(activity1v1.this, R.anim.move_up_y);
        Animation move_d3 = AnimationUtils.loadAnimation(activity1v1.this, R.anim.move_d3);
        Animation move_d4 = AnimationUtils.loadAnimation(activity1v1.this, R.anim.move_d4);

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
            if(flag==0){
                curBut.setText("X");
                flag = 1;
            }else{
                curBut.setText("O");
                flag = 0;
            }
        }else{
            Toast.makeText(getApplicationContext(),"Cell is already Filled.", Toast.LENGTH_SHORT).show();
        }
        if((cell1.getText().toString().equals("X"))&&(cell2.getText().toString().equals("X"))&&(cell3.getText().toString().equals("X"))){
            XC++;
           XCount.setText(XC+" ");

            Toast.makeText(getApplicationContext(),"Player X Won!!!", Toast.LENGTH_LONG).show();

            anim = findViewById(R.id.laView5);

            Animation Anim = AnimationUtils.loadAnimation(activity1v1.this,R.anim.rotate);
            cell1.setAnimation(Anim);
            cell2.setAnimation(Anim);
            cell3.setAnimation(Anim);

            restart();
        }
        if((cell4.getText().toString().equals("X"))&&(cell5.getText().toString().equals("X"))&&(cell6.getText().toString().equals("X"))){
            XC++;
            XCount.setText(XC+" ");

            Toast.makeText(getApplicationContext(),"Player X Won!!!", Toast.LENGTH_LONG).show();

            anim = findViewById(R.id.laView5);
            anim.playAnimation();

            Animation Anim = AnimationUtils.loadAnimation(activity1v1.this,R.anim.rotate);
            cell4.setAnimation(Anim);
            cell5.setAnimation(Anim);
            cell6.setAnimation(Anim);

            restart();
        }
        if((cell1.getText().toString().equals("X"))&&(cell4.getText().toString().equals("X"))&&(cell7.getText().toString().equals("X"))){
            XC++;
            XCount.setText(XC+" ");
            Toast.makeText(getApplicationContext(),"Player X Won!!!", Toast.LENGTH_LONG).show();

            anim = findViewById(R.id.laView5);
            anim.playAnimation();

            Animation Anim = AnimationUtils.loadAnimation(activity1v1.this,R.anim.rotate);
            cell1.setAnimation(Anim);
            cell4.setAnimation(Anim);
            cell7.setAnimation(Anim);

            restart();
        }
        if((cell7.getText().toString().equals("X"))&&(cell8.getText().toString().equals("X"))&&(cell9.getText().toString().equals("X"))){
            XC++;
            XCount.setText(XC+" ");
            Toast.makeText(getApplicationContext(),"Player X Won!!!", Toast.LENGTH_LONG).show();

            anim = findViewById(R.id.laView5);
            anim.playAnimation();

            Animation Anim = AnimationUtils.loadAnimation(activity1v1.this,R.anim.rotate);
            cell7.setAnimation(Anim);
            cell8.setAnimation(Anim);
            cell9.setAnimation(Anim);

            restart();
        }
        if((cell2.getText().toString().equals("X"))&&(cell5.getText().toString().equals("X"))&&(cell8.getText().toString().equals("X"))){
            XC++;
            XCount.setText(XC+" ");
            Toast.makeText(getApplicationContext(),"Player X Won!!!", Toast.LENGTH_LONG).show();

            anim = findViewById(R.id.laView5);
            anim.playAnimation();

            Animation Anim = AnimationUtils.loadAnimation(activity1v1.this,R.anim.rotate);
            cell5.setAnimation(Anim);
            cell2.setAnimation(Anim);
            cell8.setAnimation(Anim);

            restart();
        }
        if((cell3.getText().toString().equals("X"))&&(cell6.getText().toString().equals("X"))&&(cell9.getText().toString().equals("X"))){
            XC++;
            XCount.setText(XC+" ");
            Toast.makeText(getApplicationContext(),"Player X Won!!!", Toast.LENGTH_LONG).show();

            anim = findViewById(R.id.laView5);
            anim.playAnimation();

            Animation Anim = AnimationUtils.loadAnimation(activity1v1.this,R.anim.rotate);
            cell3.setAnimation(Anim);
            cell6.setAnimation(Anim);
            cell9.setAnimation(Anim);

            restart();
        }
        if((cell1.getText().toString().equals("X"))&&(cell5.getText().toString().equals("X"))&&(cell9.getText().toString().equals("X"))){
            XC++;
            XCount.setText(XC+" ");
            Toast.makeText(getApplicationContext(),"Player X Won!!!", Toast.LENGTH_LONG).show();

            anim = findViewById(R.id.laView5);
            anim.playAnimation();

            Animation Anim = AnimationUtils.loadAnimation(activity1v1.this,R.anim.rotate);
            cell1.setAnimation(Anim);
            cell5.setAnimation(Anim);
            cell9.setAnimation(Anim);

            restart();
        }
        if((cell3.getText().toString().equals("X"))&&(cell5.getText().toString().equals("X"))&&(cell7.getText().toString().equals("X"))){
            XC++;
            XCount.setText(XC+" ");
            Toast.makeText(getApplicationContext(),"Player X Won!!!", Toast.LENGTH_LONG).show();

            anim = findViewById(R.id.laView5);
            anim.playAnimation();

            Animation Anim = AnimationUtils.loadAnimation(activity1v1.this,R.anim.rotate);
            cell3.setAnimation(Anim);
            cell5.setAnimation(Anim);
            cell7.setAnimation(Anim);

            restart();
        }


        if((cell1.getText().toString().equals("O"))&&(cell2.getText().toString().equals("O"))&&(cell3.getText().toString().equals("O"))){
            OC++;
            OCount.setText(OC+" ");
            Toast.makeText(getApplicationContext(),"Player O Won!!!", Toast.LENGTH_LONG).show();

            anim = findViewById(R.id.laView5);
            anim.playAnimation();

            Animation Anim = AnimationUtils.loadAnimation(activity1v1.this,R.anim.rotate);
            cell1.setAnimation(Anim);
            cell2.setAnimation(Anim);
            cell3.setAnimation(Anim);

            restart();
        }
        if((cell4.getText().toString().equals("O"))&&(cell5.getText().toString().equals("O"))&&(cell6.getText().toString().equals("O"))){
            OC++;
            OCount.setText(OC+" ");
            Toast.makeText(getApplicationContext(),"Player O Won!!!", Toast.LENGTH_LONG).show();

            anim = findViewById(R.id.laView5);
            anim.playAnimation();

            Animation Anim = AnimationUtils.loadAnimation(activity1v1.this,R.anim.rotate);
            cell4.setAnimation(Anim);
            cell5.setAnimation(Anim);
            cell6.setAnimation(Anim);

            restart();
        }
        if((cell7.getText().toString().equals("O"))&&(cell8.getText().toString().equals("O"))&&(cell9.getText().toString().equals("O"))){
            OC++;
            OCount.setText(OC+" ");
            Toast.makeText(getApplicationContext(),"Player O Won!!!", Toast.LENGTH_LONG).show();

            anim = findViewById(R.id.laView5);
            anim.playAnimation();

            Animation Anim = AnimationUtils.loadAnimation(activity1v1.this,R.anim.rotate);
            cell7.setAnimation(Anim);
            cell8.setAnimation(Anim);
            cell9.setAnimation(Anim);

            restart();
        }
        if((cell1.getText().toString().equals("O"))&&(cell4.getText().toString().equals("O"))&&(cell7.getText().toString().equals("O"))){
            OC++;
            OCount.setText(OC+" ");
            Toast.makeText(getApplicationContext(),"Player O Won!!!", Toast.LENGTH_LONG).show();

            anim = findViewById(R.id.laView5);
            anim.playAnimation();

            Animation Anim = AnimationUtils.loadAnimation(activity1v1.this,R.anim.rotate);
            cell1.setAnimation(Anim);
            cell4.setAnimation(Anim);
            cell7.setAnimation(Anim);

            restart();
        }
        if((cell2.getText().toString().equals("O"))&&(cell5.getText().toString().equals("O"))&&(cell8.getText().toString().equals("O"))){
            OC++;
            OCount.setText(OC+" ");
            Toast.makeText(getApplicationContext(),"Player O Won!!!", Toast.LENGTH_LONG).show();

            anim = findViewById(R.id.laView5);
            anim.playAnimation();

            Animation Anim = AnimationUtils.loadAnimation(activity1v1.this,R.anim.rotate);
            cell2.setAnimation(Anim);
            cell5.setAnimation(Anim);
            cell8.setAnimation(Anim);

            restart();
        }
        if((cell3.getText().toString().equals("O"))&&(cell6.getText().toString().equals("O"))&&(cell9.getText().toString().equals("O"))){
            OC++;
            OCount.setText(OC+" ");
            Toast.makeText(getApplicationContext(),"Player O Won!!!", Toast.LENGTH_LONG).show();

            anim = findViewById(R.id.laView5);
            anim.playAnimation();

            Animation Anim = AnimationUtils.loadAnimation(activity1v1.this,R.anim.rotate);
            cell3.setAnimation(Anim);
            cell6.setAnimation(Anim);
            cell9.setAnimation(Anim);

            restart();
        }
        if((cell1.getText().toString().equals("O"))&&(cell5.getText().toString().equals("O"))&&(cell9.getText().toString().equals("O"))){
            OC++;
            OCount.setText(OC+" ");
            Toast.makeText(getApplicationContext(),"Player O Won!!!", Toast.LENGTH_LONG).show();

            anim = findViewById(R.id.laView5);
            anim.playAnimation();

            Animation Anim = AnimationUtils.loadAnimation(activity1v1.this,R.anim.rotate);
            cell1.setAnimation(Anim);
            cell5.setAnimation(Anim);
            cell9.setAnimation(Anim);

            restart();
        }
        if((cell3.getText().toString().equals("O"))&&(cell5.getText().toString().equals("O"))&&(cell7.getText().toString().equals("O"))){
            OC++;
            OCount.setText(OC+" ");
            Toast.makeText(getApplicationContext(),"Player O Won!!!", Toast.LENGTH_LONG).show();

            anim = findViewById(R.id.laView5);
            anim.playAnimation();

            Animation Anim = AnimationUtils.loadAnimation(activity1v1.this,R.anim.rotate);
            cell3.setAnimation(Anim);
            cell5.setAnimation(Anim);
            cell7.setAnimation(Anim);

            restart();
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

                                            Animation Anim = AnimationUtils.loadAnimation(activity1v1.this,R.anim.rotate);
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
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
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
                flag=0;
            }
        },1700);
    }
}