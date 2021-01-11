package com.example.testapp;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInterface {
    @GET("/comments")
    Call<List<Data>> getData();
}
