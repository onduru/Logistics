package com.example.logistics.screens

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.logistics.R
import com.example.logistics.navcontroller.BottomMenuContent
import com.example.logistics.navcontroller.Course
import com.example.logistics.navcontroller.standardQuadFromTo
import com.example.logistics.screens.ui.theme.LogisticsTheme


/*@Composable
fun Bookings(navController: NavHostController? = null ) {
    var text by remember { mutableStateOf(TextFieldValue("")) }
    TextField(
        value = text,
        onValueChange = { newText ->
            text = newText
        }
    )
}*/

@OptIn(ExperimentalFoundationApi::class)
@Composable
//fun HomeScreen()
fun Bookings(){
    // this is the most outer box
    // having all the views inside it
    Box(
        modifier = Modifier
            .background(Color.Blue)
            .fillMaxSize()
    ) {
        Column {
            // this is the function for header
           // GreetingSection()
            // it's for chipsSecation, and pass
            // as many strings as you want
            ChipSection(chips = listOf("Data structures", "Algorithms", "competitive programming", "python"))
            // function for suggestionSection
           // suggestionSection()
            // this is for course secation
            CourseSection(
                // function require list of courses and
                // one course contain 5 attributes
                courses = listOf(
                    Course(
                        title = "geek of the year",
                        R.drawable.trolley,
                        // these are colors.......
                        Color.Magenta,
                        Color.Magenta,
                        Color.Magenta
                    ),
                    // below are the copies of the objects
                    // and you can add as many as you want
                    Course(
                        title = "How does AI Works",
                        R.drawable.securitygate,
                        Color.Magenta,
                        Color.Magenta,
                        Color.Magenta
                    ),
                    Course(
                        title = "Advance python Course",
                        R.drawable.customer,
                        Color.Magenta,
                        Color.Magenta,
                        Color.Magenta

                    ),
                    Course(
                        title = "Advance Java Course",
                        R.drawable.securitygate,
                        Color.Magenta,
                        Color.Magenta,
                        Color.Magenta
                    ),
                    Course(
                        title = "prepare for aptitude test",
                        R.drawable.securitygate,
                        Color.Cyan,
                        Color.Cyan,
                        Color.Cyan

                    ),
                    Course(
                        title = "How does AI Works",
                        R.drawable.cargo,
                        Color.Green,
                        Color.Green,
                        Color.Cyan
                    ),
                )
            )
        }
        // this is the final one that is bottomMenu
        BottomMenu(items = listOf(
            // having 5 instances
            BottomMenuContent("Home", R.drawable.customer),
            BottomMenuContent("explore", R.drawable.customer),
            BottomMenuContent("dark mode", R.drawable.customer),
            BottomMenuContent("videos", R.drawable.customer),
            BottomMenuContent("Profile", R.drawable.customer),
        ), modifier = Modifier.align(Alignment.BottomCenter))
    }
}

// This is how we can create chip seaction at the top of app

@Composable
fun ChipSection(
    // function with single argument
    chips: List<String>
) {
    var selectedChipIndex by remember {
        // it will not update the string
        // but save and it will helpful for us
        mutableStateOf(0)
    }
    LazyRow {
        items(chips.size) {
            Box(
                contentAlignment = Alignment.Center,
                modifier = Modifier
                    .padding(start = 15.dp, top = 15.dp, bottom = 15.dp)
                    .clickable {
                        selectedChipIndex = it
                    }
                    .clip(RoundedCornerShape(10.dp))
                    .background(
                        // this is basic condition for selected chip index
                        if (selectedChipIndex == it) Color.Green
                        else Color.DarkGray
                    )
                    .padding(15.dp)
            ) {
                Text(text = chips[it], color = Color.White)
            }
        }
    }
}

