package com.example.playit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class pop_genre extends AppCompatActivity {
    String artists[] = {"POPULAR ARTISTS", "Ariana Grande", "Doja Cat", "Dua Lipa", "Justin Bieber"};
    String songs[] = {"POPULAR SONGS", "pov", "Blinding Lights", "Sunflower", "Adore You"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pop_genre);

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
                    Intent ariIntent = new Intent(getApplicationContext(), ariana_songs.class);
                    startActivity(ariIntent);
                }

                else if(i == 2){
                    Intent dojaIntent = new Intent(getApplicationContext(), doja_songs.class);
                    startActivity(dojaIntent);
                }

                else if(i == 3){
                    Intent duaIntent = new Intent(getApplicationContext(), dua_songs.class);
                    startActivity(duaIntent);
                }

                else if(i == 4){
                    Intent duaIntent = new Intent(getApplicationContext(), justin_songs.class);
                    startActivity(duaIntent);
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
                    Intent povIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=nQJEp-k-ogs"));
                    startActivity(povIntent);
                }

                else if(pos == 2){
                    Intent lightsIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=fHI8X4OXluQ"));
                    startActivity(lightsIntent);
                }

                else if(pos == 3){
                    Intent flowerIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=ApXoWvfEYVU"));
                    startActivity(flowerIntent);
                }
                else if(pos == 4){
                    Intent adoreIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=iquhBgM-Qv0"));
                    startActivity(adoreIntent);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                // auto-generated method-stub - we do nothing
            }
        });
    }
}