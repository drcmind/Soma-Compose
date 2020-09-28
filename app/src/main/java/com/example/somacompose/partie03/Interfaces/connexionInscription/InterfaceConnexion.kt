package com.example.somacompose.partie03.Interfaces.connexionInscription

import androidx.compose.foundation.Text
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.OutlinedButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.somacompose.partie03.textFielState.EmailState
import com.example.somacompose.partie03.textFielState.PasswordState

sealed class EvenementConexion {
    object Accueil : EvenementConexion()
    object Inscription : EvenementConexion()
    object NavigationBack : EvenementConexion()
}

@Composable
fun InterfaceConnexion(onEvent: (EvenementConexion) -> Unit){
    Stack(modifier = Modifier.fillMaxSize()){
        InterfaceConnexionInscription(
                topAppBarText = "Connectez-vous",
                onBackPressed = { onEvent(EvenementConexion.NavigationBack) },
                modifier = Modifier.fillMaxWidth()
        ) {
            Column(modifier = Modifier.fillMaxWidth()) {
                ContenuInterfaceConnexion(onEvent = onEvent)
            }
        }
    }
}

@Composable
fun ContenuInterfaceConnexion(onEvent: (EvenementConexion) -> Unit){
    Column(modifier = Modifier.fillMaxWidth()) {

        val emailState = remember { EmailState() }
        val passwordState = remember { PasswordState() }

        Email(emailState)
        Spacer(modifier = Modifier.preferredHeight(16.dp))
        Password(label = "Mot de passe", passwordState = passwordState )
        Spacer(modifier = Modifier.preferredHeight(16.dp))
        Button(
                onClick = { onEvent(EvenementConexion.Accueil)},
                enabled = emailState.isValid && passwordState.isValid,
                modifier = Modifier.fillMaxWidth()
        ) {
            Text(text = "Connexion")
        }
        Spacer(modifier = Modifier.preferredHeight(8.dp))
        OutlinedButton(
                onClick = { onEvent(EvenementConexion.Inscription) },
                modifier = Modifier.fillMaxWidth()
        ) {
            Text(text = "Besoin d'un nouveau compte ?")
        }

    }
}