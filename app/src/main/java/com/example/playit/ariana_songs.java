package com.example.playit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ariana_songs extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ariana_songs);

        //on click listeners for song buttons
        Button btnOne = findViewById(R.id.button1);
        btnOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent songoneIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=1BYr1br2Ee4"));
                startActivity(songoneIntent);
            }
        });

        Button btnTwo = findViewById(R.id.button2);
        btnTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent songtwoIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=ffxKSjUwKdU"));
                startActivity(songtwoIntent);
            }
        });

        Button btnThree = findViewById(R.id.button3);
        btnThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent songthreeIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=kHLHSlExFis"));
                startActivity(songthreeIntent);
            }
        });
    }
}