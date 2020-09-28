package com.example.somacompose.partie01

import androidx.compose.foundation.Image
import androidx.compose.foundation.Text
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.unit.dp
import com.example.somacompose.data.Artiste

@Composable
fun ColumnComposable(artiste: Artiste){
    Column(
            horizontalGravity = Alignment.CenterHorizontally,
            modifier = Modifier.padding(16.dp)
    ) {
        Image(
               asset = imageResource(id = artiste.imagePostArtiste),
               modifier = Modifier.clip(RoundedCornerShape(4.dp))
        )
        Text(
                text = artiste.nomArtiste,
                style = MaterialTheme.typography.h4
        )
        Text(
                text = artiste.datePoste,
                style = MaterialTheme.typography.h5
        )
    }
}