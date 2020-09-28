package com.example.somacompose.partie03.Interfaces.connexionInscription

import androidx.compose.foundation.Text
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.preferredHeight
import androidx.compose.material.Button
import androidx.compose.material.OutlinedButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.somacompose.partie03.textFielState.ConfirmPasswordState
import com.example.somacompose.partie03.textFielState.EmailState
import com.example.somacompose.partie03.textFielState.PasswordState

sealed class EvenementInscription {
    object Accueil : EvenementInscription()
    object Connexion : EvenementInscription()
    object NavigationBack : EvenementInscription()
}

@Composable
fun InterfaceInscription(onEvent : (EvenementInscription) -> Unit) {
    InterfaceConnexionInscription(
            topAppBarText = "Créer un compte",
            onBackPressed = { onEvent(EvenementInscription.NavigationBack) },
            modifier = Modifier.fillMaxWidth()
    ) {
        Column {
            ContenuInterfaceInscription(onEvent = onEvent)
        }
    }
}

@Composable
fun ContenuInterfaceInscription(onEvent: (EvenementInscription) -> Unit){
    Column(modifier = Modifier.fillMaxWidth()) {
        
        val emailState = remember { EmailState() }
        val passwordState = remember { PasswordState() }
        val confirmPasswordState = remember { ConfirmPasswordState(passwordState = passwordState) }
        
        Email(emailState)
        Spacer(modifier = Modifier.preferredHeight(16.dp))
        Password(label = "Mot de passe", passwordState = passwordState )
        Spacer(modifier = Modifier.preferredHeight(16.dp))
        Password(label = "Confirmez le mot de passe", passwordState = confirmPasswordState )
        Spacer(modifier = Modifier.preferredHeight(16.dp))
        Button(
                onClick = { onEvent(EvenementInscription.Accueil) },
                enabled = emailState.isValid && passwordState.isValid
                        && confirmPasswordState.isValid,
                modifier = Modifier.fillMaxWidth()
        ) {
          Text(text = "Inscription")  
        }
        Spacer(modifier = Modifier.preferredHeight(8.dp))
        OutlinedButton(
                onClick = { onEvent(EvenementInscription.Connexion)},
                modifier = Modifier.fillMaxWidth()
        ) {
            Text(text = "Avez-vous déjà un compte ?")
        }
    }
}
