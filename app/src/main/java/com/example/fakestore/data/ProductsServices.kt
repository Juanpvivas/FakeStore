package com.example.fakestore.data

import retrofit2.http.GET

interface ProductsService {
    @GET("products")
    suspend fun getProducts(): List<Product>
}