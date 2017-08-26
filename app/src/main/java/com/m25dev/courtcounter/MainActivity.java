package com.m25dev.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvTeamA;
    TextView tvTeamB;
    TextView tvScoreA;
    TextView tvScoreB;

    int aScore = 0;
    int bScore = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvScoreA = (TextView) findViewById(R.id.team_a_score);
        tvScoreB = (TextView) findViewById(R.id.team_b_score);

        tvTeamA = (TextView) findViewById(R.id.team_a_text_view);
        tvTeamB = (TextView) findViewById(R.id.team_b_text_view);
    }

    void addThreePoints(View view) {

        if(view.getTag().toString().equals("teamA")) {
            aScore += 3;
            display(tvScoreA, aScore);

        } else {

            bScore += 3;
            display(tvScoreB, bScore);
        }
    }

    void addTwoPoints(View view) {

        if(view.getTag().toString().equals("teamA")) {
            aScore += 2;
            display(tvScoreA, aScore);

        } else {

            bScore += 2;
            display(tvScoreB, bScore);
        }
    }

    void addOnePoint(View view) {

        if(view.getTag().toString().equals("teamA")) {
            aScore += 1;
            display(tvScoreA, aScore);

        } else {

            bScore += 1;
            display(tvScoreB, bScore);
        }
    }

    void reset(View view) {

        aScore = 0;
        bScore = 0;

        display(tvScoreA, aScore);
        display(tvScoreB, bScore);
    }

    void display(View view, int score) {
        TextView textView = (TextView) view;
        textView.setText(String.valueOf(score));
    }
}
