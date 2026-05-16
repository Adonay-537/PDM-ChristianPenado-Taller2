package com.example.com.pdm0126.foodspoott.data

import com.example.com.pdm0126.foodspoott.model.Dish
import com.example.com.pdm0126.foodspoott.model.Restaurant

class RestaurantRepositoryImpl : RestaurantRepository {

    private val restaurants = listOf(
        Restaurant(
            id = 1,
            name = "Pollo Campero",
            description = "La cadena de pollo frito más querida de El Salvador y Centroamérica.",
            imageUrl = "https://images.unsplash.com/photo-1626645738196-c2a7c87a8f58?w=400",
            categories = listOf("Comida Rápida", "Pollo"),
            menu = listOf(
                Dish(1, "Combo Familiar Campero", "8 piezas de pollo frito con papas y tortillas",
                    "https://images.unsplash.com/photo-1562967914-608f82629710?w=300"),
                Dish(2, "Pollo a la Plancha", "Pechuga a la plancha con ensalada y arroz",
                    "https://images.unsplash.com/photo-1532550907401-a500c9a57435?w=300"),
                Dish(3, "Deditos de Pollo", "Tiras de pollo empanizadas con salsa BBQ",
                    "https://images.unsplash.com/photo-1567620832903-9fc6debc209f?w=300")
            )
        ),
        Restaurant(
            id = 2,
            name = "Pupusería La Lorena",
            description = "Las mejores pupusas artesanales de El Salvador, hechas a mano con masa fresca.",
            imageUrl = "https://images.unsplash.com/photo-1604467794349-0b74285de7e7?w=400",
            categories = listOf("Comida Típica"),
            menu = listOf(
                Dish(4, "Pupusa de Chicharrón", "Masa de maíz rellena de chicharrón molido",
                    "https://images.unsplash.com/photo-1615870216519-2f9fa575fa5c?w=300"),
                Dish(5, "Pupusa Revuelta", "Rellena de chicharrón, queso y frijoles",
                    "https://images.unsplash.com/photo-1604467794349-0b74285de7e7?w=300"),
                Dish(6, "Pupusa de Loroco con Queso", "Con flor de loroco y queso blanco",
                    "https://images.unsplash.com/photo-1615870216519-2f9fa575fa5c?w=300")
            )
        ),
        Restaurant(
            id = 3,
            name = "Pizza Hut El Salvador",
            description = "Pizza italiana al estilo americano, la favorita de las familias salvadoreñas.",
            imageUrl = "https://images.unsplash.com/photo-1611915365928-565c527a0590?w=400",
            categories = listOf("Italiana", "Pizzas"),
            menu = listOf(
                Dish(7, "Pizza Pepperoni Grande", "Pizza con doble pepperoni y queso mozzarella",
                    "https://images.unsplash.com/photo-1534308983496-4fabb1a015ee?w=300"),
                Dish(8, "Pizza Hawaiana", "Piña, jamón y queso sobre salsa de tomate",
                    "https://images.unsplash.com/photo-1565299624946-b28f40a0ae38?w=300"),
                Dish(9, "Pan de Ajo", "Pan artesanal con mantequilla de ajo y queso",
                    "https://images.unsplash.com/photo-1573140247632-f8fd74997d5c?w=300")
            )
        ),
        Restaurant(
            id = 4,
            name = "Biggest Burger",
            description = "Las hamburguesas más grandes y jugosas de San Salvador.",
            imageUrl = "https://images.unsplash.com/photo-1568901346375-23c9450c58cd?w=400",
            categories = listOf("Comida Rápida", "Hamburguesas"),
            menu = listOf(
                Dish(10, "Biggest Classic", "Doble carne angus, queso cheddar, lechuga y tomate",
                    "https://images.unsplash.com/photo-1550317138-10000687a72b?w=300"),
                Dish(11, "BBQ Bacon Burger", "Con tocino crujiente, salsa BBQ y aros de cebolla",
                    "https://images.unsplash.com/photo-1553979459-d2229ba7433b?w=300"),
                Dish(12, "Papas Biggest", "Papas fritas con queso fundido y jalapeños",
                    "https://images.unsplash.com/photo-1573080496219-bb080dd4f877?w=300")
            )
        ),
        Restaurant(
            id = 5,
            name = "Mama Chuz",
            description = "Comida casera salvadoreña con sazón de abuela, en el corazón de San Salvador.",
            imageUrl = "https://images.unsplash.com/photo-1555396273-367ea4eb4db5?w=400",
            categories = listOf("Comida Típica", "Mariscos"),
            menu = listOf(
                Dish(13, "Sopa de Pata", "Caldo tradicional con pata de res y vegetales",
                    "https://images.unsplash.com/photo-1547592180-85f173990554?w=300"),
                Dish(14, "Ceviche de Camarón", "Camarones frescos con limón, chile y tomate",
                    "https://images.unsplash.com/photo-1535399831218-d5bd36d1a6b3?w=300"),
                Dish(15, "Yuca Frita con Chicharrón", "Yuca frita acompañada de chicharrón y curtido",
                    "https://images.unsplash.com/photo-1604467794349-0b74285de7e7?w=300")
            )
        ),
        Restaurant(
            id = 6,
            name = "Subway El Salvador",
            description = "Sándwiches frescos y saludables hechos al momento.",
            imageUrl = "https://images.unsplash.com/photo-1509722747041-616f39b57fbe?w=400",
            categories = listOf("Comida Rápida", "Saludable"),
            menu = listOf(
                Dish(16, "Sub de Pavo", "Pechuga de pavo con vegetales frescos y mostaza",
                    "https://images.unsplash.com/photo-1553909489-cd47e0907980?w=300"),
                Dish(17, "Sub BMT", "Salami, pepperoni y jamón con queso",
                    "https://images.unsplash.com/photo-1540189549336-e6e99c3679fe?w=300"),
                Dish(18, "Ensalada de Pollo", "Pollo a la plancha sobre base de vegetales frescos",
                    "https://images.unsplash.com/photo-1546069901-ba9599a7e63c?w=300")
            )
        ),
        Restaurant(
            id = 7,
            name = "Café de Don Pedro",
            description = "Café de altura salvadoreño y repostería artesanal desde 1985.",
            imageUrl = "https://images.unsplash.com/photo-1501339847302-ac426a4a7cbb?w=400",
            categories = listOf("Cafetería", "Bebidas", "Postres"),
            menu = listOf(
                Dish(19, "Café de Altura", "Café negro de las montañas de Apaneca",
                    "https://images.unsplash.com/photo-1541167760496-1628856ab772?w=300"),
                Dish(20, "Quesadilla Salvadoreña", "Quesadilla dulce de arroz con queso seco",
                    "https://images.unsplash.com/photo-1565958011703-44f9829ba187?w=300"),
                Dish(21, "Semita de Piña", "Pan dulce relleno de jalea de piña",
                    "https://images.unsplash.com/photo-1558961363-fa8fdf82db35?w=300")
            )
        ),
        Restaurant(
            id = 8,
            name = "La Pampa Argentina",
            description = "Cortes de carne argentina a la parrilla en San Salvador.",
            imageUrl = "https://images.unsplash.com/photo-1544025162-d76694265947?w=400",
            categories = listOf("Carnes", "Parrilla"),
            menu = listOf(
                Dish(22, "Churrasco Argentino", "Corte de res a la parrilla con chimichurri casero",
                    "https://images.unsplash.com/photo-1558030006-450675393462?w=300"),
                Dish(23, "Costillas BBQ", "Costillas de cerdo bañadas en salsa BBQ ahumada",
                    "https://images.unsplash.com/photo-1544025162-d76694265947?w=300"),
                Dish(24, "Empanadas de Carne", "Empanadas argentinas rellenas de carne molida",
                    "https://images.unsplash.com/photo-1604467794349-0b74285de7e7?w=300")
            )
        ),
        Restaurant(
            id = 9,
            name = "Sushiitto El Salvador",
            description = "El sushi más fresco de San Salvador con rolls únicos.",
            imageUrl = "https://images.unsplash.com/photo-1579871494447-9811cf80d66c?w=400",
            categories = listOf("Asiática", "Japonesa"),
            menu = listOf(
                Dish(25, "Roll Volcán", "Roll de camarón tempura con aguacate y salsa spicy",
                    "https://images.unsplash.com/photo-1617196034183-421b4040ed20?w=300"),
                Dish(26, "Sashimi de Salmón", "Láminas de salmón fresco con wasabi y jengibre",
                    "https://images.unsplash.com/photo-1617196034302-4e5e06462f22?w=300"),
                Dish(27, "Ramen de Pollo", "Caldo japonés con fideos, pollo y huevo marinado",
                    "https://images.unsplash.com/photo-1569050467447-ce54b3bbc37d?w=300")
            )
        ),
        Restaurant(
            id = 10,
            name = "Helados El Sin Rival",
            description = "La heladería más tradicional de El Salvador, con sabores únicos desde 1958.",
            imageUrl = "https://images.unsplash.com/photo-1587314168485-3236d6710814?w=400",
            categories = listOf("Postres", "Bebidas"),
            menu = listOf(
                Dish(28, "Ensalada de Frutas con Helado", "Frutas frescas de temporada con helado artesanal y crema",
                    "https://images.unsplash.com/photo-1563805042-7684c019e1cb?w=300"),
                Dish(29, "Helado de Coco", "Helado artesanal de coco natural en barquillo crujiente",
                    "https://images.unsplash.com/photo-1572490122747-3968b75cc699?w=300"),
                Dish(30, "Raspado El Sin Rival", "Hielo raspado con jarabe de tamarindo y chamoy",
                    "https://images.unsplash.com/photo-1562376552-0d160a2f238d?w=300")
            )
        ),
    )

    override suspend fun getRestaurants(): List<Restaurant> = restaurants

    override suspend fun getRestaurantById(id: Int): Restaurant? =
        restaurants.find { it.id == id }

    override suspend fun searchRestaurants(query: String): List<Restaurant> {
        if (query.isBlank()) return emptyList()
        val q = query.lowercase()
        return restaurants.filter { restaurant ->
            restaurant.name.lowercase().contains(q) ||
                    restaurant.menu.any { dish -> dish.name.lowercase().contains(q) }
        }
    }
}