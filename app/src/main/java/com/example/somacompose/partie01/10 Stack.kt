package com.example.somacompose.partie01

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun StackComposable() {
    Stack(modifier = Modifier.padding(16.dp)) {
        Surface(
                color = MaterialTheme.colors.primary,
                modifier = Modifier.fillMaxSize(),
                shape = RoundedCornerShape(60.dp)
        ) {

        }
        Surface(
                color = MaterialTheme.colors.primaryVariant,
                modifier = Modifier.preferredHeight(400.dp).fillMaxWidth(),
                shape = RoundedCornerShape(60.dp)
        ) {

        }
        Surface(
                color = MaterialTheme.colors.secondary,
                modifier = Modifier.preferredHeight(300.dp).fillMaxWidth(),
                shape = RoundedCornerShape(60.dp)
        ) {

        }
        Surface(
                color = MaterialTheme.colors.secondaryVariant,
                modifier = Modifier.preferredHeight(200.dp).fillMaxWidth(),
                shape = RoundedCornerShape(60.dp)
        ) {

        }
    }
}