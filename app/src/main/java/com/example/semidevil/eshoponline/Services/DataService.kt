package com.example.semidevil.eshoponline.Services

import com.example.semidevil.eshoponline.Model.Category
import com.example.semidevil.eshoponline.Model.Product

/**
 * Created by SemiDevil on 1/13/2018.
 */
object DataService {
    val categories = listOf(
            Category("SHIRTS", "shirtimage"),
            Category("HOODIES", "hoodieimage"),
            Category("HATS", "hatimage"),
            Category("DIGITAL", "digitalgoodsimage")
    )
    val hats = listOf(
            Product("Awesome Graphic Beanie", "$18", "hat01"),
            Product("Awesome Hat Black", "$20", "hat02"),
            Product("Awesome Hat White", "$35", "hat03"),
            Product("Awesome Hat Snapback", "$14", "hat04")

    )

    val hoodies = listOf(
            Product("Awesome HOodie Gray", "$25", "hoodie01"),
            Product("Awesome HOodie Red", "$10", "hoodie02"),
            Product("Awesome Hoodie Gray", "$50", "hoodie03"),
            Product("Awesome Black Hoodie", "$42", "hoodie04")
    )

    val shirts = listOf(
            Product("Awesome Shirt Black", "$14", "shirt01"),
            Product("Awesome Badge Light Gray", "$200", "shirt02"),
            Product("Awesome Logo Shirt Red", "$690", "shirt03"),
            Product("Awesome Hustle", "$22", "shirt04"),
            Product("KickFlip Studios","18","shirt05")
    )
}