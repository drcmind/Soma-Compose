package com.example.somacompose.partie02

import androidx.compose.foundation.Text
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material.AlertDialog
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun AlertDialogComposable(openDialog : MutableState<Boolean>){
    if(openDialog.value){
        AlertDialog(
                onDismissRequest = { openDialog.value = false },
                modifier = Modifier.padding(16.dp),
                title = {
                    Text(
                            text = "Titre de la boite",
                            style = MaterialTheme.typography.h5
                    )
                },
                text = { Text(text = "Je suis le contenu de la boite de dialogue") },
                buttons = {
                    Row(
                            modifier = Modifier.padding(8.dp),
                            horizontalArrangement = Arrangement.SpaceEvenly
                    ) {
                        TextButton(onClick = { openDialog.value = false }) {
                            Text(text = "ANNULER")
                        }
                        Button(onClick = { }) {
                            Text(text = "SUPPRIMER")
                        }
                    }
                }
        )
    }
}