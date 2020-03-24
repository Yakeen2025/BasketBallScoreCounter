package com.example.basketballscorecounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    int scoreofteamA=0;
    int scoreofteamB=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(scoreofteamA);
        displayForTeamB(scoreofteamB);
    }
    public void sendthree(View view) {
        scoreofteamA=scoreofteamA+3;
        displayForTeamA(scoreofteamA);
    }
    public void sendtwo(View view) {
        scoreofteamA=scoreofteamA+2;
        displayForTeamA(scoreofteamA);
    }
    public void sendfree(View view) {
        scoreofteamA=scoreofteamA+1;
        displayForTeamA(scoreofteamA);
    }
    public void sendthreeb(View view) {
        scoreofteamB=scoreofteamB+3;
        displayForTeamB(scoreofteamB);
    }
    public void sendtwob(View view) {
        scoreofteamB=scoreofteamB+2;
        displayForTeamB(scoreofteamB);
    }
    public void sendfreeb(View view) {
        scoreofteamB=scoreofteamB+1;
        displayForTeamB(scoreofteamB);
    }
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
    public void sendreset(View view) {
        scoreofteamA=0;
        scoreofteamB=0;
        displayForTeamA(scoreofteamA);
        displayForTeamB(scoreofteamB);
    }
}