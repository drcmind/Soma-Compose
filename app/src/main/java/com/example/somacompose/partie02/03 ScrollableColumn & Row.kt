package com.example.somacompose.partie02

import androidx.compose.foundation.ScrollableColumn
import androidx.compose.foundation.ScrollableRow
import androidx.compose.runtime.Composable
import com.example.somacompose.data.artiste1
import com.example.somacompose.data.artiste2
import com.example.somacompose.data.artiste3
import com.example.somacompose.data.artiste4
import com.example.somacompose.partie01.CardComposable

@Composable
fun ScrollableColumnComposable(){
    ScrollableColumn {
        CardComposable(artiste = artiste1)
        CardComposable(artiste = artiste2)
        CardComposable(artiste = artiste3)
        CardComposable(artiste = artiste4)
    }
}

@Composable
fun ScrollableRowComposable(){
    ScrollableRow {
        CardComposable(artiste = artiste1)
        CardComposable(artiste = artiste2)
        CardComposable(artiste = artiste3)
        CardComposable(artiste = artiste4)
    }
}