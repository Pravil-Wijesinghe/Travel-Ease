package com.example.TravelEase;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    private TextView title,description,score;
    private PopularDomain item;
    private ImageView backImg,mainImg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        initview();
        setVariables();

    }

    private void setVariables() {
        title.setText(item.getTitle());
        description.setText(item.getDescription());
        score.setText((int) item.getScore());

        backImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

    }

    private void initview() {
        title = findViewById(R.id.titleText);
        description = findViewById(R.id.description);
        mainImg = findViewById(R.id.mainImage);
        score = findViewById(R.id.score);
        backImg = findViewById(R.id.backImg);

    }
}