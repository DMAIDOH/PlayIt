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

public class hiphop_genre extends AppCompatActivity {
    String artists[] = {"POPULAR ARTISTS", "Kendrick Lamar", "Nicki Minaj", "Drake", "Travis Scott"};
    String songs[] = {"POPULAR SONGS", "Yosemite", "The way life goes", "Get into it (Yuh)", "RAPSTAR"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hiphop_genre);

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
                    Intent kennyIntent = new Intent(getApplicationContext(), kendrick_songs.class);
                    startActivity(kennyIntent);
                }

                else if(i == 2){
                    Intent nickiIntent = new Intent(getApplicationContext(), Nicki_songs.class);
                    startActivity(nickiIntent);
                }

                else if(i == 3){
                    Intent  drakeIntent= new Intent(getApplicationContext(), Drake_songs.class);
                    startActivity(drakeIntent);
                }

                else if(i == 4){
                    Intent  travisIntent= new Intent(getApplicationContext(), Travis_songs.class);
                    startActivity(travisIntent);
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
                    Intent yoseIntent= new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=ykMHDKB0-1o"));
                    startActivity(yoseIntent);
                }

                else if(pos == 2){
                    Intent lifeIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=6ZNJMnqeMh8"));
                    startActivity(lifeIntent);
                }

                else if(pos == 3){
                    Intent intoIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=zln8SZO6yYY"));
                    startActivity(intoIntent);
                }
                else if(pos == 4){
                    Intent  rapstarIntent= new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=w2IhccXakkE"));
                    startActivity(rapstarIntent);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                // auto-generated method-stub - we do nothing
            }
        });
    }
}