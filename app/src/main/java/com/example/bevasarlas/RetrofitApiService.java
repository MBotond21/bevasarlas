package com.example.bevasarlas;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;

public interface RetrofitApiService {

    @GET("Qy9vk7/data")
    Call<List<Product>> getProducts();

    @POST("Qy9vk7/data")
    Call<Product> createProduct(@Body Product product);

    @DELETE("Qy9vk7/data/{id}")
    Call<Void> deleteProduct(@Path("id") int id);

}
