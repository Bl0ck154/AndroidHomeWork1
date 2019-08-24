package com.example.homework1;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;

public class Task2Activity extends AppCompatActivity {

    Float x = 0f, y = 0f;
    int color;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task2);

        color = Color.argb(255,255,255,255);
        final LinearLayout LL = (LinearLayout)this.findViewById(R.id.ll1);

        LL.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                int action = motionEvent.getAction();
                if(action == MotionEvent.ACTION_MOVE)
                {
                    Float curX = motionEvent.getX();
                    Float curY = motionEvent.getY();

                    LL.setBackgroundColor(Color.GREEN);

                    x = curX;
                    y = curX;
                }

                return false;
            }
        });
    }
}
