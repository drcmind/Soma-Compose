package com.example.somacompose.partie03.Interfaces.accueil

import androidx.compose.foundation.Image
import androidx.compose.foundation.Text
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.unit.dp
import com.example.somacompose.data.Artiste

@Composable
fun AtualiteArtiste(artiste: Artiste){
    val openDialog = remember { mutableStateOf(false) }
    val paddingDeHors = 16.dp
    val paddingDeDans = 8.dp
    BoiteDeDialogue(openDialog = openDialog, artiste = artiste)
    Card(
            elevation = 4.dp,
            modifier = Modifier
                    .padding(paddingDeHors)
                    .clickable(onClick = { openDialog.value = !openDialog.value})
                    .fillMaxWidth()
    ) {
        Column {
            Row(
                    modifier = Modifier.padding(paddingDeDans),
                    verticalGravity = Alignment.CenterVertically
            ) {
                Image(
                        asset = imageResource(id = artiste.imageProfilArtiste),
                        contentScale = ContentScale.Crop,
                        modifier = Modifier.size(50.dp).clip(CircleShape)
                )
                Spacer(modifier = Modifier.size(16.dp))
                Column {
                    Text(
                            text = artiste.nomArtiste,
                            style = MaterialTheme.typography.h5
                    )
                    Text(
                            text = artiste.datePoste,
                            style = MaterialTheme.typography.body1
                    )
                }
            }
            Image(
                    asset = imageResource(id = artiste.imagePostArtiste),
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                            .padding(start = paddingDeDans, bottom = paddingDeDans, end = paddingDeDans)
                            .preferredHeight(200.dp)
                            .fillMaxWidth()
                            .clip(RoundedCornerShape(4.dp))
            )
        }
    }
}