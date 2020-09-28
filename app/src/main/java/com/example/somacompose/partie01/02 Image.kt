package com.example.somacompose.partie01

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.ImageAsset

@Composable
fun ImageComposable(image:ImageAsset){
    Image(
        asset = image,
        modifier = Modifier.fillMaxSize()
    )
}