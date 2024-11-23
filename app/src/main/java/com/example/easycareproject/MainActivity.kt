package com.example.easycareproject

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.easycareproject.ui.theme.screens.DashboardScreen
import com.example.easycareproject.ui.theme.screens.HomeScreen
import com.example.easycareproject.ui.theme.screens.WelcomeScreen
import com.example.easycareproject.ui.theme.theme.EasyCareTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            EasyCareTheme {
                //main navigation
                val navController = rememberNavController()
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    AppNavigation(navController)
                }
            }
        }
    }
}

@Composable
fun AppNavigation(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = "welcome"
    ) {
        composable("welcome") {
            WelcomeScreen(navController = navController)
        }
        composable("home_screen") {
            HomeScreen(navController = navController)
        }
        composable("dashboard_screen") {
            DashboardScreen(navController = navController)
        }
    }
}