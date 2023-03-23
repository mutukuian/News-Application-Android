package com.example.dailynews;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.dailynews.Models.NewsHeadLines;
import com.squareup.picasso.Picasso;

public class DetailsActivity extends AppCompatActivity {

    NewsHeadLines headLines;
    TextView txt_title,txt_author,txt_time,txt_detail,txt_content;
    ImageView img_news;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        txt_detail=findViewById(R.id.text_detail_detail);
        txt_title=findViewById(R.id.text_detail_title);
        txt_content=findViewById(R.id.text_detail_content);
        txt_time=findViewById(R.id.text_detail_time);
        txt_author=findViewById(R.id.text_detail_author);
        img_news=findViewById(R.id.img_detail_news);

        headLines=(NewsHeadLines) getIntent().getSerializableExtra("data");

        txt_title.setText(headLines.getTitle());
        txt_author.setText(headLines.getAuthor());
        txt_detail.setText(headLines.getDescription());
        txt_time.setText(headLines.getPublishedAt());
        txt_content.setText(headLines.getContent());

        Picasso.get().load(headLines.getUrlToImage()).into(img_news);
    }
}