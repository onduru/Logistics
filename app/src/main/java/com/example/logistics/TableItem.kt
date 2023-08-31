package com.example.logistics

import androidx.compose.runtime.Composable
import com.example.logistics.screens.HomeScreen
import com.example.logistics.screens.ProfileScreen
import com.example.logistics.screens.SettingsScreen


typealias ComposableFun = @Composable () -> Unit

sealed class TabItem(var icon: Int, var title: String, var screen: ComposableFun){

    object Homes : TabItem(R.drawable.cargo, "Home", { HomeScreen() })
    object Profile : TabItem(R.drawable.warehouse1, "Profile", { ProfileScreen() })
    object Settings : TabItem(R.drawable.securitygate, "Settings", { SettingsScreen() })

}

