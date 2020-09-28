package com.example.somacompose.partie01

import androidx.compose.foundation.Icon
import androidx.compose.foundation.Text
import androidx.compose.foundation.layout.padding
import androidx.compose.material.ExtendedFloatingActionButton
import androidx.compose.material.FloatingActionButton
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun FabComposable(){
    FloatingActionButton(
            onClick = {/* ajouterUnEvenement() */},
            modifier = Modifier.padding(16.dp)
    ) {
        Icon(Icons.Filled.Favorite, tint = Color.White)
    }
}

@Composable
fun EfabComposable(){
    ExtendedFloatingActionButton(
            text = { Text(text = "J'AIME") },
            onClick = {/* ajouterUnEvenement() */ },
            icon = { Icon(Icons.Filled.Favorite) },
            modifier = Modifier.padding(16.dp)
    )
}