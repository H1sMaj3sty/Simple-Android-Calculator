package com.example.simplecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity{
    TextView hasilbil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_layout);

        hasilbil = findViewById(R.id.hasil);

        Intent intent = getIntent();
        if (intent.hasExtra("hasilOperasi") && intent.hasExtra("bilangan1") && intent.hasExtra("bilangan2") && intent.hasExtra("modulus") && intent.hasExtra("operasi")) {
            double hasilOperasi = intent.getDoubleExtra("hasilOperasi", 0);
            double bil1 = intent.getDoubleExtra("bilangan1", 0);
            double bil2 = intent.getDoubleExtra("bilangan2", 0);
            double mod = intent.getDoubleExtra("modulus", 0);
            String operasi = intent.getStringExtra("operasi");

            String hasilText = "Bilangan 1\t\t:  " + bil1 + "\n" +
                    "Bilangan 2\t\t:  " + bil2 + "\n" +
                    "Operasi\t\t\t\t\t:  " + operasi + "\n" +
                    "Modulus\t\t\t\t: " + mod + "\n" +
                    "Hasil\t\t\t\t\t\t\t\t:  " + hasilOperasi;

            hasilbil.setText(hasilText);
        }
        }
}
