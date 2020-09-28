package com.example.somacompose.partie03.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.FrameLayout
import androidx.compose.runtime.Recomposer
import androidx.compose.ui.platform.setContent
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.example.somacompose.Page
import com.example.somacompose.R
import com.example.somacompose.naviguer
import com.example.somacompose.partie03.Interfaces.connexionInscription.EvenementConexion
import com.example.somacompose.partie03.Interfaces.connexionInscription.InterfaceConnexion
import com.example.somacompose.partie03.viewModels.ViewModelConnexion
import com.example.somacompose.ui.SomaComposeTheme

class FragmentConnexion : Fragment() {
    private val viewModel : ViewModelConnexion by viewModels()

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        viewModel.navigateTo.observe(viewLifecycleOwner) { navigateToEvent ->
            navigateToEvent.obtenirDuContenuNonTraitE()?.let { navigateTo ->
                naviguer(navigateTo, Page.Connexion)
            }
        }
        return FrameLayout(requireContext()).apply {

            id = R.id.fragment_connexion

            layoutParams = ViewGroup.LayoutParams(
                    ViewGroup.LayoutParams.MATCH_PARENT,
                    ViewGroup.LayoutParams.MATCH_PARENT
            )

            setContent(Recomposer.current()) {
                SomaComposeTheme {
                    InterfaceConnexion(
                            onEvent = { evenement ->
                                when(evenement) {
                                    is EvenementConexion.Accueil -> {
                                        viewModel.accueil()
                                    }
                                    EvenementConexion.Inscription -> {
                                        viewModel.inscription()
                                    }
                                    EvenementConexion.NavigationBack -> {
                                        activity?.onBackPressedDispatcher?.onBackPressed()
                                    }
                                }
                            }
                    )
                }
            }
        }
    }
}