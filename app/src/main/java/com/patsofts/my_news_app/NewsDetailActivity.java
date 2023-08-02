package com.patsofts.my_news_app;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.patsofts.my_news_app.R;

public class NewsDetailActivity extends AppCompatActivity {

    String title,desc,content,imageURL, url;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news_detail);

        title = getIntent().getStringExtra("title");
        desc = getIntent().getStringExtra("desc");
        content = getIntent().getStringExtra("content");
        imageURL = getIntent().getStringExtra("image");
        url = getIntent().getStringExtra("url");
    }
}
