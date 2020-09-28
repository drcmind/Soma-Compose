package com.example.somacompose.partie01

import androidx.compose.foundation.Text
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.OutlinedButton
import androidx.compose.material.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun RaisedButtonComposable(){
    Button(
        onClick = {/* Ajouter un evenement sur click ici */},
        modifier = Modifier.padding(16.dp)
    ) {
        Text("Raised Button")
    }
}

@Composable
fun OutlineButtonComposable(){
    OutlinedButton(
        onClick = {/* Ajouter un evenement sur click ici */},
        modifier = Modifier.padding(16.dp)
    ) {
        Text("Outline Button")
    }
}


@Composable
fun TextButtonComposable(){
    TextButton(
        onClick = {/* Ajouter un evenement sur click ici */},
        modifier = Modifier.padding(16.dp)
    ) {
        Text("Text Button")
    }
}

