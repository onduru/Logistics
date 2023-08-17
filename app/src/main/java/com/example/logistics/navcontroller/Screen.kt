package com.example.logistics.navcontroller


sealed class Screen(val route: String) {
    object Home: Screen(route = "home")
    object Booking: Screen(route = "booking")
}


