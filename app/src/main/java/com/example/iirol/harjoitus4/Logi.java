package com.example.iirol.harjoitus4;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

import java.util.ArrayList;

public class Logi extends AppCompatActivity {

    private TableLayout logiTableLayout;
    private ArrayList<String> logit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logi);

        this.logiTableLayout = findViewById(R.id.logiTableLayout);

        // Lue lähetetyt logit
        this.logit = getIntent().getStringArrayListExtra("logit");

        // Luo logeista rivit
        this.listaaLogit();
    }

    private void listaaLogit() {

        // Jos yhtään logia ei ole, näytä eri teksti
        if (this.logit.isEmpty()) {

            // Lisää yksi itemi erikoistekstillä
            this.lisaaRivi("Yhtään laskua ei ole suoritettu!", true);

        } else {

            // Mene kaikki saadut logit läpi
            boolean boldaaTeksti = true;
            for (String logi : this.logit) {

                // Lisää uusi rivi
                this.lisaaRivi(logi, boldaaTeksti);

                // Vaihda boldaus joka toiselle riville
                boldaaTeksti = !boldaaTeksti;
            }

        }
    }

    private void lisaaRivi(String teksti, boolean boldattuna) {

        // Luo uusi teksti-itemi jolla teksti näytetään UI:lla
        TextView tekstiItemi = new TextView(this);
        tekstiItemi.setText(teksti);
        tekstiItemi.setTextSize(14);

        // Aseta rivi boldiksi, jos haluttu
        if (boldattuna) {
            tekstiItemi.setTypeface(null, Typeface.BOLD);
        }

        // Luo uusi rivi ja lisää teksti sen lapseksi
        TableRow uusiRivi = new TableRow(this);
        uusiRivi.setPadding(5, 5, 5, 5);
        uusiRivi.addView(tekstiItemi);

        // Lisää uusi rivi parentin lapseksi
        this.logiTableLayout.addView(uusiRivi);

    }
}
