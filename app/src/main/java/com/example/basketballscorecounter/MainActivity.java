package com.example.basketballscorecounter;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    int scoreofteamA=0;
    int scoreofteamB=0;
    View view;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(scoreofteamA);
        displayForTeamB(scoreofteamB);
        view=findViewById(R.id.re);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId()==R.id.back){
            view.setBackgroundResource(R.drawable.back);
        }
        return super.onOptionsItemSelected(item);
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