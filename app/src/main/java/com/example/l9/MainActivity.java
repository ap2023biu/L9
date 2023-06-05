package com.example.l9;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MotionEvent;
import android.widget.AbsoluteLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.Toast;

import com.example.l9.R;

public class MainActivity extends AppCompatActivity {

    private RelativeLayout layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        layout = findViewById(R.id.main_layout);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        float x = event.getX();
        float y = event.getY();

        ImageView newImage = new ImageView(this);
        newImage.setImageResource(R.drawable.smashed_glass);

        RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams(200, 200);
        params.leftMargin = (int) x - 100;
        params.topMargin = (int) y - 100;

        layout.addView(newImage, params);

        return true;
    }
}