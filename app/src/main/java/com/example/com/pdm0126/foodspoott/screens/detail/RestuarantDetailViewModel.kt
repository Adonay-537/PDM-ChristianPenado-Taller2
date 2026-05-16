package com.example.com.pdm0126.foodspoott.screens.detail

import androidx.lifecycle.ViewModel
import com.example.com.pdm0126.foodspoott.data.RestaurantRepository
import com.example.com.pdm0126.foodspoott.data.RestaurantRepositoryImpl
import com.example.com.pdm0126.foodspoott.model.Restaurant
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

class RestaurantDetailViewModel(
    private val repository: RestaurantRepository = RestaurantRepositoryImpl()
) : ViewModel() {

    private val _restaurant = MutableStateFlow<Restaurant?>(null)
    val restaurant: StateFlow<Restaurant?> = _restaurant.asStateFlow()

    fun loadRestaurant(id: Int) {
        _restaurant.value = repository.getRestaurantById(id)
    }
}