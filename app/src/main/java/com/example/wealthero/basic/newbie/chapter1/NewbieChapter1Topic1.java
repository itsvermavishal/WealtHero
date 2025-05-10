package com.example.wealthero.basic.newbie.chapter1;

import android.content.Intent;
import android.os.Bundle;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.widget.ImageButton;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;


import com.example.wealthero.R;

public class NewbieChapter1Topic1 extends AppCompatActivity {

    private GestureDetector gestureDetector;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_newbie_chapter1_topic1);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        ImageButton newbiechapter1topic1buttonnext = findViewById(R.id.btnNext);
        newbiechapter1topic1buttonnext.setOnClickListener(v -> {
            Intent newbiechapter1topic1buttonnextintent = new Intent(this, NewbieChapter1Topic2.class);
            startActivity(newbiechapter1topic1buttonnextintent);
            finishAfterTransition();
        });

        //  Initialize Gesture Detector
        gestureDetector = new GestureDetector(this, new GestureListener());
    }

    public boolean onTouchEvent(MotionEvent event){
        return gestureDetector.onTouchEvent(event);
    }

    private class GestureListener extends GestureDetector.SimpleOnGestureListener {
        private static final int SWIPE_THRESHOLD = 100;
        private static final int SWIPE_VELOCITY_THRESHOLD = 100;
        public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) {
            assert e1 != null;
            float diffX = e2.getX() - e1.getX();

            if (Math.abs(diffX) > SWIPE_THRESHOLD && Math.abs(velocityX) > SWIPE_VELOCITY_THRESHOLD) {
                if (diffX < 0) {
                    // Swipe left -> Next Activity
                    Intent intent = new Intent(NewbieChapter1Topic1.this, NewbieChapter1Topic2.class);
                    startActivity(intent);
                    overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
                    finishAfterTransition();
                }
                return true;
            }
            return false;
        }
    }
}