package com.example.fakestore.domain

import com.example.fakestore.data.Product
import com.example.fakestore.data.ProductsRepository
import javax.inject.Inject

class ProductsUseCase @Inject constructor(private val productsRepository: ProductsRepository) {
    suspend fun getProducts(): List<Product> {
        return productsRepository.getProducts()
    }
}