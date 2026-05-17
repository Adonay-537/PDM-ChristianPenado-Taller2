package com.example.com.pdm0126.foodspoott.screens.list

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil3.compose.AsyncImage
import com.example.com.pdm0126.foodspoott.model.Restaurant
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun RestaurantListScreen(
    groupedRestaurants: Map<String, List<Restaurant>>,
    isLoading: Boolean,
    onRestaurantClick: (Int) -> Unit,
    onSearchClick: () -> Unit
) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("FoodSpot", fontWeight = FontWeight.ExtraBold, fontSize = 24.sp) },
                actions = {
                    IconButton(onClick = onSearchClick) {
                        Icon(Icons.Default.Search, contentDescription = "Buscar", modifier = Modifier.size(28.dp))
                    }
                }
            )
        }
    ) { padding ->
        if (isLoading) {
            Box(
                modifier = Modifier.fillMaxSize(),
                contentAlignment = Alignment.Center
            ) {
                CircularProgressIndicator(color = Color(0xFFE64A19))
            }
        } else {
            LazyColumn(
                contentPadding = padding,
                modifier = Modifier.fillMaxSize()
            ) {
                groupedRestaurants.forEach { (category, restaurants) ->
                    item {
                        Text(
                            text = category,
                            fontSize = 22.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color(0xFF333333),
                            modifier = Modifier.padding(start = 16.dp, top = 24.dp, bottom = 12.dp)
                        )
                    }
                    item {
                        LazyRow(
                            contentPadding = PaddingValues(horizontal = 16.dp),
                            horizontalArrangement = Arrangement.spacedBy(16.dp)
                        ) {
                            items(restaurants) { restaurant ->
                                RestaurantCard(
                                    restaurant = restaurant,
                                    onClick = { onRestaurantClick(restaurant.id) }
                                )
                            }
                        }
                        Spacer(modifier = Modifier.height(8.dp))
                    }
                }
            }
        }
    }
}

@Composable
fun RestaurantCard(restaurant: Restaurant, onClick: () -> Unit) {
    Card(
        modifier = Modifier
            .width(160.dp)
            .clickable(onClick = onClick),
        elevation = CardDefaults.cardElevation(defaultElevation = 6.dp),
        colors = CardDefaults.cardColors(containerColor = Color.White)
    ) {
        Column {
            AsyncImage(
                model = restaurant.imageUrl,
                contentDescription = restaurant.name,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(140.dp)
                    .clip(RoundedCornerShape(topStart = 12.dp, topEnd = 12.dp))
            )
            Column(modifier = Modifier.padding(12.dp)) {
                Text(
                    text = restaurant.name,
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold,
                    maxLines = 1
                )
                Text(
                    text = "Ver menú",
                    fontSize = 14.sp,
                    color = Color(0xFFE64A19),
                    fontWeight = FontWeight.SemiBold,
                    modifier = Modifier.padding(top = 4.dp)
                )
            }
        }
    }
}