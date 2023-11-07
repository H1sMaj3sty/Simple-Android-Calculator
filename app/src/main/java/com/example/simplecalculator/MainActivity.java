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

        int result = 0;
    }

    public void tambah(View view) {
        int angka1 = Integer.parseInt(bilangan1.getText().toString());
        int angka2 = Integer.parseInt(bilangan2.getText().toString());

        int result = angka1 + angka2;

        kirim(angka1, angka2, result, "+ (Add)");
    }

    public void kurang(View view) {
        int angka1 = Integer.parseInt(bilangan1.getText().toString());
        int angka2 = Integer.parseInt(bilangan2.getText().toString());

        int result = angka1 - angka2;

        kirim(angka1, angka2, result, "- (Minus)");
    }

    public void kali(View view) {
        int angka1 = Integer.parseInt(bilangan1.getText().toString());
        int angka2 = Integer.parseInt(bilangan2.getText().toString());

        int result = angka1 * angka2;

        kirim(angka1, angka2, result, "* (Multiply)");
    }

    public void bagi(View view) {
        int angka1 = Integer.parseInt(bilangan1.getText().toString());
        int angka2 = Integer.parseInt(bilangan2.getText().toString());

        int result = angka1 / angka2;

        kirim(angka1, angka2, result, "/ (Divide)");
    }

    public void kirim(int angka1, int angka2, int result, String operasi) {
        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra("hasilOperasi", result);
        intent.putExtra("bilangan1", angka1);
        intent.putExtra("bilangan2", angka2);
        intent.putExtra("operasi", operasi);


        startActivity(intent);
    }
}