package com.example.volumecalculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Sphere extends AppCompatActivity {

    EditText sphereRadius;
    TextView title, result;
    Button btnCalcultate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sphere);

        sphereRadius = findViewById(R.id.et_sphere);
        title = findViewById(R.id.textView2);
        result = findViewById(R.id.tv_result);
        btnCalcultate = findViewById(R.id.btn_result);


        btnCalcultate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String radius = sphereRadius.getText().toString();

                int r = Integer.parseInt(radius);

                double volume = (4/3) * 3.14159 * r * r * r;
                result.setText("V = " + volume + " m^3");
            }
        });

    }
}