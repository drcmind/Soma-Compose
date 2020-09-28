package com.example.somacompose.partie02

import androidx.compose.foundation.lazy.LazyColumnFor
import androidx.compose.foundation.lazy.LazyRowFor
import androidx.compose.runtime.Composable
import com.example.somacompose.data.Artiste
import com.example.somacompose.partie01.CardComposable

@Composable
fun LazyColumnForComposable(feedItems : List<Artiste>){
    LazyColumnFor(items = feedItems ) { item ->
        CardComposable(artiste = item)
    }
}

@Composable
fun LazyRowForComposable(feedItems : List<Artiste>){
    LazyRowFor(items = feedItems ) { item ->
        CardComposable(artiste = item)
    }
}