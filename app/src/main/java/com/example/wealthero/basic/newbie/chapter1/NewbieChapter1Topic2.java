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

public class NewbieChapter1Topic2 extends AppCompatActivity {

    private GestureDetector gestureDetector;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_newbie_chapter1_topic2);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        ImageButton newbiechapter1topic2buttonprevious = findViewById(R.id.btnPrevious);
        newbiechapter1topic2buttonprevious.setOnClickListener(v -> {
            Intent newbiechapter1topic2buttonpreviousintent = new Intent(this, NewbieChapter1Topic1.class);
            startActivity(newbiechapter1topic2buttonpreviousintent);
            finishAfterTransition();
        });

        ImageButton newbiechapter1topic2buttonnext = findViewById(R.id.btnNext);
        newbiechapter1topic2buttonnext.setOnClickListener(v -> {
            Intent newbiechapter1topic2buttonnextintent = new Intent(this, NewbieChapter1Topic3.class);
            startActivity(newbiechapter1topic2buttonnextintent);
            finishAfterTransition();
        });

        gestureDetector = new GestureDetector(this, new GestureListener());
    }

    public boolean onTouchEvent(MotionEvent event) {
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
                    // Swipe left -> Third Activity
                    Intent intent = new Intent(NewbieChapter1Topic2.this, NewbieChapter1Topic3.class);
                    startActivity(intent);
                    overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
                    finishAfterTransition();
                } else {
                    // Swipe right -> Previous Activity (Main Activity)
                    Intent intent = new Intent(NewbieChapter1Topic2.this, NewbieChapter1Topic1.class);
                    startActivity(intent);
                    overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
                    finishAfterTransition();
                }
                return true;
            }
            return false;
        }
    }
}