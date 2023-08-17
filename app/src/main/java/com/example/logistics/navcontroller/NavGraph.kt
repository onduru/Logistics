package com.example.logistics.navcontroller


import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.logistics.screens.Bookings
import com.example.logistics.screens.Homepage

@Composable
fun SetupNavGraph(

    navController : NavHostController

){

        NavHost(
            navController = navController,
            startDestination = Screen.Home.route
        ) {
            composable(
                route = Screen.Home.route
            ) {
                Homepage(navController = navController)
            }
            composable(
                route = Screen.Booking.route
            ) {
                Bookings()
            }

        }

}