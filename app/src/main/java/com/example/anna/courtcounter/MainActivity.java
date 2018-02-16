package com.example.anna.courtcounter;

import android.graphics.drawable.AnimationDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {
    int Ascore = 0;
    int Bscore = 0;
    TextView team_a_score;
    TextView team_b_score;
    View root;
    static final String STATE_USER = "user";
    private String mUser;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        final ImageView img;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        team_a_score = (TextView) findViewById(R.id.team_a_score);
        team_b_score = (TextView) findViewById(R.id.team_b_score);
        View someView = findViewById(R.id.maincolor);
        root = someView.getRootView();
        img = (ImageView) findViewById(R.id.img);
        img.post(new Runnable() {
            @Override
            public void run() {
                ((AnimationDrawable) img.getBackground()).start();
            }
        });
    }

    public void colorDisplay(int Ascore, int Bscore) {
        if (Ascore == Bscore) {
            root.setBackgroundColor(getResources().getColor(android.R.color.white));
        }

        if (Ascore > Bscore) {
            root.setBackgroundColor(getResources().getColor(android.R.color.holo_red_light));
        }
        if (Ascore < Bscore) {
            root.setBackgroundColor(getResources().getColor(android.R.color.holo_green_light));
        }
    }

    public void three(View view) {
        Ascore = Ascore + 3;
        team_a_score.setText(String.valueOf(Ascore));
        colorDisplay( Ascore, Bscore);


    }

    public void two(View view) {
        Ascore = Ascore + 2;
        team_a_score.setText(String.valueOf(Ascore));
        colorDisplay( Ascore, Bscore);

    }

    public void one(View view) {
        Ascore = Ascore + 1;
        team_a_score.setText(String.valueOf(Ascore));
        colorDisplay( Ascore, Bscore);
    }

    public void threeB(View view) {
        Bscore = Bscore + 3;
        team_b_score.setText(String.valueOf(Bscore));
        colorDisplay( Ascore, Bscore);

    }

    public void twoB(View view) {
        Bscore = Bscore + 2;
        team_b_score.setText(String.valueOf(Bscore));
        colorDisplay( Ascore, Bscore);

    }

    public void oneB(View view) {
        Bscore = Bscore + 1;
        team_b_score.setText(String.valueOf(Bscore));
        colorDisplay( Ascore, Bscore);
    }

    public void reset(View view) {
        Bscore = 0;
        Ascore = 0;
        team_b_score.setText(String.valueOf(Bscore));
        team_a_score.setText(String.valueOf(Ascore));
        if (Ascore == Bscore) {
            root.setBackgroundColor(getResources().getColor(android.R.color.white));
        }
    }
}
