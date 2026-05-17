package com.example.com.pdm0126.foodspoott.screens.detail

import android.widget.Toast
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil3.compose.AsyncImage
import com.example.com.pdm0126.foodspoott.model.Dish
import com.example.com.pdm0126.foodspoott.model.Restaurant

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun RestaurantDetailScreen(
    restaurant: Restaurant?,
    onBack: () -> Unit
) {
    val context = LocalContext.current

    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(
                        text = restaurant?.name ?: "",
                        fontWeight = FontWeight.ExtraBold,
                        fontSize = 22.sp
                    )
                },
                navigationIcon = {
                    IconButton(onClick = onBack) {
                        Icon(Icons.AutoMirrored.Filled.ArrowBack, contentDescription = "Volver")
                    }
                },
                // Forzamos que la barra superior sea blanca
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = Color.White,
                    titleContentColor = Color(0xFF333333)
                )
            )
        },
        containerColor = Color(0xFFF5F6F8)
    ) { padding ->
        restaurant?.let { r ->
            LazyColumn(
                contentPadding = padding,
                modifier = Modifier.fillMaxSize()
            ) {
                item {
                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .background(Color.White)
                            .padding(horizontal = 16.dp, vertical = 20.dp)
                    ) {
                        Text(
                            text = "Acerca del restaurante",
                            fontWeight = FontWeight.Bold,
                            fontSize = 18.sp,
                            color = Color(0xFF333333)
                        )
                        Spacer(modifier = Modifier.height(8.dp))
                        Text(
                            text = r.description,
                            fontSize = 15.sp,
                            color = Color.Gray,
                            lineHeight = 22.sp
                        )
                        Spacer(modifier = Modifier.height(20.dp))
                        HorizontalDivider(color = Color(0xFFEEEEEE), thickness = 1.dp)
                        Spacer(modifier = Modifier.height(16.dp))
                        Text(
                            text = "Menú",
                            fontWeight = FontWeight.ExtraBold,
                            fontSize = 20.sp,
                            color = Color(0xFF333333)
                        )
                    }
                }
                items(r.menu) { dish ->
                    DishItem(
                        dish = dish,
                        onAddToCart = {
                            Toast.makeText(
                                context,
                                "${dish.name} agregado al carrito",
                                Toast.LENGTH_SHORT
                            ).show()
                        }
                    )
                }

                item {
                    Spacer(modifier = Modifier.height(24.dp))
                }
            }
        }
    }
}

@Composable
fun DishItem(dish: Dish, onAddToCart: () -> Unit) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp, vertical = 8.dp),
        elevation = CardDefaults.cardElevation(defaultElevation = 2.dp),
        colors = CardDefaults.cardColors(containerColor = Color.White),
        shape = RoundedCornerShape(16.dp)
    ) {
        Row(
            modifier = Modifier.padding(12.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            AsyncImage(
                model = dish.imageUrl,
                contentDescription = dish.name,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .size(100.dp) // Imagen cuadrada grande
                    .clip(RoundedCornerShape(12.dp))
            )
            Spacer(Modifier.width(16.dp))
            Column(modifier = Modifier.weight(1f)) {
                Text(
                    text = dish.name,
                    fontSize = 17.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color(0xFF333333),
                    maxLines = 2,
                    overflow = TextOverflow.Ellipsis
                )
                Spacer(Modifier.height(4.dp))
                Text(
                    text = dish.description,
                    fontSize = 13.sp,
                    color = Color.Gray,
                    maxLines = 2,
                    overflow = TextOverflow.Ellipsis
                )
                Spacer(Modifier.height(12.dp))
                Button(
                    onClick = onAddToCart,
                    colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFE64A19)),
                    shape = RoundedCornerShape(50),
                    contentPadding = PaddingValues(horizontal = 16.dp, vertical = 6.dp),
                    modifier = Modifier.align(Alignment.End)
                ) {
                    Text("+ Agregar", fontWeight = FontWeight.Bold, fontSize = 14.sp, color = Color.White)
                }
            }
        }
    }
}