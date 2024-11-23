package com.example.easycareproject.ui.theme.components

import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun EmergencyButton(onClick: () -> Unit) {
    Button(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        onClick = onClick
    ) {
        Text(text = "Emergency", style = MaterialTheme.typography.bodyLarge)
    }
}
