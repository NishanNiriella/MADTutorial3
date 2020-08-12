package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btn;
    TextView txtMessage;
    EditText num1, num2;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = findViewById(R.id.btnOK);
        num1 = findViewById(R.id.numberInput1);
        num2 = findViewById(R.id.numberInput2);

        /*//Creating the LayoutInflater instance
        LayoutInflater li = getLayoutInflater();
        //Getting the view object as defined in the customtoast.xml file
        View layout = li.inflate(R.layout.customtoast,(ViewGroup)findViewById(R.id.custom_toast_layout));

        //Creating the Toast object
        Toast toast = new Toast(getApplicationContext());
        toast.setDuration(Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER_VERTICAL,0,0);
        toast.setView(layout); //Setting the view of custom toast layout
        toast.show();*/
    }

    @Override
    protected void onResume() {
        super.onResume();

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String number1 = String.valueOf(num1.getText());
                String number2 = String.valueOf(num2.getText());
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("NUMBER1", number1);
                intent.putExtra("NUMBER2", number2);
                startActivity(intent);

//              creating a toast to display a message when the button is clicked
                Context context = getApplicationContext();
                CharSequence message = "You are just clicked the OK Button";
                int duration = Toast.LENGTH_SHORT;
                Toast toast = Toast.makeText(context,message,duration);
                toast.show();
            }
        });
    }
}