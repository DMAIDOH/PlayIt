package com.example.playit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class rnb_genre extends AppCompatActivity {
    String artists[] = {"POPULAR ARTISTS", "Beyonce", "Rihanna", "6lack", "Giveon"};
    String songs[] = {"POPULAR SONGS", "Pick up your feelings", "Nights like this", "Love lies", "Seasons"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rnb_genre);

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
                    Intent beyIntent = new Intent(getApplicationContext(), Beyonce_songs.class);
                    startActivity(beyIntent);
                }

                else if(i == 2){
                    Intent rihIntent = new Intent(getApplicationContext(), Rihanna_songs.class);
                    startActivity(rihIntent);
                }

                else if(i == 3){
                    Intent blackIntent = new Intent(getApplicationContext(), Black_songs.class);
                    startActivity(blackIntent);
                }

                else if(i == 4){
                    Intent giveonIntent = new Intent(getApplicationContext(), Giveon_songs.class);
                    startActivity(giveonIntent);
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
                    Intent feelingsIntent= new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=fkMRkQbVLVU"));
                    startActivity(feelingsIntent);
                }

                else if(pos == 2){
                    Intent nightsIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=S1QSsM1yT80"));
                    startActivity(nightsIntent);
                }

                else if(pos == 3){
                    Intent loveIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=xYtsL9znopI"));
                    startActivity(loveIntent);
                }
                else if(pos == 4){
                    Intent seasonsIntent= new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=sP82GCicFgA"));
                    startActivity(seasonsIntent);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                // auto-generated method-stub - we do nothing
            }
        });
    }
}