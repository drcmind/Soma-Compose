package com.example.somacompose.partie03.Interfaces.connexionInscription

import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.CheckCircle
import androidx.compose.material.icons.filled.Close
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.ExperimentalFocus
import androidx.compose.ui.focus.FocusState
import androidx.compose.ui.focusObserver
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.example.somacompose.partie03.textFielState.EmailState
import com.example.somacompose.partie03.textFielState.TextFieldState

@Composable
fun InterfaceConnexionInscription(
        topAppBarText : String,
        onBackPressed : () -> Unit,
        modifier : Modifier = Modifier,
        content : @Composable () -> Unit
){
    Column(modifier = modifier) {
        ConnexionInscriptionTopAppBar(topAppBarText, onBackPressed)
        ScrollableColumn {
            Spacer(modifier = Modifier.preferredHeight(44.dp))
            Box(modifier = Modifier.fillMaxWidth().padding(horizontal = 20.dp)){
                content()
            }
        }
    }
}

@Composable
fun ConnexionInscriptionTopAppBar(topAppBarText : String, onBackPressed : () -> Unit){
    TopAppBar(
            title = {
                Text(
                        text = topAppBarText,
                        textAlign = TextAlign.Center,
                        modifier = Modifier.fillMaxSize().wrapContentSize(Alignment.Center)
                )
            },
            navigationIcon = {
                IconButton(onClick = onBackPressed) {
                    Icon(Icons.Filled.ArrowBack)
                }
            },
            actions = {
                Spacer(modifier = Modifier.preferredWidth(68.dp))
            },
            backgroundColor = MaterialTheme.colors.surface,
            elevation = 0.dp
    )
}

@OptIn(ExperimentalFocus::class)
@Composable
fun Email(emailState : TextFieldState = remember { EmailState() }){
    OutlinedTextField(
            value = emailState.text,
            onValueChange = { emailState.text = it },
            label = {
                ProvideEmphasis(emphasis = EmphasisAmbient.current.medium) {
                    Text(
                            text = "Email",
                            style = MaterialTheme.typography.body1
                    )
                }
            },
            modifier = Modifier.fillMaxWidth().focusObserver { focusState -> 
                val focused = focusState == FocusState.Active
                emailState.onFocusChange(focused)
                if (!focused){
                    emailState.enableShowErrors()
                }
            },
            textStyle = MaterialTheme.typography.body2,
            isErrorValue = emailState.showErrors()
    )
    emailState.getError()?.let { error -> TextFieldError(textError = error) }
}

@Composable
fun Password(label: String, passwordState: TextFieldState){
    val showPassword = remember { mutableStateOf(false) }
    OutlinedTextField(
            value = passwordState.text,
            onValueChange = {
                passwordState.text = it
                passwordState.enableShowErrors()
            },
            modifier = Modifier.fillMaxWidth(),
            textStyle = MaterialTheme.typography.body2,
            label = {
                ProvideEmphasis(emphasis = EmphasisAmbient.current.medium) {
                    Text(
                            text = label,
                            style = MaterialTheme.typography.body2
                    )
                }
            },
            trailingIcon = {
                if (showPassword.value) {
                    IconButton(onClick = { showPassword.value = false }) {
                        Icon(asset = Icons.Filled.Close)
                    }
                } else {
                    IconButton(onClick = { showPassword.value = true }) {
                        Icon(asset = Icons.Filled.CheckCircle)
                    }
                }
            },
            visualTransformation = if (showPassword.value) {
                VisualTransformation.None
            } else {
                PasswordVisualTransformation()
            },
            isErrorValue = passwordState.showErrors()
    )
    passwordState.getError()?.let { error -> TextFieldError(textError = error) }
}

@Composable
fun TextFieldError(textError: String){
    Row(modifier = Modifier.fillMaxWidth()) {
        Spacer(modifier = Modifier.preferredWidth(16.dp))
        Text(
                text = textError,
                modifier = Modifier.fillMaxWidth(),
                style = currentTextStyle().copy(color = MaterialTheme.colors.error)
        )
    }
}