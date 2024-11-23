package com.example.easycareproject.ui.theme.screens
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Text
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.easycareproject.ui.theme.components.DeliveryRequestCard
import com.example.easycareproject.ui.theme.components.EmergencyButton
import com.example.easycareproject.ui.theme.components.MedicationReminderCard

@Composable
fun DashboardScreen(navController: NavController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Text(
            text = "EasyCare Dashboard",
            modifier = Modifier.padding(bottom = 16.dp),
            style = MaterialTheme.typography.headlineLarge
        )
        DeliveryRequestCard()

        Spacer(modifier = Modifier.height(16.dp))
        MedicationReminderCard()
        Spacer(modifier = Modifier.height(16.dp))
        EmergencyButton(
            onClick = {
                //
            }
        )
    }
}