@Composable
fun SuggestionSection(
    color: Color = Color.Cyan
) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween,
        modifier = Modifier
            .padding(15.dp)
            .clip(RoundedCornerShape(10.dp))
            .background(color)
            .padding(horizontal = 15.dp, vertical = 20.dp)
            .fillMaxWidth()
    ) {
        Column {
            // here are two text views or we can say only text
            Text(
                text = "Daily Coding",
                // it can be litile bit confusing but
                // it is just text style alternate
                // of fontfamily in XML
                style = MaterialTheme.typography.h2

            )
            Text(
                // same as above
                text = "do at least • 3-10 problems / day",
                style = MaterialTheme.typography.body1,
                color = Color.White
            )
        }
        Box(
            // box containing icon
            contentAlignment = Alignment.Center,
            modifier = Modifier
                .size(40.dp)
                .clip(CircleShape)
                .background(Color.Blue)
                .padding(10.dp)
        ) {
            Icon(
                painter = painterResource(id = R.drawable.warehouse1),
                contentDescription = "Play",
                tint = Color.White,
                modifier = Modifier.size(16.dp)
            )
        }
    }
}

@Composable
// this function tells us that
// how menu item should look like
fun BottomMenu(
    items: List<BottomMenuContent>,
    modifier: Modifier = Modifier,
    activeHighlightColor: Color = Color.Green,
    activeTextColor: Color = Color.White,
    inactiveTextColor: Color = Color.Blue,
    initialSelectedItemIndex: Int = 0
) {
    var selectedItemIndex by remember {
        mutableStateOf(initialSelectedItemIndex)
    }
    Row(
        horizontalArrangement = Arrangement.SpaceAround,
        verticalAlignment = Alignment.CenterVertically,
        modifier = modifier
            .fillMaxWidth()
            .background(Color.Blue)
            .padding(15.dp)
    ) {
        // it is basically what we should have
        // for creating an element of BottomMenuItem
        items.forEachIndexed { index, item ->
            BottomMenuItem(
                item = item,
                isSelected = index == selectedItemIndex,
                activeHighlightColor = activeHighlightColor,
                activeTextColor = activeTextColor,
                inactiveTextColor = inactiveTextColor
            ) {
                selectedItemIndex = index
            }
        }
    }
}


// it's basically how menu item should look like
@Composable
fun BottomMenuItem(
    item: BottomMenuContent,
    isSelected: Boolean = false,
    activeHighlightColor: Color = Color.Green,
    activeTextColor: Color = Color.White,
    inactiveTextColor: Color= Color.Blue,
    onItemClick: () -> Unit
) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier.clickable {
            onItemClick()
        }
    ) {
        // here are some peremetens
        // for how elements will align
        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier
                .clip(RoundedCornerShape(10.dp))
                .background(if (isSelected) activeHighlightColor else Color.Transparent)
                .padding(10.dp)
        ) {
            Icon(
                painter = painterResource(id = item.iconId),
                contentDescription = item.title,
                tint = if (isSelected) activeTextColor else inactiveTextColor,
                modifier = Modifier.size(20.dp)
            )
        }
        Text(
            text = item.title,
            // it's basic condition
            color = if(isSelected) activeTextColor else inactiveTextColor
        )
    }
}

@ExperimentalFoundationApi
@Composable
// here we have just passed the list of courses
fun CourseSection(courses: List<Course>) {
    Column(modifier = Modifier.fillMaxWidth()) {
        Text(
            text = "courses",
            style = MaterialTheme.typography.h1,
            modifier = Modifier.padding(15.dp)
        )
        // we have used lazyVertically grid
      /* LazyVerticalGrid(
            cells = GridCells.Fixed(2), // it basically tells no. of cells in a row
            contentPadding = PaddingValues(start = 7.5.dp, end = 7.5.dp,bottom = 100.dp),
            modifier = Modifier.fillMaxHeight()
        ) {
            items(courses.size) {
                // here we have to define how one of these item is look like
                // we will tell after defining item design
                // let me comment it for now and after
                // creating you just have to remove

                // CourseItem(course = courses[it])
            }
        }*/
    }
}

