package com.example.somacompose.partie01

import androidx.compose.foundation.Image
import androidx.compose.foundation.Text
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.unit.dp
import com.example.somacompose.data.Artiste

@Composable
fun RowComposable(artiste: Artiste){
    Row(
            modifier = Modifier.padding(16.dp),
            verticalGravity = Alignment.CenterVertically
    ) {
        Image(
                asset = imageResource(id = artiste.imageProfilArtiste),
                modifier = Modifier
                        .size(50.dp)
                        .clip(CircleShape)
                        .border(1.dp, Color.Black, CircleShape)
        )
        Spacer(modifier = Modifier.size(8.dp))
        Text(
                text = artiste.nomArtiste,
                style = MaterialTheme.typography.h5
        )
    }
}