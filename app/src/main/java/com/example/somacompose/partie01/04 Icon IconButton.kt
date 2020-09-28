package com.example.somacompose.partie01

import androidx.compose.foundation.Icon
import androidx.compose.foundation.layout.padding
import androidx.compose.material.IconButton
import androidx.compose.material.MaterialTheme
import androidx.compose.material.MaterialTheme.colors
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material.icons.filled.ThumbUp
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun IconComposable(){
    Icon(
        Icons.Filled.Phone,
        tint = colors.primary,
        modifier = Modifier.padding(16.dp)
    )
}

@Composable
fun IconButtonComposable(){
    IconButton(
        onClick = {/*ajouterUnEvenement*/},
        modifier = Modifier.padding(16.dp)
    ) {
        Icon(Icons.Filled.ThumbUp)
    }
}