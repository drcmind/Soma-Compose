package com.example.somacompose.partie03.Interfaces.bienvenue

import androidx.compose.foundation.Image
import androidx.compose.foundation.Text
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.OutlinedButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.example.somacompose.R

sealed class EvenementBienvenue {
    object Connexion : EvenementBienvenue()
    object Inscription : EvenementBienvenue()
}

@Composable
fun InterfaceBienvenue(onEvent: (EvenementBienvenue) -> Unit) {
    Column(
            modifier = Modifier.padding(16.dp),
            verticalArrangement = Arrangement.Center,
            horizontalGravity = Alignment.CenterHorizontally
    ) {
        Spacer(modifier = Modifier.size(64.dp))
        Image(asset = imageResource(id = R.drawable.compose_illustrator))
        Spacer(modifier = Modifier.size(16.dp))
        Text(
                text = "Soma Compose",
                style = MaterialTheme.typography.h4,
                textAlign = TextAlign.Center
        )
        Text(
                text = "Soma Compose est une application" +
                        " developée pour illustrer comment est-ce que " +
                        "JetPack Compose vient de rendre le developpement " +
                        "des applications Android encore plus facile",
                style = MaterialTheme.typography.h6,
                textAlign = TextAlign.Center
        )
        Spacer(modifier = Modifier.size(16.dp))
        Row() {
            OutlinedButton(onClick = { onEvent(EvenementBienvenue.Connexion) }) {
                Text(text = "Connectez-vous")
            }
            Spacer(modifier = Modifier.size(8.dp))
            Button(onClick = { onEvent(EvenementBienvenue.Inscription)}) {
                Text(text = "Créer un compte")
            }
        }
    }
}