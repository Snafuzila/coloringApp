package com.example.coloring;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {

    Game game;
    Timer timer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        game = new Game(this);
        timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                Intent intent = new Intent(MainActivity.this, ScoreActivity.class); //intent to go to the next activity after X delay.
                Bundle b = new Bundle(); // method of saving information for the next activity.
                b.putInt("score", game.score); // Saving id score by key, to next activity
                intent.putExtras(b); // Put id to next Intent
                startActivity(intent); // start the activity that in the intent.
                finish();
            }
        },20000); // X milliseconds delay
    }
}
