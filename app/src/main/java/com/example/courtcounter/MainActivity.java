package com.example.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import javax.xml.transform.Templates;

public class MainActivity extends AppCompatActivity {
    int score1=0;
    int score2=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void threePoints(View view)
    {
        score1=score1+3;
        displayForTeamA(score1);

    }
    public void twoPoints(View view)
    {
        score1=score1+2;
        displayForTeamA(score1);

    }
    public void freeThrow(View view)
    {
        score1=score1+1;
        displayForTeamA(score1);

    }
    public void threePointsB(View view)
    {
        score2=score2+3;
        displayForTeamB(score2);

    }
    public void twoPointsB(View view)
    {
        score2=score2+2;
        displayForTeamB(score2);

    }
    public void freeThrowB(View view)
    {
        score2=score2+1;
        displayForTeamB(score2);

    }

    public void reset(View view)
    {
        score1=0;
        score2=0;
        displayForTeamA(score1);
        displayForTeamB(score2);
    }




    public void displayForTeamA(int score)
    {
        TextView scoreView=(TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
    public void displayForTeamB(int score)
    {
        TextView scoreView2=(TextView) findViewById(R.id.team_b_score);
        scoreView2.setText(String.valueOf(score));
    }
}
