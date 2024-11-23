package com.example.easycareproject.ui.theme.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@Composable
fun WelcomeScreen(navController: NavController) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(
                brush = Brush.verticalGradient(
                    colors = listOf(
                        Color(0xFF6DD5FA),
                        Color(0xFF2980B9)
                    )
                )
            ),
        contentAlignment = Alignment.Center
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
            modifier = Modifier.padding(16.dp)
        ) {
            //title
            Text(
                text = "Welcome to EasyCare",
                fontSize = 28.sp,
                fontWeight = FontWeight.Bold,
                color = Color.White
            )
            Spacer(modifier = Modifier.height(8.dp))
            //subtitle
            Text(
                text = "Your personal health and safety companion",
                fontSize = 18.sp,
                color = Color.White.copy(alpha = 0.8f)
            )
            Spacer(modifier = Modifier.height(32.dp))
            //btns
            Button(
                onClick = { navController.navigate("login") },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 24.dp),
                shape = RoundedCornerShape(12.dp)
            ) {
                Text(text = "Login", fontSize = 16.sp)
            }
            Spacer(modifier = Modifier.height(16.dp))
            Button(
               // onClick = { navController.navigate("signup") },
                {navController.navigate("home_screen")},
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 24.dp),
                shape = RoundedCornerShape(12.dp),
            ) {
                Text(text = "Sign Up", fontSize = 16.sp)
            }
        }
    }
}
