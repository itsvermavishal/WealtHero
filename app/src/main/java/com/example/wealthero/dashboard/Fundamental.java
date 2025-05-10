package com.example.wealthero.dashboard;

import android.content.Intent;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.wealthero.R;
import com.example.wealthero.basic.BasicAverage;
import com.example.wealthero.basic.BasicExceptional;
import com.example.wealthero.basic.BasicGoat;
import com.example.wealthero.basic.BasicNewbie;
import com.example.wealthero.basic.BasicTopper;
import com.example.wealthero.fundamental.FundamentalAverage;
import com.example.wealthero.fundamental.FundamentalExceptional;
import com.example.wealthero.fundamental.FundamentalGoat;
import com.example.wealthero.fundamental.FundamentalNewbie;
import com.example.wealthero.fundamental.FundamentalTopper;

public class Fundamental extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_fundamental);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        CardView newbie = findViewById(R.id.fundamentalnewbie);
        newbie.setOnClickListener(v -> {
            Intent newbieintent = new Intent(this, FundamentalNewbie.class);
            startActivity(newbieintent);
        });

        CardView average = findViewById(R.id.fundamentalaverage);
        average.setOnClickListener(v -> {
            Intent averageintent = new Intent(this, FundamentalAverage.class);
            startActivity(averageintent);
        });

        CardView topper = findViewById(R.id.fundamentaltopper);
        topper.setOnClickListener(v -> {
            Intent topperintent = new Intent(this, FundamentalTopper.class);
            startActivity(topperintent);
        });

        CardView exceptional = findViewById(R.id.fundamentalexceptional);
        exceptional.setOnClickListener(v -> {
            Intent exceptionalintent = new Intent(this, FundamentalExceptional.class);
            startActivity(exceptionalintent);
        });

        CardView goat = findViewById(R.id.fundamentalgoat);
        goat.setOnClickListener(v -> {
            Intent goatintent = new Intent(this, FundamentalGoat.class);
            startActivity(goatintent);
        });

    }
}