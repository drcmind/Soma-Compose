package com.example.somacompose.partie03.utilitaire

/*
* Utiliser comme une enveloppe pour les donées qui répresentent un événement dans le LiveData*/

data class Evenement<out T> (private val contenu: T){
    var estTraitE = false
        private set // Autoriser la lecture externe mais pas l'écriture

    /*Renvoie le contenu et empeche son utilisation à nouveau*/

    fun obtenirDuContenuNonTraitE(): T? {
        return if (estTraitE) {
            null
        } else {
            estTraitE = true
            contenu
        }
    }
}