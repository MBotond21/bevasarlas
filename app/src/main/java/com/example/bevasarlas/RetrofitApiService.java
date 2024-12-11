package com.example.bevasarlas;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface RetrofitApiService {

    @GET("lFdUM1/data")
    Call<List<Product>> getProducts();

}
