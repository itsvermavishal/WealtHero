package com.example.wealthero.basic.newbie.chapter1;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.RelativeLayout;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.viewpager2.widget.ViewPager2;

import com.example.wealthero.Dashboard;
import com.example.wealthero.MainActivity;
import com.example.wealthero.R;
import com.example.wealthero.basic.BasicNewbie;
import com.example.wealthero.basic.newbie.chapter2.NewbieChapter2Topic1;

public class BasicNewbieChapter1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_basic_newbie_chapter1);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.basicnewbiechapter1), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        ViewPager2 viewPager = findViewById(R.id.viewPager);
        viewPager.setAdapter(new ViewPagerAdapter(this));

    }
}