package com.example.testapp;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiClients {
    private static Retrofit sRetrofit=null;
    public static final String BASE_URL = "https://jsonplaceholder.typicode.com";
    public static Retrofit getClient(){
        if (sRetrofit==null){
            sRetrofit=new Retrofit.Builder().baseUrl(BASE_URL).addConverterFactory(GsonConverterFactory.create()).build();
        }
        return sRetrofit;
    }
}
