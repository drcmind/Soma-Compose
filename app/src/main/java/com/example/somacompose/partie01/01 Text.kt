package com.example.somacompose.partie01

import androidx.compose.foundation.Text
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

@Composable
fun TextComposable(text:String){
    Text(
        text = text,
        color = Color.Blue,
        style = MaterialTheme.typography.h5
    )
}
