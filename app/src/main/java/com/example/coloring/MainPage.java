package com.example.coloring;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_page);

        Button buttonStart = (Button)findViewById(R.id.StartButton);
        buttonStart.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(MainPage.this, MainActivity.class));
            }
        });

        Button buttonHowToPlay = (Button)findViewById(R.id.HowToPlayButton);
        buttonHowToPlay.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(MainPage.this, HowToPlay.class));
            }
        });

        Button buttonInfo = (Button)findViewById(R.id.InfoButton);
        buttonInfo.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(MainPage.this, Info.class));
            }
        });
    }


}