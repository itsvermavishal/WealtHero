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
import com.example.wealthero.basic.BasicExtraordinary;
import com.example.wealthero.basic.BasicGoat;
import com.example.wealthero.basic.BasicNewbie;
import com.example.wealthero.basic.BasicTopper;

public class Basic extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_basic);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        CardView newbie = findViewById(R.id.basicnewbie);
        newbie.setOnClickListener(v -> {
            Intent newbieintent = new Intent(this, BasicNewbie.class);
            startActivity(newbieintent);
        });

        CardView average = findViewById(R.id.basicaverage);
        average.setOnClickListener(v -> {
            Intent averageintent = new Intent(this, BasicAverage.class);
            startActivity(averageintent);
        });

        CardView topper = findViewById(R.id.basictopper);
        topper.setOnClickListener(v -> {
            Intent topperintent = new Intent(this, BasicTopper.class);
            startActivity(topperintent);
        });

        CardView extraordinary = findViewById(R.id.basicextraordinary);
        extraordinary.setOnClickListener(v -> {
            Intent extraordinaryintent = new Intent(this, BasicExtraordinary.class);
            startActivity(extraordinaryintent);
        });

        CardView goat = findViewById(R.id.basicgoat);
        goat.setOnClickListener(v -> {
            Intent goatintent = new Intent(this, BasicGoat.class);
            startActivity(goatintent);
        });

    }
}