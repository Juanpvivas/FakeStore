package com.example.fakestore.data

import javax.inject.Inject

class ProductsRepository @Inject constructor(private val productsService: ProductsService) {
    suspend fun getProducts(): List<Product> {
        return productsService.getProducts()
    }
}