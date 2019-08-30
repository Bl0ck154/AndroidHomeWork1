package com.example.homework1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Task3Activity extends AppCompatActivity {

    String num1;
    char sign;
    TextView display;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task3);

        display = this.findViewById(R.id.display);
    }

    public void btnClick(View view) {
        Button btn = (Button)view;

        String dispText = (String) display.getText();
        CharSequence btnText = btn.getText();
        if(btnText.equals("⌫")) {
            if(dispText.length() > 0) {
                display.setText(dispText.substring(0, dispText.length()-1));
            }
        }
        else if(btnText.equals("C") || btnText.equals("CE")) {
            display.setText("");
        }
        else if(isSign(btnText)) {
            if(!isSign(String.valueOf(dispText.charAt(dispText.length()-1)))) {
                num1 = dispText;
                display.setText(dispText + "" + btnText);
            }
        }
        else if(btnText.equals("=")) {
            if(Character.isDefined(sign)) {
                if(Integer.parseInt(dispText) == 0 && sign == '/') {
                    display.setText("YOU IDIOT!!!");
                    return;
                }
                int answer = action(Integer.parseInt(num1), sign, Integer.parseInt(dispText));
                display.setText(String.valueOf(answer));
            }
        }
        else {
            if(dispText.length() > 0) {
                char lastChar = dispText.charAt(dispText.length()-1);
                if (isSign(String.valueOf(lastChar))) {
                    sign = lastChar;
                    dispText = "";
                }
            }
            display.setText(dispText + "" + btnText);
        }
    }

    boolean isSign(CharSequence str) {
        char c = str.charAt(0);
        return c == '*' || c == '/' || c == '+' || c == '-';
    }

    int action(int num1, char sign, int num2) {
        switch (sign) {
            case '+':
                return num1 + num2;
            case '-':
                return num1 - num2;
            case '*':
                return num1 * num2;
            case '/':
                return num1 / num2;
        }
        return 0;
    }
}
