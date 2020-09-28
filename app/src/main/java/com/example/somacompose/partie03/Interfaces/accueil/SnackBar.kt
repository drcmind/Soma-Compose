package com.example.somacompose.partie03.Interfaces.accueil

import androidx.compose.animation.Crossfade
import androidx.compose.foundation.Box
import androidx.compose.foundation.Text
import androidx.compose.foundation.contentColor
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Snackbar
import androidx.compose.material.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.launchInComposition
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.delay

@Composable
fun AfficherSnackBar(
        afficherSnackbar : Boolean,
        modifier : Modifier = Modifier,
        onDismiss : () -> Unit = {}
){
    if(!afficherSnackbar){
        return
    }

    launchInComposition() {
        delay(5000L)
        onDismiss
    }

    Box(modifier = modifier.fillMaxWidth().wrapContentHeight(Alignment.Bottom)){
        Crossfade(current = afficherSnackbar) {
            Snackbar(
                    modifier = Modifier.padding(16.dp),
                    text = {
                        Text(
                                text = "Je suis un Snackbar",
                                style = MaterialTheme.typography.body2
                        )
                    },
                    action = {
                        TextButton(
                                onClick = onDismiss,
                                contentColor = contentColor()
                        ) {
                            Text(
                                    text = "OK",
                                    color = MaterialTheme.colors.primary
                            )
                        }
                    }
            )
        }
    }
}