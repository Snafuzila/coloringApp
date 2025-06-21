package com.example.coloring;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ScoreActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score);

        Bundle b = getIntent().getExtras();
        //b.getInt("score");
        TextView score = findViewById(R.id.scorePoints);
        score.setText(Integer.toString(b.getInt("score")));

        Button buttonBack = (Button)findViewById(R.id.BackButton);
        buttonBack.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(ScoreActivity.this, MainPage.class));
            }
        });
        Button Restart = (Button)findViewById(R.id.RestartButton);
        Restart.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(ScoreActivity.this, MainActivity.class));
            }
        });
    }
}
