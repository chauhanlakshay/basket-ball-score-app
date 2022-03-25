package com.example.basketballscoreapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    int score1 = 0, score2 = 0;
    public void incrementThreeOfA(View view){
        TextView aScore = findViewById(R.id.ScoreOfA);
        score1 += 3;
        aScore.setText("" + score1);
    }
    public void incrementTwoOfA(View view){
        TextView aScore = findViewById(R.id.ScoreOfA);
        score1 += 2;
        aScore.setText("" + score1);
    }
    public void incrementOneOfA(View view){
        TextView aScore = findViewById(R.id.ScoreOfA);
        aScore.setText("" + ++score1);
    }
    public void incrementThreeOfB(View view){
        TextView aScore = findViewById(R.id.ScoreOfB);
        score2 += 3;
        aScore.setText("" + score2);
    }
    public void incrementTwoOfB(View view){
        TextView aScore = findViewById(R.id.ScoreOfB);
        score2 += 2;
        aScore.setText("" + score2);
    }
    public void incrementOneOfB(View view){
        TextView aScore = findViewById(R.id.ScoreOfB);
        aScore.setText("" + ++score2);
    }
    public void ResetScore(View view){
        TextView aScore = findViewById(R.id.ScoreOfA);
        aScore.setText("" + 0);
        TextView bScore = findViewById(R.id.ScoreOfB);
        bScore.setText("" + 0);
    }
}