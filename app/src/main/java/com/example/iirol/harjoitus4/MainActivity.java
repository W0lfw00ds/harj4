package com.example.iirol.harjoitus4;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TableLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    // Paneeli
    private TableLayout laskuriPaneeli;

    // Plus
    private EditText plus_luku1;
    private TextView plus_teksti;
    private EditText plus_luku2;
    private Button plus_nappi;
    private EditText plus_tulos;

    // Miinus
    private EditText miinus_luku1;
    private TextView miinus_teksti;
    private EditText miinus_luku2;
    private Button miinus_nappi;
    private EditText miinus_tulos;

    // Kerto
    private EditText kerto_luku1;
    private TextView kerto_teksti;
    private EditText kerto_luku2;
    private Button kerto_nappi;
    private EditText kerto_tulos;

    // Jako
    private EditText jako_luku1;
    private TextView jako_teksti;
    private EditText jako_luku2;
    private Button jako_nappi;
    private EditText jako_tulos;

    // Toiminnot
    private Button tyhjennakaikki_nappi;
    private Button naytalogi_nappi;

    // Logi
    private ArrayList<String> logi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.laskuriPaneeli = findViewById(R.id.laskuripaneeli);

        this.plus_luku1 = findViewById(R.id.plus_luku1);
        this.plus_teksti = findViewById(R.id.plus_teksti);
        this.plus_luku2 = findViewById(R.id.plus_luku2);
        this.plus_nappi = findViewById(R.id.plus_nappi);
        this.plus_tulos = findViewById(R.id.plus_tulos);
        this.plus_nappi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                laske(Integer.valueOf(MainActivity.this.plus_luku1.getText().toString()), Integer.valueOf(MainActivity.this.plus_luku2.getText().toString()), MainActivity.this.plus_teksti.getText().toString(), MainActivity.this.plus_tulos);
            }
        });

        // Miinus
        this.miinus_luku1 = findViewById(R.id.miinus_luku1);
        this.miinus_teksti = findViewById(R.id.miinus_teksti);
        this.miinus_luku2 = findViewById(R.id.miinus_luku2);
        this.miinus_nappi = findViewById(R.id.miinus_nappi);
        this.miinus_tulos = findViewById(R.id.miinus_tulos);
        this.miinus_nappi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                laske(Integer.valueOf(MainActivity.this.miinus_luku1.getText().toString()), Integer.valueOf(MainActivity.this.miinus_luku2.getText().toString()), MainActivity.this.miinus_teksti.getText().toString(), MainActivity.this.miinus_tulos);
            }
        });

        // Kerto
        this.kerto_luku1 = findViewById(R.id.kerto_luku1);
        this.kerto_teksti = findViewById(R.id.kerto_teksti);
        this.kerto_luku2 = findViewById(R.id.kerto_luku2);
        this.kerto_nappi = findViewById(R.id.kerto_nappi);
        this.kerto_tulos = findViewById(R.id.kerto_tulos);
        this.kerto_nappi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                laske(Integer.valueOf(MainActivity.this.kerto_luku1.getText().toString()), Integer.valueOf(MainActivity.this.kerto_luku2.getText().toString()), MainActivity.this.kerto_teksti.getText().toString(), MainActivity.this.kerto_tulos);
            }
        });

        // Jako
        this.jako_luku1 = findViewById(R.id.jako_luku1);
        this.jako_teksti = findViewById(R.id.jako_teksti);
        this.jako_luku2 = findViewById(R.id.jako_luku2);
        this.jako_nappi = findViewById(R.id.jako_nappi);
        this.jako_tulos = findViewById(R.id.jako_tulos);
        this.jako_nappi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                laske(Integer.valueOf(MainActivity.this.jako_luku1.getText().toString()), Integer.valueOf(MainActivity.this.jako_luku2.getText().toString()), MainActivity.this.jako_teksti.getText().toString(), MainActivity.this.jako_tulos);
            }
        });

        // Toiminnot
        this.tyhjennakaikki_nappi = findViewById(R.id.tyhjennakaikki_nappi);
        this.tyhjennakaikki_nappi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tyhjenna();
            }
        });

        this.naytalogi_nappi = findViewById(R.id.naytalogi_nappi);
        this.naytalogi_nappi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                naytalogi();
            }
        });

        this.logi = new ArrayList<>();
    }

    private void laske(int luku1, int luku2, String operaattori, TextView tulosKentta) {

        int tulos = 0;

        switch (operaattori) {

            case "+":
                tulos = (luku1 + luku2);
                break;

            case "-":
                tulos = (luku1 - luku2);
                break;

            case "x":
                tulos = (luku1 * luku2);
                break;

            case "/":
                tulos = luku1 / luku2;
                break;
        }

        // Lisää logiin
        logi.add(luku1 + " " + operaattori + " " + luku2 + " = " + tulos);

        // Aseta tulos tuloskenttään
        tulosKentta.setText(String.valueOf(tulos));
    }

    private void tyhjenna() {

        this.plus_luku1.setText("");
        this.plus_luku2.setText("");
        this.plus_tulos.setText("");

        this.miinus_luku1.setText("");
        this.miinus_luku2.setText("");
        this.miinus_tulos.setText("");

        this.kerto_luku1.setText("");
        this.kerto_luku2.setText("");
        this.kerto_tulos.setText("");

        this.jako_luku1.setText("");
        this.jako_luku2.setText("");
        this.jako_tulos.setText("");
    }

    private void naytalogi() {

    }
}