@Composable
fun CourseItem(
    course: Course
) {
    BoxWithConstraints(
        // Box with some attributes
        modifier = Modifier
            .padding(7.5.dp)
            .aspectRatio(1f)
            .clip(RoundedCornerShape(10.dp))
            .background(Color.Black)
    ) {
        val width = constraints.maxWidth
        val height = constraints.maxHeight
        // setting 5 points for medium
        // color or we can say for another
        // Medium colored path
        val mediumColoredPoint1 = Offset(0f, height * 0.3f)
        val mediumColoredPoint2 = Offset(width * 0.1f, height * 0.35f)
        val mediumColoredPoint3 = Offset(width * 0.4f, height * 0.05f)
        val mediumColoredPoint4 = Offset(width * 0.75f, height * 0.7f)
        val mediumColoredPoint5 = Offset(width * 1.4f, -height.toFloat())
        // joining points to make curves with the help of path class
        // path file that we have created earlier
        // having function that just help to reduce our code
        // and the function is standardQuadFromTo(m1,m2) taking
        // two peramente and connect them
        val mediumColoredPath = Path().apply {
            moveTo(mediumColoredPoint1.x, mediumColoredPoint1.y)
            standardQuadFromTo(mediumColoredPoint1, mediumColoredPoint2)
            standardQuadFromTo(mediumColoredPoint2, mediumColoredPoint3)
            standardQuadFromTo(mediumColoredPoint3, mediumColoredPoint4)
            standardQuadFromTo(mediumColoredPoint4, mediumColoredPoint5)
            lineTo(width.toFloat() + 100f, height.toFloat() + 100f)
            lineTo(-100f, height.toFloat() + 100f)
            close()
        }
        // it's another part of that
        // texture with light color
        // Light colored path
        val lightPoint1 = Offset(0f, height * 0.35f)
        val lightPoint2 = Offset(width * 0.1f, height * 0.4f)
        val lightPoint3 = Offset(width * 0.3f, height * 0.35f)
        val lightPoint4 = Offset(width * 0.65f, height.toFloat())
        val lightPoint5 = Offset(width * 1.4f, -height.toFloat() / 3f)

        val lightColoredPath = Path().apply {
            moveTo(lightPoint1.x, lightPoint1.y)
            standardQuadFromTo(lightPoint1, lightPoint2)
            standardQuadFromTo(lightPoint2, lightPoint3)
            standardQuadFromTo(lightPoint3, lightPoint4)
            standardQuadFromTo(lightPoint4, lightPoint5)
            lineTo(width.toFloat() + 100f, height.toFloat() + 100f)
            lineTo(-100f, height.toFloat() + 100f)
            close()
        }
        // canvas is used when we
        // want to draw something
        Canvas(
            modifier = Modifier
                .fillMaxSize()
        ) {
            drawPath(
                // function for drawing paths
                // just pass the path
                path = mediumColoredPath,
                color = course.mediumColor
            )
            drawPath( // it's for the lighter path
                path = lightColoredPath,
                color = course.lightColor
            )
        }
        // so , we have done with texture and
        // now just creating box and other things
        // box containing course elements
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(15.dp)
        ) {
            Text(
                text = course.title,
                style = MaterialTheme.typography.h2,
                lineHeight = 26.sp,
                modifier = Modifier.align(Alignment.TopStart)
            )
            Icon(
                painter = painterResource(id = course.iconId),
                contentDescription = course.title,
                tint = Color.White,
                modifier = Modifier.align(Alignment.BottomStart)
            )
            Text(
                text = "Start",
                color = Color.White,
                fontSize = 14.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier
                    .clickable {
                        // Handle the clicks
                    }
                    .align(Alignment.BottomEnd)
                    .clip(RoundedCornerShape(10.dp))
                    .background(Color.Green)
                    .padding(vertical = 6.dp, horizontal = 15.dp)
            )
        }
    }
}

