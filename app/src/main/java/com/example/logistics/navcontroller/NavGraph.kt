package com.example.logistics.navcontroller


import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.logistics.screens.Booking
import com.example.logistics.screens.Homepage
import com.google.accompanist.pager.ExperimentalPagerApi

@OptIn(ExperimentalMaterialApi::class, ExperimentalPagerApi::class)
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
                Booking()

            }

        }

}