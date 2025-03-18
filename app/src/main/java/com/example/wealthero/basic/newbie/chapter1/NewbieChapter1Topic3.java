package com.example.wealthero.basic.newbie.chapter1;

import android.content.Intent;
import android.os.Bundle;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.widget.ImageButton;
import android.widget.RelativeLayout;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.wealthero.R;
import com.example.wealthero.basic.newbie.chapter3.NewbieChapter3Topic1;

public class NewbieChapter1Topic3 extends AppCompatActivity {

    private GestureDetector gestureDetector;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_newbie_chapter1_topic3);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        ImageButton newbiechapter1topic3buttonprevious = findViewById(R.id.newbiechapter1topic3buttonprevious);
        newbiechapter1topic3buttonprevious.setOnClickListener(v -> {
            Intent newbiechapter1topic3buttonpreviousintent = new Intent(this, NewbieChapter1Topic2.class);
            startActivity(newbiechapter1topic3buttonpreviousintent);
        });

        gestureDetector = new GestureDetector(this, new GestureListener());
    }

    public boolean onTouchEvent(MotionEvent event) {
        return gestureDetector.onTouchEvent(event);
    }

    private class GestureListener extends GestureDetector.SimpleOnGestureListener {
        private static final int SWIPE_THRESHOLD = 100;
        private static final int SWIPE_VELOCITY_THRESHOLD = 100;

        @Override
        public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) {
            float diffX = e2.getX() - e1.getX();

            if (Math.abs(diffX) > SWIPE_THRESHOLD && Math.abs(velocityX) > SWIPE_VELOCITY_THRESHOLD) {
                if (diffX > 0) {
                    // Swipe right -> Go back to Second Activity
                    Intent intent = new Intent(NewbieChapter1Topic3.this, NewbieChapter1Topic2.class);
                    startActivity(intent);
                    overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
                }
                return true;
            }
            return false;
        }
    }
}