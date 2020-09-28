@file:Suppress("DEPRECATION")

package com.example.somacompose.partie01

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.state
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawShadow
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.unit.dp
import com.example.somacompose.R

@Composable
fun ModifierComposable(){
    val (shape, setShape) = state<Shape> { CircleShape }
    Image(
        asset = imageResource(id = R.drawable.image_jetpack),
        modifier = Modifier
            .size(256.dp)
            .padding(16.dp)
            .drawShadow(8.dp, shape)
            .border(6.dp, MaterialTheme.colors.primary, shape)
            .border(12.dp, MaterialTheme.colors.secondaryVariant, shape)
            .border(18.dp, MaterialTheme.colors.secondary, shape)
            .clickable {
                setShape(
                    if(shape == CircleShape){
                        CutCornerShape(topLeft = 32.dp, bottomRight = 32.dp)
                    }else{
                        CircleShape
                    }
                )
            }
    )
}