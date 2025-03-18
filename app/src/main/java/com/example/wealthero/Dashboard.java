package com.example.wealthero;

import android.content.Intent;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.wealthero.dashboard.Basic;
import com.example.wealthero.dashboard.ComingSoon;
import com.example.wealthero.dashboard.Comodity;
import com.example.wealthero.dashboard.Fno;
import com.example.wealthero.dashboard.Fundamental;
import com.example.wealthero.dashboard.Others;
import com.example.wealthero.dashboard.PersonalFinance;
import com.example.wealthero.dashboard.Technical;

public class Dashboard extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        CardView basic, fundamental, technical, comodity, fno, personalfinance, others, comingsoon;
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_dashboard);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        basic = findViewById(R.id.basiccardclick);
        fundamental = findViewById(R.id.fundamentalcardclick);
        technical = findViewById(R.id.technicalcardclick);
        comodity = findViewById(R.id.comoditycardclick);
        fno = findViewById(R.id.futurecardclick);
        personalfinance = findViewById(R.id.personalcardclick);
        others = findViewById(R.id.otherscardclick);
        comingsoon = findViewById(R.id.comingsooncardclick);

        basic.setOnClickListener(v -> {
                Intent basicintent = new Intent(this, Basic.class);
                startActivity(basicintent);
        });

        fundamental.setOnClickListener(v -> {
                Intent fundamentalintent = new Intent(this, Fundamental.class);
                startActivity(fundamentalintent);
        });

        technical.setOnClickListener(v -> {
                Intent technicalintent = new Intent(this, Technical.class);
                startActivity(technicalintent);
        });

        comodity.setOnClickListener(v -> {
                Intent comodityintent = new Intent(this, Comodity.class);
                startActivity(comodityintent);
        });

        fno.setOnClickListener(v -> {
                Intent fnointent = new Intent(this, Fno.class);
                startActivity(fnointent);
        });

        personalfinance.setOnClickListener(v -> {
                Intent personalfinanceintent = new Intent(this, PersonalFinance.class);
                startActivity(personalfinanceintent);
        });

        others.setOnClickListener(v -> {
                Intent othersintent = new Intent(this, Others.class);
                startActivity(othersintent);
        });

        comingsoon.setOnClickListener(v -> {
                Intent comingsoonintent = new Intent(this, ComingSoon.class);
                startActivity(comingsoonintent);
        });



    }
}