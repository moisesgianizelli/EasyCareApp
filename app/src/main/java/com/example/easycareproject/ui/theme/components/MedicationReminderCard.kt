package com.example.easycareproject.ui.theme.components

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.material.icons.Icons
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.MaterialTheme
//import androidx.compose.material3.icons.Alarm
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
//import androidx.compose.material.icons.filled.Alarm
//import androidx.compose.material3.icons.extended.Alarm
@Composable
fun MedicationReminderCard() {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp),
        shape = MaterialTheme.shapes.medium.copy(CornerSize(12.dp))
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
//            Icon(
//                imageVector = Icons.Filled.Alarm,
//                contentDescription = "Medication Reminder",
//                modifier = Modifier.size(40.dp),
//                tint = Color.Blue
//            )
            Spacer(modifier = Modifier.width(16.dp))
            Column {
                Text(
                    text = "Next Medication",
                    style = MaterialTheme.typography.bodyLarge
                )
                Text(
                    text = "Take your medication in 2 hours.",
                    style = MaterialTheme.typography.bodyMedium
                )
            }
        }
    }
}
