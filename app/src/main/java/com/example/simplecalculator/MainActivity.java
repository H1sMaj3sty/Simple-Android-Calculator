package com.example.simplecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText bilangan1, bilangan2;
    Button tambah, kurang, bagi, kali;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bilangan1 = findViewById(R.id.bilangan1);
        bilangan2 = findViewById(R.id.bilangan2);

    }

    public void tambah(View view) {
        double angka1 = Integer.parseInt(bilangan1.getText().toString());
        double angka2 = Integer.parseInt(bilangan2.getText().toString());

        double result = angka1 + angka2;

        kirim(angka1, angka2, result, 0, "+ (Add)");
    }

    public void kurang(View view) {
        double angka1 = Integer.parseInt(bilangan1.getText().toString());
        double angka2 = Integer.parseInt(bilangan2.getText().toString());

        double result = angka1 - angka2;

        kirim(angka1, angka2, result, 0, "- (Minus)");
    }

    public void kali(View view) {
        double angka1 = Integer.parseInt(bilangan1.getText().toString());
        double angka2 = Integer.parseInt(bilangan2.getText().toString());

        double result = angka1 * angka2;

        kirim(angka1, angka2, result, 0, "* (Multiply)");
    }

    public void bagi(View view) {
        double angka1 = Integer.parseInt(bilangan1.getText().toString());
        double angka2 = Integer.parseInt(bilangan2.getText().toString());
        double mod = angka1 % angka2;

        double result = angka1 / angka2;

        kirim(angka1, angka2, result, mod,"/ (Divide)");
    }

    public void kirim(double angka1, double angka2, double result, double mod, String operasi) {
        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra("hasilOperasi", result);
        intent.putExtra("bilangan1", angka1);
        intent.putExtra("bilangan2", angka2);
        intent.putExtra("modulus", mod);
        intent.putExtra("operasi", operasi);

        startActivity(intent);
    }
}