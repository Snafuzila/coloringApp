package com.example.coloring;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.BatteryManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Info extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);


        IntentFilter ifilter = new IntentFilter(Intent.ACTION_BATTERY_CHANGED);
        Intent batteryStatus = this.registerReceiver(null, ifilter);

        int level = batteryStatus.getIntExtra(BatteryManager.EXTRA_LEVEL, -1);
        int scale = batteryStatus.getIntExtra(BatteryManager.EXTRA_SCALE, -1);
        int batteryPct = (level * 100 /scale);

        TextView BatteryTV = findViewById(R.id.BatteryTV);
        BatteryTV.setText("battery: " + (batteryPct)+"%");
        Button buttonBack = (Button)findViewById(R.id.BackButton);
        buttonBack.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(Info.this, MainPage.class));
            }
        });
    }
}
