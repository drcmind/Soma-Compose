package com.example.somacompose.partie01

import androidx.compose.foundation.Icon
import androidx.compose.foundation.Text
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ConstraintLayout
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.FloatingActionButton
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.somacompose.data.artiste3

@Composable
fun ConstraintLayoutComposable() {
    ConstraintLayout {

        //déclaration de variables pour la construiction des composables
        val(
                topbar,
                column,
                fab,
                fab2
        ) = createRefs()

        TopAppBar(
                title = { Text(text = "Soma Compose")},
                modifier = Modifier.constrainAs(topbar){
                    top.linkTo(parent.top)
                }
        )
        
        Column(
                modifier = Modifier
                        .fillMaxSize()
                        .constrainAs(column) {
                            top.linkTo(topbar.bottom, margin = 16.dp)
                        }
        ) {
           ColumnComposable(artiste = artiste3)
        }

        FloatingActionButton(
                onClick = {},
                modifier = Modifier.constrainAs(fab) {
                    bottom.linkTo(parent.bottom, margin = 16.dp)
                    end.linkTo(parent.end, margin = 16.dp)
                }
        ) {
            Icon(Icons.Filled.Add)
        }

        FloatingActionButton(
                onClick = {},
                modifier = Modifier.constrainAs(fab2) {
                    bottom.linkTo(fab.top, margin = 16.dp)
                    end.linkTo(parent.end, margin = 16.dp)
                }
        ) {
            Icon(Icons.Filled.Favorite)
        }
    }
}