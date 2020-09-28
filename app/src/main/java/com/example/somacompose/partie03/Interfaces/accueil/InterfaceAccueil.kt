package com.example.somacompose.partie03.Interfaces.accueil

import androidx.compose.foundation.Icon
import androidx.compose.foundation.Text
import androidx.compose.foundation.layout.RowScope.gravity
import androidx.compose.foundation.lazy.LazyColumnFor
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.example.somacompose.data.listeArtiste
import com.example.somacompose.partie02.DrawerComposable

@Composable
fun InterfaceAccueil(){
    val scaffoldState = rememberScaffoldState()
    val affichageSnack = remember { mutableStateOf(false) }
    Scaffold(
            scaffoldState = scaffoldState,
            drawerContent = { DrawerComposable() },
            topBar = {
                TopAppBar(
                        title = { Text(text = "Soma Compose") },
                        backgroundColor = MaterialTheme.colors.background,
                        actions = {
                            IconButton(onClick = {}) {
                                Icon(Icons.Filled.Search)
                            }
                            IconButton(onClick = {}) {
                                Icon(Icons.Filled.MoreVert)
                            }
                        },
                        navigationIcon = {
                            IconButton(
                                    onClick = { scaffoldState.drawerState.open() }
                            ) {
                                Icon(Icons.Filled.Menu)
                            }
                        }
                )
            },
            bodyContent = {
                LazyColumnFor(items = listeArtiste) { item ->
                    AtualiteArtiste(artiste = item)
                }
            },
            floatingActionButton = {
                FloatingActionButton(onClick = { affichageSnack.value = true }) {
                    Icon(Icons.Filled.Add, tint = MaterialTheme.colors.background)
                }
            }
    )
    AfficherSnackBar(
            afficherSnackbar = affichageSnack.value,
            onDismiss = { affichageSnack.value = false },
            modifier = Modifier.gravity(Alignment.Bottom)
    )
}