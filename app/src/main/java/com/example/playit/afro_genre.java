package com.example.playit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class afro_genre extends AppCompatActivity {
    String artists[] = {"POPULAR ARTISTS", "Wizkid", "Tems", "Burnaboy", "Fireboy DML"};
    String songs[] = {"POPULAR SONGS", "Free Mind", "Emiliana", "Dimension", "Calm Down"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_afro_genre);

        // adding spinner1 options
        Spinner spinner = findViewById(R.id.spinner);
        ArrayAdapter adapOne = new ArrayAdapter(this, android.R.layout.simple_spinner_item, artists);
        adapOne.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapOne);

        //onselect listeners for artists
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                if(i == 1){
                    Intent wizIntent = new Intent(getApplicationContext(), Wizkid_songs.class);
                    startActivity(wizIntent);
                }

                else if(i == 2){
                    Intent temsIntent = new Intent(getApplicationContext(), Tems_songs.class);
                    startActivity(temsIntent);
                }

                else if(i == 3){
                    Intent burnaIntent = new Intent(getApplicationContext(), Burnaboy_songs.class);
                    startActivity(burnaIntent);
                }

                else if(i == 4){
                    Intent fireIntent = new Intent(getApplicationContext(), Fireboy_songs.class);
                    startActivity(fireIntent);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                // auto-generated method-stub - we do nothing
            }
        });

        // adding spinner2 options
        Spinner spinnerTwo = findViewById(R.id.spinner2);
        ArrayAdapter adapTwo = new ArrayAdapter(this, android.R.layout.simple_spinner_item, songs);
        adapTwo.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerTwo.setAdapter(adapTwo);

        //onselect listeners for songs
        spinnerTwo.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int pos, long l) {
                // adding link based on selected value
                if(pos == 1){
                    Intent freeIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=tQiNQL-FEgU"));
                    startActivity(freeIntent);
                }

                else if(pos == 2){
                    Intent emilIntent= new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=Ypr5QN7Xn_M&list=RDYpr5QN7Xn_M&start_radio=1"));
                    startActivity(emilIntent);
                }

                else if(pos == 3){
                    Intent dimenIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=3QWCjiZSdGQ"));
                    startActivity(dimenIntent);
                }
                else if(pos == 4){
                    Intent calmIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=CQLsdm1ZYAw"));
                    startActivity(calmIntent);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                // auto-generated method-stub - we do nothing
            }
        });
    }
}