package com.example.logistics

import androidx.compose.runtime.Composable
import com.example.logistics.screens.*


typealias ComposableFun = @Composable () -> Unit

sealed class TabItem(var title: String, var screen: ComposableFun){

    object Bookings : TabItem( "Bookings", { BookingsScreen() })
    object BookedItems : TabItem( "Booked Items", { BookedItemScreen() })
    object Client : TabItem( "Client", { ClientScreen() })

}

