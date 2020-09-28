package com.example.somacompose

import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import java.security.InvalidParameterException

enum class Page { Accueil, Bienvenue, Connexion, Inscription }

fun Fragment.naviguer(de: Page, a: Page) {
    if(de == a) {
        throw InvalidParameterException("Impossible de naviguer à $de")
    }

    when(de){
        Page.Accueil -> { findNavController().navigate(R.id.fragment_accueil) }
        Page.Bienvenue -> { findNavController().navigate(R.id.fragment_bienvenue) }
        Page.Connexion -> { findNavController().navigate(R.id.fragment_connexion) }
        Page.Inscription -> { findNavController().navigate(R.id.fragment_inscription) }
    }
}