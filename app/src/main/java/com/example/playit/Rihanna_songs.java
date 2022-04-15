package com.example.playit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Rihanna_songs extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rihanna_songs);

        //on click listeners for song buttons
        Button btnOne = findViewById(R.id.button1);
        btnOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent songoneIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=6ma3y4yz2mw"));
                startActivity(songoneIntent);
            }
        });

        Button btnTwo = findViewById(R.id.button2);
        btnTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent songtwoIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=U0CGsw6h60k"));
                startActivity(songtwoIntent);
            }
        });

        Button btnThree = findViewById(R.id.button3);
        btnThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent songthreeIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=QPb93EJcQBw"));
                startActivity(songthreeIntent);
            }
        });
    }
}