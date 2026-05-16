package com.example.com.pdm0126.foodspoott.screens.List

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.com.pdm0126.foodspoott.data.RestaurantRepository
import com.example.com.pdm0126.foodspoott.data.RestaurantRepositoryImpl
import com.example.com.pdm0126.foodspoott.model.Restaurant
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class SearchViewModel(
    private val repository: RestaurantRepository = RestaurantRepositoryImpl()
) : ViewModel() {

    private val _query = MutableStateFlow("")
    val query: StateFlow<String> = _query.asStateFlow()

    private val _results = MutableStateFlow<List<Restaurant>>(emptyList())
    val results: StateFlow<List<Restaurant>> = _results.asStateFlow()

    fun onQueryChange(newQuery: String) {
        _query.value = newQuery
        viewModelScope.launch {
            _results.value = repository.searchRestaurants(newQuery)
        }
    }
}