package com.example.logistics.screens.ui.theme

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp

@Composable
fun AddClient() {
    var country by remember { mutableStateOf("") }
    var company by remember { mutableStateOf("") }
    var person by remember { mutableStateOf("") }
    var mobile by remember { mutableStateOf("") }
    var email by remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(50.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(2.dp)
    ) {
        TextField(
            value = country,
            onValueChange = { country = it },
            label = { Text("Country") },
            placeholder = { Text("Enter Country Name") }
        )

        TextField(
            value = company,
            onValueChange = { company = it },
            label = { Text("Company") },
            placeholder = { Text("Enter Company Name") }

        )

        TextField(
            value = person,
            onValueChange = { person = it },
            label = { Text("Person") },
            placeholder = { Text("Enter Clent's Name") }
        )

        TextField(
            value = mobile,
            onValueChange = { mobile = it },
            label = { Text("Mobile") },
            placeholder = { Text("Enter Phone Number") },
            keyboardOptions = KeyboardOptions.Default.copy(
                keyboardType = KeyboardType.Number
            )
        )

        TextField(
            value = email,
            onValueChange = { email = it },
            label = { Text("Email") },
            placeholder = { Text("Enter your Email Adress") },
            keyboardOptions = KeyboardOptions.Default.copy(
                keyboardType = KeyboardType.Email
                //keyboardCapitalization = KeyboardCapitalization.None
            )
        )

        Button(
            onClick = {
            },
            modifier = Modifier.align(Alignment.CenterHorizontally)
        ) {
            Text(text = "Save")
        }
    }
}



