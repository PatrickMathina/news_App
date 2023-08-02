package com.patsofts.my_news_app.Interfaces;

import com.patsofts.my_news_app.Models.NewsModal;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Url;

public interface RetrofitAPI {
    @GET
    Call<NewsModal> getAllNews(@Url String url);

    @GET
    Call<NewsModal>getNewsByCategory(@Url String url);
}
