package com.example.somacompose.partie03.Interfaces.accueil

import androidx.compose.foundation.Image
import androidx.compose.foundation.Text
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.preferredHeight
import androidx.compose.material.AlertDialog
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.unit.dp
import com.example.somacompose.data.Artiste

@Composable
fun BoiteDeDialogue(
        openDialog : MutableState<Boolean>,
        artiste: Artiste
){
    if(openDialog.value){
        AlertDialog(
                onDismissRequest = { openDialog.value = false },
                modifier = Modifier.padding(16.dp),
                title = {
                    Text(
                            text = artiste.nomArtiste,
                            style = MaterialTheme.typography.h5
                    )
                },
                text = {
                    Image(
                            asset = imageResource(id = artiste.imagePostArtiste),
                            contentScale = ContentScale.Crop,
                            modifier = Modifier.preferredHeight(200.dp).fillMaxWidth()
                    )
                },
                buttons = {
                    Button(
                            modifier = Modifier.fillMaxWidth().padding(8.dp),
                            onClick = { openDialog.value = false }
                    ) {
                        Text(text = "OK")
                    }
                }

        )
    }
}