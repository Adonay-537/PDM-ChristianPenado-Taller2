package com.example.com.pdm0126.foodspoott.screens.list

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.com.pdm0126.foodspoott.data.RestaurantRepository
import com.example.com.pdm0126.foodspoott.data.RestaurantRepositoryImpl
import com.example.com.pdm0126.foodspoott.model.Restaurant
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class RestaurantListViewModel(
    private val repository: RestaurantRepository = RestaurantRepositoryImpl()
) : ViewModel() {

    private val _uiState = MutableStateFlow<Map<String, List<Restaurant>>>(emptyMap())
    val uiState: StateFlow<Map<String, List<Restaurant>>> = _uiState.asStateFlow()
    private val _isLoading = MutableStateFlow(false)
    val isLoading: StateFlow<Boolean> = _isLoading.asStateFlow()

    init {
        loadRestaurants()
    }

    private fun loadRestaurants() {
        viewModelScope.launch {
            _isLoading.value = true
            val restaurants = repository.getRestaurants()
            val grouped = mutableMapOf<String, MutableList<Restaurant>>()
            restaurants.forEach { restaurant ->
                restaurant.categories.forEach { category ->
                    grouped.getOrPut(category) { mutableListOf() }.add(restaurant)
                }
            }
            _uiState.value = grouped
            _isLoading.value = false
        }
    }
}