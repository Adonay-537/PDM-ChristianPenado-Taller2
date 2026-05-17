package com.example.com.pdm0126.foodspoott.screens.search

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil3.compose.AsyncImage
import com.example.com.pdm0126.foodspoott.model.Restaurant

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SearchScreen(
    query: String,
    results: List<Restaurant>,
    onQueryChange: (String) -> Unit,
    onRestaurantClick: (Int) -> Unit,
    onBack: () -> Unit
) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Buscar", fontSize = 22.sp, fontWeight = FontWeight.Bold) },
                navigationIcon = {
                    IconButton(onClick = onBack) {
                        Icon(Icons.AutoMirrored.Filled.ArrowBack, contentDescription = "Volver")
                    }
                }
            )
        }
    ) { padding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(padding)
                .padding(horizontal = 16.dp)
        ) {
            OutlinedTextField(
                value = query,
                onValueChange = onQueryChange,
                modifier = Modifier.fillMaxWidth(),
                placeholder = { Text("Restaurante o platillo...", fontSize = 16.sp) },
                leadingIcon = { Icon(Icons.Default.Search, contentDescription = null) },
                singleLine = true,
                shape = RoundedCornerShape(12.dp) // Buscador más redondeado y moderno
            )
            Spacer(Modifier.height(16.dp))

            if (query.isNotBlank() && results.isEmpty()) {
                Box(
                    modifier = Modifier.fillMaxSize(),
                    contentAlignment = Alignment.Center
                ) {
                    Text(
                        text = "No se encontraron resultados",
                        textAlign = TextAlign.Center,
                        fontSize = 18.sp,
                        color = Color.Gray
                    )
                }
            } else {
                Text(
                    text = "${results.size} resultados encontrados",
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Medium,
                    color = Color.Gray
                )
                Spacer(Modifier.height(12.dp))
                LazyColumn(verticalArrangement = Arrangement.spacedBy(12.dp)) {
                    items(results) { restaurant ->
                        SearchResultItem(
                            restaurant = restaurant,
                            onClick = { onRestaurantClick(restaurant.id) }
                        )
                    }
                }
            }
        }
    }
}

@Composable
fun SearchResultItem(restaurant: Restaurant, onClick: () -> Unit) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .clickable(onClick = onClick),
        elevation = CardDefaults.cardElevation(defaultElevation = 2.dp),
        colors = CardDefaults.cardColors(containerColor = Color.White)
    ) {
        Row(
            modifier = Modifier.padding(12.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            AsyncImage(
                model = restaurant.imageUrl,
                contentDescription = restaurant.name,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .size(80.dp) // Imagen un poco más grande
                    .clip(RoundedCornerShape(8.dp))
            )
            Spacer(Modifier.width(16.dp))
            Column {
                Text(
                    text = restaurant.name,
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold
                )
                Text(
                    text = restaurant.description,
                    fontSize = 14.sp,
                    maxLines = 1,
                    color = Color.Gray
                )
                Spacer(Modifier.height(6.dp))
                Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                    restaurant.categories.forEach { cat ->
                        SuggestionChip(
                            onClick = {},
                            label = { Text(cat, fontWeight = FontWeight.SemiBold) }
                        )
                    }
                }
            }
        }
    }
}