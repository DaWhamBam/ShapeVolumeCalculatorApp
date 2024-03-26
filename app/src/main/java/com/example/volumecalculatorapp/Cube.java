package com.example.volumecalculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Cube extends AppCompatActivity {

    EditText cubelength;
    TextView title, result;
    Button btnCalcultate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cube);

        cubelength = findViewById(R.id.et_cube);
        title = findViewById(R.id.tv_cube);
        result = findViewById(R.id.tv_result);
        btnCalcultate = findViewById(R.id.btn_result);


        btnCalcultate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String length = cubelength.getText().toString();

                int l = Integer.parseInt(length);

                double volume = l * l * l;
                result.setText("V = " + volume + " m^3");
            }
        });

    }
}