package com.example.wealthero.basic;

import android.content.Intent;
import android.os.Bundle;
import android.widget.RelativeLayout;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.wealthero.R;
import com.example.wealthero.basic.newbie.chapter1.BasicNewbieChapter1;
import com.example.wealthero.basic.newbie.chapter1.NewbieChapter1Topic1;
import com.example.wealthero.basic.newbie.chapter2.NewbieChapter2Topic1;
import com.example.wealthero.basic.newbie.chapter3.NewbieChapter3Topic1;

public class BasicNewbie extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_basic_newbie);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        RelativeLayout newbiechapter1 = findViewById(R.id.newbiechapter1);
        newbiechapter1.setOnClickListener(v -> {
            Intent newbiechapter1intent = new Intent(this, NewbieChapter1Topic1.class);
            startActivity(newbiechapter1intent);
        });

        RelativeLayout newbiechapter2 = findViewById(R.id.newbiechapter2);
        newbiechapter2.setOnClickListener(v -> {
            Intent newbiechapter2intent = new Intent(this, NewbieChapter2Topic1.class);
            startActivity(newbiechapter2intent);
        });

        RelativeLayout newbiechapter3 = findViewById(R.id.newbiechapter3);
        newbiechapter3.setOnClickListener(v -> {
            Intent newbiechapter3intent = new Intent(this, NewbieChapter3Topic1.class);
            startActivity(newbiechapter3intent);
        });

    }
}