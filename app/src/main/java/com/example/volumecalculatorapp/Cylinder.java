package com.example.volumecalculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Cylinder extends AppCompatActivity {

    EditText cylinderRadius;
    EditText cylinderHeigth;
    TextView title, result;
    Button btnCalcultate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cylinder);

        cylinderRadius = findViewById(R.id.et_radius);
        cylinderHeigth = findViewById(R.id.et_height);
        title = findViewById(R.id.tv_cylinder);
        result = findViewById(R.id.tv_result);
        btnCalcultate = findViewById(R.id.btn_result);


        btnCalcultate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String radius = cylinderRadius.getText().toString();
                String height = cylinderHeigth.getText().toString();

                int r = Integer.parseInt(radius);
                int h = Integer.parseInt(height);

                double volume = h * 3.14159 * r * r;
                result.setText("V = " + volume + " m^3");
            }
        });

    }
}