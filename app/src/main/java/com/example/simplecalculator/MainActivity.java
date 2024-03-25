package com.example.simplecalculator;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    private TextView answer;
    private Button add, sub;

    private EditText num1, num2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

       answer = findViewById(R.id.textView3);
       add = findViewById(R.id.button);
       sub = findViewById(R.id.button2);
       num1 = findViewById(R.id.editTextText);
       num2 = findViewById(R.id.editTextText2);

       add.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               int a = Integer.parseInt(num1.getText().toString());
               int b = Integer.parseInt(num2.getText().toString());
               int c = a+b;
               answer.setText("Answer: " + c);
           }
       });

       sub.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               int a = Integer.parseInt(num1.getText().toString());
               int b = Integer.parseInt(num2.getText().toString());
               int c = a-b;
               answer.setText("Answer: " + c);
           }
       });
    }
}