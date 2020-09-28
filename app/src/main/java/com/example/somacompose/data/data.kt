package com.example.somacompose.data

import com.example.somacompose.R

data class Artiste (
        var nomArtiste: String,
        var imageProfilArtiste : Int,
        var imagePostArtiste : Int,
        var datePoste : String
)

val artiste1 = Artiste(
        "Fally Ipupa",
        R.drawable.fally_profil,
        R.drawable.fally_post,
        "il y a 3 heures"
)

val artiste2 = Artiste(
        "Dadju",
        R.drawable.dadju_profil,
        R.drawable.dadju_post,
        "il y a 10 heures"
)

val artiste3 = Artiste(
        "Justin bieber",
        R.drawable.justin_profil,
        R.drawable.justin_post,
        "il y a 15 heures"
)

val artiste4 = Artiste(
        "Tatiana Manaois",
        R.drawable.tatianna_profil,
        R.drawable.tatiana_post,
        "il y a 16 heures"
)

val artiste5 = Artiste(
        "Ed Shareen",
        R.drawable.edshareen_profil,
        R.drawable.edshareen_post,
        "il y a 1 jour"
)

val artiste6 = Artiste(
        "Davido",
        R.drawable.dadju_profil,
        R.drawable.dadju_post,
        "il y a 2 ans"
)

var listArtiste = mutableListOf(artiste1, artiste2, artiste3, artiste4)
var listeArtiste = mutableListOf(artiste1, artiste2, artiste3, artiste4, artiste5, artiste6)