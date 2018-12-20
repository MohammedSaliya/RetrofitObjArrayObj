package com.example.star.retrofit.ApiClass;

import com.example.star.retrofit.Bean.AllService;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInterface {


    @GET("services")
    Call<AllService> getservice();
}
