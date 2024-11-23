package com.example.easycareproject.ui.theme.components

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
//import androidx.compose.material3.icons.Icons
//import androidx.compose.material3.icons.filled.ShoppingCart
import androidx.compose.runtime.Composable

@Composable
fun DeliveryRequestCard() {
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
            Icon(
                imageVector = Icons.Filled.ShoppingCart,
                contentDescription = "Delivery Request",
                modifier = Modifier.size(40.dp),
                tint = Color.Green
            )
            Spacer(modifier = Modifier.width(16.dp))
            Column {
                Text(
                    text = "Delivery Request Pending",
                    style = MaterialTheme.typography.bodyLarge
                )
                Text(
                    text = "Your delivery is on the way.",
                    style = MaterialTheme.typography.bodyMedium
                )
            }
        }
    }
}
