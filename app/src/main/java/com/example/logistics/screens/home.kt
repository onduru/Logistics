package com.example.logistics.screens

import android.annotation.SuppressLint
import android.os.Bundle
import android.provider.MediaStore.Audio.Genres
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.magnifier
import androidx.compose.foundation.selection.selectable
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.material.icons.materialIcon
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CardElevation
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.VerticalAlignmentLine
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import com.example.logistics.R
import com.example.logistics.navcontroller.Screen
import com.example.logistics.screens.ui.theme.LogisticsTheme
import org.w3c.dom.Text
import java.text.DateFormat
import java.text.SimpleDateFormat
import java.util.*

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun Homepage(
    navController: NavController
){

    val genres = listOf("Mon\n 20", "Tue\n 21","Wed\n 22","Thur\n 23", "Fri\n 24","Sat\n 25","Sun\n 26")
    LogisticsTheme{
        Scaffold{
            BottomBar()
            Column(
                modifier = Modifier
                    .background(Color.White)
                    .padding(it)
                    .padding(horizontal = 10.dp)
            ){
                Text(
                    fontSize = 40.sp,
                    modifier = Modifier.padding(bottom = 25.dp),
                    text = buildAnnotatedString {
                        GetDateAndTime()
                        withStyle(
                            style = SpanStyle(
                                fontWeight = FontWeight.Bold,
                                color = Color.Black
                            )
                        ){
                            append("Welcome")
                        }
                    }
                )
                LazyRow(
                    horizontalArrangement = Arrangement.spacedBy(5.dp),
                    modifier = Modifier
                        .padding(bottom =10.dp),

                ){
                    items(genres){ genres ->
                        Genres(genres)

                    }
                }

                Text(
                    text = "Branch Summary",
                    Modifier.padding(5.dp)
                    .clickable{
                    navController.navigate(route = Screen.Booking.route)
                }

                )

                Box(
                    modifier = Modifier
                        .padding(5.dp)
                        .clip(RoundedCornerShape(10))
                        .background(Color.Blue)
                        .fillMaxWidth()
                ){
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.SpaceEvenly,
                        modifier = Modifier.padding(10.dp)
                    ){

                        Column(
                            modifier = Modifier
                                .padding(vertical = 5.dp)
                                .padding(start = 20.dp)
                        ) {
                            Icon(
                                painter = painterResource(R.drawable.cargo),
                                tint = Color.Unspecified,
                                contentDescription = "cargo",
                                modifier = Modifier.size(36.dp)
                            )
                            Text(
                                text = "30",
                                fontWeight = FontWeight.Bold,
                                fontSize = 40.sp,
                                color = Color.White,
                                textAlign = TextAlign.Center
                            )
                            Spacer(modifier = Modifier.size(2.dp))
                            Text(text = "Bookings",
                                modifier = Modifier.clickable{
                                    navController.navigate(route = Screen.Booking.route)
                                }

                            )

                        }
                        Spacer(modifier = Modifier.size(20.dp))

                        Column(
                            modifier = Modifier
                                .padding(vertical = 5.dp)
                                .padding(start = 20.dp),
                        ) {
                            Icon(
                                painter = painterResource(R.drawable.customer),
                                tint = Color.Unspecified,
                                contentDescription = "customer",
                                modifier = Modifier.size(36.dp)
                            )
                            Text(
                                text = "50",
                                fontWeight = FontWeight.Bold,
                                fontSize = 40.sp,
                                color = Color.White,
                                textAlign = TextAlign.Center
                            )
                            Spacer(modifier = Modifier.size(2.dp))
                            Text(text = "Clients")

                        }
                        Spacer(modifier = Modifier.size(30.dp))

                        Column(
                            modifier = Modifier
                                .padding(vertical = 5.dp)
                                .padding(start = 20.dp)
                                .fillMaxWidth()
                        ) {
                            Icon(
                                painter = painterResource(R.drawable.warehouse),
                                tint = Color.Unspecified,
                                contentDescription = "warehouse",
                                modifier = Modifier.size(36.dp)
                            )
                            Text(
                                text = "70",
                                fontWeight = FontWeight.Bold,
                                fontSize = 40.sp,
                                color = Color.White,
                                textAlign = TextAlign.Center
                            )
                            Spacer(modifier = Modifier.size(2.dp))
                            Text(text = "Stock")

                        }
                    }
                }
                Box(
                    modifier = Modifier
                        .padding(5.dp)
                        .clip(RoundedCornerShape(10))
                        .background(Color.Blue)
                        .fillMaxWidth()
                ){
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.SpaceEvenly,
                        modifier = Modifier.padding(10.dp)
                    ){

                        Column(
                            modifier = Modifier
                                .padding(vertical = 5.dp)
                                .padding(start = 20.dp)
                        ) {
                            Icon(
                                painter = painterResource(R.drawable.cargo),
                                tint = Color.Unspecified,
                                contentDescription = "cargo",
                                modifier = Modifier.size(36.dp)
                            )
                            Text(
                                text = "30",
                                fontWeight = FontWeight.Bold,
                                fontSize = 40.sp,
                                color = Color.White,
                                textAlign = TextAlign.Center
                            )
                            Spacer(modifier = Modifier.size(2.dp))
                            Text(text = "Bookings")

                        }
                        Spacer(modifier = Modifier.size(20.dp))

                        Column(
                            modifier = Modifier
                                .padding(vertical = 5.dp)
                                .padding(start = 20.dp)
                        ) {
                            Icon(
                                painter = painterResource(R.drawable.customer),
                                tint = Color.Unspecified,
                                contentDescription = "customer",
                                modifier = Modifier.size(36.dp)
                            )
                            Text(
                                text = "50",
                                fontWeight = FontWeight.Bold,
                                fontSize = 40.sp,
                                color = Color.White,
                                textAlign = TextAlign.Center
                            )
                            Spacer(modifier = Modifier.size(2.dp))
                            Text(text = "Clients")

                        }
                        Spacer(modifier = Modifier.size(30.dp))

                        Column(
                            modifier = Modifier
                                .padding(vertical = 5.dp)
                                .padding(start = 20.dp)
                                .fillMaxWidth()
                        ) {
                            Icon(
                                painter = painterResource(R.drawable.warehouse),
                                tint = Color.Unspecified,
                                contentDescription = "warehouse",
                                modifier = Modifier.size(36.dp)
                            )
                            Text(
                                text = "70",
                                fontWeight = FontWeight.Bold,
                                fontSize = 40.sp,
                                color = Color.White,
                                textAlign = TextAlign.Center
                            )
                            Spacer(modifier = Modifier.size(2.dp))
                            Text(text = "Stock")

                        }
                    }
                }
                Text(
                    text = "DashBoard",
                    Modifier.padding(5.dp),
                    fontSize = 15.sp
                )
                Row(
                    horizontalArrangement = Arrangement.SpaceEvenly,
                    modifier = Modifier
                        .padding(0.dp),
                )
                {
                    ConsignmentCard()
                    Column (
                        verticalArrangement = Arrangement.SpaceEvenly,
                        modifier = Modifier.padding(2.dp)
                            ){
                        GateLogsCard()
                        WareHouseCard()

                    }
                }

            }
        }


    }

}

