package com.example.playit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class genre_page extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_genre_page);

        //onclick listener of pop button
        ImageButton popBtn = findViewById(R.id.popbtn);
        popBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent popIntent = new Intent(getApplicationContext(), pop_genre.class);
                startActivity(popIntent);
            }
        });

        //onclick listener of hiphop button
        ImageButton hiphopBtn = findViewById(R.id.hiphopbtn);
        hiphopBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent hiphopIntent = new Intent(getApplicationContext(), hiphop_genre.class);
                startActivity(hiphopIntent);
            }
        });

        //onclick listener of r&b button
        ImageButton rnbBtn = findViewById(R.id.rnbbtn);
        rnbBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent rnbIntent = new Intent(getApplicationContext(), rnb_genre.class);
                startActivity(rnbIntent);
            }
        });

        //onclick listener of Afrobeats button
        ImageButton afroBtn = findViewById(R.id.afrobtn);
        afroBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent afroIntent = new Intent(getApplicationContext(), afro_genre.class);
                startActivity(afroIntent);
            }
        });
    }
}