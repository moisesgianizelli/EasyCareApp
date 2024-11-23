package com.example.easycareproject.ui.theme.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun HomeScreen(navController: NavController) {
    // initial screen
    Box(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        contentAlignment = Alignment.Center
    ) {
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Text(text = "Welcome to EasyCare App!", modifier = Modifier.padding(bottom = 20.dp))
            Button(onClick = {

                navController.navigate("dashboard_screen")
            }) {
                Text(text = "Get Started")
            }
        }
    }
}
