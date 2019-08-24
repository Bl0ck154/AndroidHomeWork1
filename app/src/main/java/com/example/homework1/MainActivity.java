package com.example.homework1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btn1OnClick(View view) {
        Intent intent = new Intent(MainActivity.this, Task1Activity.class);
        startActivity(intent);
    }

    public void btn2OnClick(View view) {
        Intent intent = new Intent(MainActivity.this, Task2Activity.class);
        startActivity(intent);
    }

    public void btn3OnClick(View view) {
        Intent intent = new Intent(MainActivity.this, Task3Activity.class);
        startActivity(intent);
    }
}
