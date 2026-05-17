package com.example.com.pdm0126.foodspoott.data

import com.example.com.pdm0126.foodspoott.model.Dish
import com.example.com.pdm0126.foodspoott.model.Restaurant

class RestaurantRepositoryImpl : RestaurantRepository {

    private val restaurants = listOf(
        Restaurant(
            id = 1,
            name = "Pollo Campero",
            description = "La cadena de pollo frito más querida de El Salvador y Centroamérica.",
            imageUrl = "https://www.revistaeyn.com/binrepository/1350x900/75c0/1200d900/none/26086/GXIW/POLLOCAMPERO-GUATEMALA1_EN839948_MG233393853.jpg",
            categories = listOf("Comida Rápida", "Pollo"),
            menu = listOf(
                Dish(1, "Combo Familiar Campero", "8 piezas de pollo frito con papas y tortillas",
                    "https://images.unsplash.com/photo-1562967914-608f82629710?w=300"),
                Dish(2, "Tazon Campero", "Ensalads fresca con pechuga de pollo",
                    "https://d1ralsognjng37.cloudfront.net/89707d09-0bb5-4d59-93fb-ad8ddd8896cf.jpeg"),
                Dish(3, "Camperitos", "Tiras de pollo empanizadas con salsa de preferencia",
                    "https://inturfiles.s3.us-east-2.amazonaws.com/folder/products/500X500/18_CAMPERITOS_VNP_6462999.jpg")
            )
        ),
        Restaurant(
            id = 2,
            name = "Pupusería La Lorena",
            description = "Las mejores pupusas artesanales de El Salvador, hechas a mano con masa fresca.",
            imageUrl = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRsIyBwZwtYohk3LM6z4iGwlUlF3DfBZ1i4TQ&s",
            categories = listOf("Comida Típica", "Pupusas"),
            menu = listOf(
                Dish(4, "Pupusa de Chicharrón", "Masa de maíz rellena de chicharrón molido",
                    "https://img1.wsimg.com/isteam/ip/db03dbc3-5fbe-4a2d-918b-dd0aa2402dff/blob-cc67aaa.png/:/cr=t:0%25,l:0%25,w:100%25,h:100%25/rs=w:1240,h:1240,cg:true"),
                Dish(5, "Pupusa Revuelta", "Rellena de chicharrón, queso y frijoles",
                    "https://www.tipicosmargoth.com/wp-content/uploads/2020/05/REVUELTA-TIPICOS-MARGOTH.jpg"),
                Dish(6, "Pupusa de Loroco con Queso", "Con flor de loroco y queso blanco",
                    "https://sabordemercedes.com/wp-content/uploads/2022/01/pupusa-de-loroco.png")
            )
        ),
        Restaurant(
            id = 3,
            name = "Pizza Hut El Salvador",
            description = "Pizza italiana al estilo americano, la favorita de las familias salvadoreñas.",
            imageUrl = "https://yt3.googleusercontent.com/xc6SS2ObM6u6GRuykoKuDKXXZOXlox0xafaS1vqHnQ-Q2Rfzjq6io2et7xJG1ke3QInaf8vIQg=s900-c-k-c0x00ffffff-no-rj",
            categories = listOf("Italiana", "Pizzas", "Comida Rápida"),
            menu = listOf(
                Dish(7, "Pizza Pepperoni Grande", "Pizza con doble pepperoni y queso mozzarella",
                    "https://images.unsplash.com/photo-1534308983496-4fabb1a015ee?w=300"),
                Dish(8, "Pizza Hawaiana", "Piña, jamón y queso sobre salsa de tomate",
                    "https://images.unsplash.com/photo-1565299624946-b28f40a0ae38?w=300"),
                Dish(9, "Pan de Ajo", "Pan artesanal con mantequilla de ajo y queso",
                    "https://wp-cdn.typhur.com/wp-content/uploads/2025/02/air-fryer-garlic-bread.jpg")
            )
        ),
        Restaurant(
            id = 4,
            name = "Biggest",
            description = "Las hamburguesas más grandes y jugosas de San Salvador.",
            imageUrl = "https://www.elsalvadoryp.com/img/sv/l/1681335477-31-biggest.jpg",
            categories = listOf("Comida Rápida", "Hamburguesas"),
            menu = listOf(
                Dish(10, "Big Deluxe", "Doble carne angus, queso cheddar, lechuga y tomate",
                    "https://biggest.com.sv/wp-content/uploads/elementor/thumbs/deluxe-q9dhdkl946o7b6qpn27353egxui9uagctugrohkf9k.png"),
                Dish(11, "BBQ Bacon Burger", "Con tocino crujiente, salsa BBQ y aros de cebolla",
                    "https://images.unsplash.com/photo-1553979459-d2229ba7433b?w=300"),
                Dish(12, "Papas Biggest", "Papas fritas con queso fundido y jalapeños",
                    "https://biggest.com.sv/wp-content/uploads/2022/02/Captura-de-pantalla-2022-02-02-093902.jpg")
            )
        ),
        Restaurant(
            id = 5,
            name = "Mama Chuz",
            description = "Comida casera salvadoreña con sazón de abuela, en el corazón de San Salvador.",
            imageUrl = "https://pedidosya.dhmedia.io/image/pedidosya/restaurants/logo-chuzcarnitas-mama-0101.jpg",
            categories = listOf("Carnes", "Asados"),
            menu = listOf(
                Dish(13, "Sopa de Pata", "Caldo tradicional con pata de res y vegetales",
                    "https://cdn-pro.elsalvador.com/wp-content/uploads/2025/10/turismo-sabores-de-el-salvador-sop-de-pata-1-740x1024.jpg"),
                Dish(14, "Carne Asada", "Carne Asada acompañada de su ensalada, casamiento y tortillas",
                    "https://elsopontipico.com/wp-content/uploads/2023/12/CHURRASCO-TIPICO-scaled-e1713826872255.jpg"),
                Dish(15, "Carne Asada Mixta", "Carne Asada con chorizo acompañada de su ensalada, casamiento y tortillas",
                    "https://thumbs.dreamstime.com/b/plato-de-carne-asada-y-casamiento-vistas-la-al-281905476.jpg")
            )
        ),
        Restaurant(
            id = 6,
            name = "Subway El Salvador",
            description = "Sándwiches frescos y saludables hechos al momento.",
            imageUrl = "https://rabbitlogo.com/wp-content/uploads/2025/12/subway.jpg",
            categories = listOf("Comida Rápida", "Saludable"),
            menu = listOf(
                Dish(16, "Sub de Pavo", "Sandwich con jamon de pavo, con los ingredientes que desees",
                    "https://www.etiqueteando.com/wp-content/uploads/2021/01/E1042.jpg"),
                Dish(17, "Sub BMT", " Sandwich con Salami, pepperoni y jamón con queso",
                    "https://subwayisfresh.com.sg/wp-content/uploads/2022/01/Menuitem-Italian-BMT-sub2.jpg"),
                Dish(18, "Ensalada de Pollo", "Pollo a la plancha sobre base de vegetales frescos",
                    "https://www.justspices.es/media/recipe/Ensalada-pollo-vinagreta-limon.webp")
            )
        ),
        Restaurant(
            id = 7,
            name = "Café de Don Pedro",
            description = "Café de altura salvadoreño y repostería artesanal desde 1985.",
            imageUrl = "https://comelongo.com/wp-content/uploads/2020/10/82846499_10157208084394005_6325462893919731712_n.jpg",
            categories = listOf("Cafetería", "Bebidas", "Postres"),
            menu = listOf(
                Dish(19, "Café de Altura", "Café negro de las montañas de Apaneca",
                    "https://images.unsplash.com/photo-1541167760496-1628856ab772?w=300"),
                Dish(20, "Quesadilla Salvadoreña", "Quesadilla dulce de arroz con queso seco",
                    "https://www.chsugar.com/sites/default/files/2024-09/Web_Hero_Image-El%20Salvador%20Cheese%20Pound%20Cake%20%28Quesadilla%20Salvadoren%CC%83a%29%2005.jpg"),
                Dish(21, "Semita de Piña", "Pan dulce relleno de jalea de piña",
                    "https://cdn-pro.elsalvador.com/wp-content/uploads/2025/08/vida-semita-de-pina-el-salvador-1.jpg")
            )
        ),
        Restaurant(
            id = 8,
            name = "La Pampa Argentina",
            description = "Cortes de carne argentina a la parrilla en San Salvador.",
            imageUrl = "https://bambucitycenter.com/wp-content/uploads/2024/04/La-Pampa.png",
            categories = listOf("Carnes", "Asados"),
            menu = listOf(
                Dish(22, "Churrasco Argentino", "Corte de res a la parrilla con chimichurri casero",
                    "https://images.unsplash.com/photo-1558030006-450675393462?w=300"),
                Dish(23, "Costillas BBQ", "Costillas de cerdo bañadas en salsa BBQ ahumada",
                    "https://images.unsplash.com/photo-1544025162-d76694265947?w=300"),
                Dish(24, "Empanadas de Carne", "Empanadas argentinas rellenas de carne molida",
                    "https://imag.bonviveur.com/empanadas-argentinas-de-carne-foto-cerca.jpg")
            )
        ),
        Restaurant(
            id = 9,
            name = "Sushiitto El Salvador",
            description = "El sushi más fresco de San Salvador con rolls únicos.",
            imageUrl = "https://d3jky06km58rdx.cloudfront.net/assets/images/store/san-salvador/N96t60GvSKGTUCZtiJOm1V0o51kL5Nk0grjhD6s6.webp",
            categories = listOf("Asiática", "Japonesa"),
            menu = listOf(
                Dish(25, "Roll Volcán", "Roll de camarón tempura con aguacate y salsa spicy",
                    "https://simplyhomecooked.com/wp-content/uploads/2022/06/volcano-roll-5.jpg"),
                Dish(26, "Sashimi de Salmón", "Láminas de salmón fresco con wasabi y jengibre",
                    "https://www.mardenoruega.es/globalassets/recipes/salmon/sashimi-salmon-new.jpg?width=685&height=685&transform=DownFill&hash=fba299725e710be3904d981c54ac8876"),
                Dish(27, "Ramen de Pollo", "Caldo japonés con fideos, pollo y huevo marinado",
                    "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSvp5lnHQcgpOYA4Hjy-FjJILJYEk5LcPyE2w&s")
            )
        ),
        Restaurant(
            id = 10,
            name = "Helados El Sin Rival",
            description = "La heladería más tradicional de El Salvador, hechos artesanalmente.",
            imageUrl = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSHAv5Po8l2YRodeQNtmrlNUSCsN7Vk353ZGA&s",
            categories = listOf("Postres", "Bebidas"),
            menu = listOf(
                Dish(28, "Sorbete Tradicional", "Sorberte de tu preferencia acompañado del clasico cono",
                    "https://s3-media0.fl.yelpcdn.com/bphoto/sXC3JV4o0IxyDreIJtI-AA/l.jpg"),
                Dish(29, "Paletas", "Paleta del sabor de tu preferencia",
                    "https://www.goya.com/wp-content/uploads/2023/10/blackberry-ice-pops.jpg"),
                Dish(30, "Milkshake", "Batido de leche combinado de sorbete a tu escogencia",
                    "https://www.dessertfortwo.com/wp-content/uploads/2022/08/How-to-Make-a-Milkshake-11-540x720.jpg")
            )
        )
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