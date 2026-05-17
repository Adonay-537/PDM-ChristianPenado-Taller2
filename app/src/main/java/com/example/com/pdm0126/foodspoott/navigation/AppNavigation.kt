package com.example.com.pdm0126.foodspoott.navigation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation3.runtime.NavBackStack
import androidx.navigation3.runtime.NavEntry
import androidx.navigation3.runtime.NavKey
import androidx.navigation3.runtime.rememberNavBackStack
import androidx.navigation3.ui.NavDisplay
import kotlinx.serialization.Serializable
import com.example.com.pdm0126.foodspoott.screens.detail.RestaurantDetailScreen
import com.example.com.pdm0126.foodspoott.screens.detail.RestaurantDetailViewModel
import com.example.com.pdm0126.foodspoott.screens.list.RestaurantListScreen
import com.example.com.pdm0126.foodspoott.screens.list.RestaurantListViewModel
import com.example.com.pdm0126.foodspoott.screens.search.SearchScreen
import com.example.com.pdm0126.foodspoott.screens.search.SearchViewModel


@Serializable
object RestaurantList : NavKey

@Serializable
data class RestaurantDetail(val restaurantId: Int) : NavKey

@Serializable
object Search : NavKey

@Composable
fun AppNavigation() {

    val backStack: NavBackStack<NavKey> = rememberNavBackStack(RestaurantList)

    NavDisplay(backStack = backStack) { key ->
        when (key) {
            is RestaurantList -> NavEntry(key) {
                val vm: RestaurantListViewModel = viewModel()
                val state by vm.uiState.collectAsState()
                val isLoading by vm.isLoading.collectAsState()

                RestaurantListScreen(
                    groupedRestaurants = state,
                    isLoading = isLoading,
                    onRestaurantClick = { id -> backStack.add(RestaurantDetail(id)) },
                    onSearchClick = { backStack.add(Search) }
                )
            }

            is RestaurantDetail -> NavEntry(key) {
                val vm: RestaurantDetailViewModel = viewModel()
                val restaurant by vm.restaurant.collectAsState()
                LaunchedEffect(key.restaurantId) {
                    vm.loadRestaurant(key.restaurantId)
                }



                RestaurantDetailScreen(
                    restaurant = restaurant,
                    onBack = { backStack.removeLastOrNull() }
                )
            }

            is Search -> NavEntry(key) {
                val vm: SearchViewModel = viewModel()
                val query by vm.query.collectAsState()
                val results by vm.results.collectAsState()

                SearchScreen(
                    query = query,
                    results = results,
                    onQueryChange = vm::onQueryChange,
                    onRestaurantClick = { id -> backStack.add(RestaurantDetail(id)) },
                    onBack = { backStack.removeLastOrNull() }
                )
            }
            else -> error("Ruta no reconocida")
        }
    }
}