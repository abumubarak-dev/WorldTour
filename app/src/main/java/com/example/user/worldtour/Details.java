package com.example.user.worldtour;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.RatingBar;

public class Details extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.details);

        RatingBar ratingBar= findViewById(R.id.ratingBar);

        ratingBar.setRating(4.5f);

    }
}
