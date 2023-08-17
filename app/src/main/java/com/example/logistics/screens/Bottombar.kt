package com.example.logistics.screens

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Settings
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp


@Composable
fun BottomBar(){
    Spacer(modifier = Modifier.height(20.dp))
    BottomNavigation(
        backgroundColor = Color.White,
        modifier = Modifier
            .fillMaxWidth()
            .height(56.dp)
    ) {
        BottomNavigationItem(
            icon = {
                Icon(
                    imageVector = Icons.Default.Home,
                    contentDescription = "Home",
                    tint = Color.Black,
                    modifier = Modifier.size(24.dp)
                )
            },
            label = { Text(text = "Home") },
            selected = true,
            onClick = { /*TODO*/ },
            alwaysShowLabel = false,
            selectedContentColor = Color.Black,
            unselectedContentColor = Color.Gray,
        )
        BottomNavigationItem(
            icon = {
                Icon(
                    imageVector = Icons.Default.Info,
                    contentDescription = "About Us",
                    tint = Color.Black,
                    modifier = Modifier.size(24.dp)
                )
            },
            label = { Text(text = "About Us") },
            selected = false,
            onClick = { /*TODO*/ },
            alwaysShowLabel = true,
            selectedContentColor = Color.Black,
            unselectedContentColor = Color.Gray,
        )
        BottomNavigationItem(
            icon = {
                Icon(
                    imageVector = Icons.Default.Settings,
                    contentDescription = "Settings",
                    tint = Color.Black,
                    modifier = Modifier.size(24.dp)
                )
            },
            label = { Text(text = "Settings") },
            selected = true,
            onClick = { /*TODO*/ },
            alwaysShowLabel = false,
            selectedContentColor = Color.Black,
            unselectedContentColor = Color.Gray,
        )
        BottomNavigationItem(
            icon = {
                Icon(
                    imageVector = Icons.Default.Person,
                    contentDescription = "Profile",
                    tint = Color.Black,
                    modifier = Modifier.size(24.dp)
                )
            },
            label = { Text(text = "Profile") },
            selected = false,
            onClick = { /*TODO*/ },
            alwaysShowLabel = true,
            selectedContentColor = Color.Black,
            unselectedContentColor = Color.Gray,
        )
    }
}