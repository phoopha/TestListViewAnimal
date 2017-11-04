package com.example.user.testlistview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.user.testlistview.model.Animal;

import java.text.CollationElementIterator;

public class AnimalDetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animal_details);

        ImageView animalImageView = (ImageView) findViewById(R.id.animal_image_view);
        TextView nameTextView = (TextView) findViewById(R.id.animal_text_view);

        Intent intent = getIntent();
        String name = intent.getStringExtra("name");
        getSupportActionBar().setTitle(name);
        int picture = intent.getIntExtra("picture", 0);
        //int position = intent.getIntExtra("position", 0);

        String detile = intent.getStringExtra("niphawan");

        nameTextView.setText(detile);
        animalImageView.setImageResource(picture);

        //getSupportActionBar().setTitle(name);
    }
}
