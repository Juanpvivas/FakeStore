package com.example.fakestore.presentation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import com.example.fakestore.data.Product

@Composable
fun MainScreen(navController: NavHostController, products: List<Product>) {
    ProductGrid(products = products) { selectedProduct ->
        navController.navigate("productDetail/${selectedProduct.id}")
    }
}