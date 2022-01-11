package com.example.geek;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    ImageView findBooks;  //optional
    TextView findbooks1; //recommend
    TextView textVPastPapers; //recommend
    TextView other;
    TextView yourContent;
    TextView q_a;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         //find books
        ImageView findBooks = findViewById(R.id.findBooks);
        TextView findbooksClick2 = findViewById(R.id.findBooks1);

        //find papers
        TextView textVPastpapers = findViewById(R.id.textVPastPapers);

        TextView other = findViewById(R.id.textViewOther);
        TextView yourContent = findViewById(R.id.textViewContent);
        TextView q_a = findViewById(R.id.textViewQ_A);

        //q_a Intent
        q_a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent q_aIntent = new Intent(getBaseContext(),q_a_Activity.class);
                startActivity(q_aIntent);
            }
        });

        //content intent
        yourContent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent contentIntent = new Intent(getBaseContext(),uploadActivity.class);
                startActivity(contentIntent);
            }
        });

        //other intent
        other.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent otherIntent = new Intent(getBaseContext(),otherActivity.class);
                startActivity(otherIntent);
            }
        });



        //find books intents
        //text click most reliable
        findbooksClick2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent findbooksClick2 = new Intent(getBaseContext(), findBooksActivity.class);
                startActivity(findbooksClick2);
            }
        });
        //for image click [must be removed in future]
        findBooks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent findBooksIntent = new Intent(getBaseContext(), findBooksActivity.class);
                startActivity(findBooksIntent);
            }
        });
        //past papers intent
        textVPastpapers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pastPapers = new Intent(getBaseContext(),pastPapersActivity.class);
                startActivity(pastPapers);
            }
        });
    }
}