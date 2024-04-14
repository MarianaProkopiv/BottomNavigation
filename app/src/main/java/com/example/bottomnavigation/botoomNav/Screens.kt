package com.example.bottomnavigation.botoomNav

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun Shelf() {
    Text(
        modifier = Modifier.fillMaxSize().wrapContentHeight(),
        text = "Shelf_screen"
    )
}
@Composable
fun User() {
    Text(
        modifier = Modifier.fillMaxSize().wrapContentHeight(),
        text = "User_screen"
    )
}
@Composable
fun Settings() {
    Text(
        modifier = Modifier.fillMaxSize().wrapContentHeight(),
        text = "Settings"
    )
}
