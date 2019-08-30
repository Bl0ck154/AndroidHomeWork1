package com.example.homework1;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class Task2Activity extends AppCompatActivity {

    Float x = 0f, y = 0f;
    int color[];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task2);

        color = new int[]{255,255,255};

        final LinearLayout LL = (LinearLayout)this.findViewById(R.id.ll1);

        LL.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {

                Float curX = motionEvent.getX();
                Float curY = motionEvent.getY();

                switch (motionEvent.getAction()) {
                    case MotionEvent.ACTION_DOWN:

                        x = curX;
                        y = curY;

                        color[0] = color[1] = color[2] = 255;

                        break;
                    case MotionEvent.ACTION_MOVE:

                        if(Math.abs(curX - x) > Math.abs(curY - y)) {

                            if(color[2] > 1)
                                color[2] -= 2;
                            if(color[0] > 1)
                                color[0] -= 2;
                            LL.setBackgroundColor(Color.rgb(color[0],color[1],color[2]));
                        }
                        else if(Math.abs(curY - y) > Math.abs(curX - x)) {
                            if(color[2] > 1)
                                color[2] -= 2;
                            LL.setBackgroundColor(Color.rgb(color[0],color[1],color[2]));
                        }
                        break;
                }

                return true;
            }
        });
    }
}
