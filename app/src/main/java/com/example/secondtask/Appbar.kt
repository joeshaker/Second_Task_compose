package com.example.secondtask

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.ArrowBack
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.ui.text.TextStyle
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.font.FontWeight

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AppBar(
    showNavigationIcon: Boolean=true,
    title:String,
    title_style:TextStyle=MaterialTheme.typography.titleLarge) {
    CenterAlignedTopAppBar(
        title = { Text(text = title, style = title_style, fontWeight = FontWeight.Bold)},
        navigationIcon = {
            if (showNavigationIcon) {
                Icon(
                    imageVector = Icons.Rounded.ArrowBack,
                    contentDescription = "Back"
                )
            }
        }
    )
}