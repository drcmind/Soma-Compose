@file:Suppress("DEPRECATION")

package com.example.somacompose.partie01

import androidx.compose.foundation.Text
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.runtime.Composable
import androidx.compose.runtime.state
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun StateOfComposable(){
    val count = state { 0 }
    Button(
            onClick = { count.value ++ },
            modifier = Modifier.padding(64.dp)
    ) {
        Text(text = "Tu m'as cliqué ${count.value}")
    }
}
