package com.example.dicodingmade_1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {
    ImageView detailPhoto;
    TextView detailTitle;
    TextView detailDate;
    TextView detailDesc;
    public static final String EXTRA_FILMS = "extra_films";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        Film film=getIntent().getParcelableExtra(EXTRA_FILMS);
        if(film != null)
        {
            detailPhoto = findViewById(R.id.imgDetail);
            detailPhoto.setImageResource(film.getImage());
            detailTitle = findViewById(R.id.titleDetail);
            detailTitle.setText(film.getTitle());
            detailDate = findViewById(R.id.dateDetail);
            detailDate.setText("Release Date Film : "+film.getDate());
            detailDesc = findViewById(R.id.descDetail);
            detailDesc.setText("Description : \n"+film.getDescription());
        }

    }
}
