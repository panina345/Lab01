package com.example.lab1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText editText;
    private TextView textView;
    double liters;
    double gallons;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.editText);
        textView = findViewById(R.id.textView);
    }
    public void onButtonClick(View v) {
        liters = Double.parseDouble(editText.getText().toString());
        gallons = liters*0.264172;
        textView.setText(String.valueOf(gallons));
    }
}
