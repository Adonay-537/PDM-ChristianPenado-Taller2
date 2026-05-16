package com.example.com.pdm0126.foodspoott.data

import com.example.com.pdm0126.foodspoott.model.Restaurant

interface RestaurantRepository {
    suspend fun getRestaurants(): List<Restaurant>
    suspend fun getRestaurantById(id: Int): Restaurant?
    suspend fun searchRestaurants(query: String): List<Restaurant>
}