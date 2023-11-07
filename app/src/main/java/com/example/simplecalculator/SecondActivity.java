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
        if (intent.hasExtra("hasilOperasi") && intent.hasExtra("bilangan1") && intent.hasExtra("bilangan2") && intent.hasExtra("operasi")) {
            int hasilOperasi = intent.getIntExtra("hasilOperasi", 0);
            int bil1 = intent.getIntExtra("bilangan1", 0);
            int bil2 = intent.getIntExtra("bilangan2", 0);
            String operasi = intent.getStringExtra("operasi");

            String hasilText = "Bilangan 1\t\t:  " + bil1 + "\n" +
                    "Bilangan 2\t\t:  " + bil2 + "\n" +
                    "Operasi\t\t\t\t\t:  " + operasi + "\n" +
                    "Hasil\t\t\t\t\t\t\t\t:  " + hasilOperasi;

            hasilbil.setText(hasilText);
        }
        }
}
