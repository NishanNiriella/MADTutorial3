package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
//  declaring variables
    int num3, num4, res1;
    TextView txt1;
    TextView txt2;
    TextView res;
    Button btn_add, btn_sub, btn_mul, btn_div;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

//      making connection between the layout and the objects
        txt1 = findViewById(R.id.tv5);
        txt2 = findViewById(R.id.tv6);
        res = findViewById(R.id.result);
        btn_add = findViewById(R.id.addition);
        btn_sub = findViewById(R.id.substraction);
        btn_mul = findViewById(R.id.multiplication);
        btn_div = findViewById(R.id.division);

//      getting values from the main activity
        txt1.setText(getIntent().getStringExtra("NUMBER1"));
        txt2.setText(getIntent().getStringExtra("NUMBER2"));

    }

    @Override
    protected void onResume() {
        super.onResume();
//      on click command for addition button
        btn_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num3 = Integer.parseInt(txt1.getText().toString());
                num4 = Integer.parseInt(txt2.getText().toString());
                res1 = num3 + num4;

                //converting result as text that is to be shown in the interface
                res.setText(num3 + " + " + num4 + " = " + Integer.toString(res1));
            }
        });

//      on click command for substraction button
        btn_sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num3 = Integer.parseInt(txt1.getText().toString());
                num4 = Integer.parseInt(txt2.getText().toString());
                res1 = num3 - num4;
                res.setText(num3 + " - " + num4 + " = " + Integer.toString(res1));
            }
        });

//      on click command for multiplication button
        btn_mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num3 = Integer.parseInt(txt1.getText().toString());
                num4 = Integer.parseInt(txt2.getText().toString());
                res1 = num3 * num4;
                res.setText(num3 + " * " + num4 + " = " + Integer.toString(res1));
            }
        });

//      on click command for division button
        btn_div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num3 = Integer.parseInt(txt1.getText().toString());
                num4 = Integer.parseInt(txt2.getText().toString());
                double value = (double)num3 / num4;
                res.setText(num3 + " / " + num4 + " = " + Double.toString(value));
            }
        });
    }
}