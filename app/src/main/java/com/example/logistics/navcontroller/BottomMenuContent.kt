package com.example.logistics.navcontroller


import androidx.annotation.DrawableRes
// having two parameters title and iconid
data class BottomMenuContent(
    val title: String,
    @DrawableRes val iconId: Int
)