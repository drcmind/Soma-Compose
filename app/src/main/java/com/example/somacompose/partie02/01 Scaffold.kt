package com.example.somacompose.partie02

import androidx.compose.foundation.Icon
import androidx.compose.foundation.ScrollableColumn
import androidx.compose.foundation.Text
import androidx.compose.foundation.layout.Column
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.Composable
import com.example.somacompose.data.artiste3
import com.example.somacompose.data.artiste5
import com.example.somacompose.data.listArtiste
import com.example.somacompose.partie01.CardComposable

@Composable
fun ScaffoldComposable(){
    val scaffoldState = rememberScaffoldState()
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
                            IconButton(onClick = { scaffoldState.drawerState.open() }) {
                                Icon(Icons.Filled.Menu)
                            }
                        }
                )
            },
            bodyContent = {
                LazyColumnForComposable(feedItems = listArtiste)
            },
            floatingActionButtonPosition = FabPosition.Center,
            floatingActionButton = {
                FloatingActionButton(onClick = {}) {
                    Icon(Icons.Filled.Add, tint = MaterialTheme.colors.background)
                }
            }
    )
}