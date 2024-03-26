package com.example.volumecalculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Prism extends AppCompatActivity {

    EditText prismBaseLength;
    EditText prismHeigth;
    EditText prismLength;
    TextView title, result;
    Button btnCalcultate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prism);

        prismBaseLength = findViewById(R.id.et_lengthPrismbase);
        prismHeigth = findViewById(R.id.et_height);
        prismLength = findViewById(R.id.et_prismlength);
        title = findViewById(R.id.tv_prism);
        result = findViewById(R.id.tv_result);
        btnCalcultate = findViewById(R.id.btn_result);


        btnCalcultate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String length = prismLength.getText().toString();
                String height = prismHeigth.getText().toString();
                String baseLength = prismBaseLength.getText().toString();

                int l = Integer.parseInt(length);
                int h = Integer.parseInt(height);
                int bl = Integer.parseInt(baseLength);

                double volume = 0.5 * bl * h * l;
                result.setText("V = " + volume + " m^3");
            }
        });

    }
}