@Composable
fun GetDateAndTime(){
    val calendar = Calendar.getInstance().time
    val dateFormat = DateFormat.getDateInstance().format(calendar)
    Text(text = dateFormat,
            fontSize = 15.sp,
        modifier = Modifier.padding(
            top = 10 .dp,
            bottom = 5.dp

        )
    )
}

@Composable
fun Genres(text:String){
    val isSelected by remember{ mutableStateOf(false) }

    Box(
        modifier = Modifier
            .clip(RoundedCornerShape(20))
            .background(if (isSelected) Color.Black else Color.LightGray)
            .clickable {
            },
        contentAlignment = Alignment.Center
    ){
        Text(
            modifier = Modifier.padding(5.dp),
            text = text,
            color = if (isSelected)Color.Green else Color.Black,
            fontSize = 22.sp,
            fontWeight = FontWeight.Bold
        )
    }

}
@Composable
@OptIn(ExperimentalMaterial3Api::class)
fun ConsignmentCard() {
    val cardWidth = 130.dp
    val cardHeight = 200.dp
       Card(
           shape = RoundedCornerShape(16.dp),
           modifier = Modifier
               .padding(10.dp)
               .size(cardWidth, cardHeight)
               .background(Color.Red),
           elevation = CardDefaults.cardElevation(defaultElevation = 10.dp)
       ) {
           Icon(
               painter = painterResource(R.drawable.trolley),
               tint = Color.Unspecified,
               contentDescription = "Trolley",
               modifier = Modifier
                   .padding(10.dp)
                   .size(100.dp)
                   .align(Alignment.CenterHorizontally)
           )
           Text(
               text = "Consignments",
               modifier = Modifier.align(Alignment.CenterHorizontally),
               fontWeight = FontWeight.Bold,
               fontSize = 20.sp,
               color = Color.Black,
               textAlign = TextAlign.Center

           )

       }
}

@Composable
@OptIn(ExperimentalMaterial3Api::class)
fun GateLogsCard() {
    val cardWidth = 150.dp
    val cardHeight = 95.dp
    Card(
        shape = RectangleShape,
        modifier = Modifier
            .padding(5.dp)
            .size(cardWidth, cardHeight)
            .background(Color.Green),
        elevation = CardDefaults.cardElevation(defaultElevation = 10.dp)
    ) {
        Icon(
            painter = painterResource(R.drawable.securitygate),
            tint = Color.Unspecified,
            contentDescription = "Securitygate",
            modifier = Modifier
                .padding(10.dp)
                .size(50.dp)
                .align(Alignment.CenterHorizontally)
        )
        Text(
            text = "Gate Logs",
            modifier = Modifier.align(Alignment.CenterHorizontally),
            fontWeight = FontWeight.Bold,
            fontSize = 20.sp,
            color = Color.Black,
            textAlign = TextAlign.Center
        )
    }
}
@Composable
@OptIn(ExperimentalMaterial3Api::class)
fun WareHouseCard() {
    val cardWidth = 150.dp
    val cardHeight = 95.dp
    Card(
        shape = RectangleShape,
        modifier = Modifier
            .padding(2.dp)
            .size(cardWidth, cardHeight)
            .background(Color.Green),
        elevation = CardDefaults.cardElevation(defaultElevation = 10.dp),
    ) {
        Icon(
            painter = painterResource(R.drawable.warehouse1),
            tint = Color.Unspecified,
            contentDescription = "Warehouse1",
            modifier = Modifier
                .padding(8.dp)
                .size(50.dp)
                .align(Alignment.CenterHorizontally)
        )
        Text(
            text = "WareHouse",
            modifier = Modifier.align(Alignment.CenterHorizontally),
            fontWeight = FontWeight.Bold,
            fontSize = 20.sp,
            color = Color.Black,
            textAlign = TextAlign.Center,

        )
    }
}
