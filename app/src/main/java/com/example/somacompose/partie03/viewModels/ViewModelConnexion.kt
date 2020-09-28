package com.example.somacompose.partie03.viewModels

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.somacompose.Page
import com.example.somacompose.Page.Accueil
import com.example.somacompose.Page.Inscription
import com.example.somacompose.partie03.utilitaire.Evenement

class ViewModelConnexion : ViewModel() {
    private val _navigateTo = MutableLiveData<Evenement<Page>>()
    val navigateTo: LiveData<Evenement<Page>> = _navigateTo

    fun accueil() {
        _navigateTo.value = Evenement(Accueil)
    }

    fun inscription() {
        _navigateTo.value = Evenement(Inscription)
    }
}