package com.example.somacompose.partie03.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.FrameLayout
import androidx.compose.runtime.Recomposer
import androidx.compose.ui.platform.setContent
import androidx.fragment.app.Fragment
import com.example.somacompose.R
import com.example.somacompose.partie03.Interfaces.accueil.InterfaceAccueil
import com.example.somacompose.ui.SomaComposeTheme

class FragmentAccueil : Fragment(){
    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        return FrameLayout(requireContext()).apply {
            id = R.id.fragment_accueil

            layoutParams = ViewGroup.LayoutParams(
                    ViewGroup.LayoutParams.MATCH_PARENT,
                    ViewGroup.LayoutParams.MATCH_PARENT
            )

            setContent(Recomposer.current()){
                SomaComposeTheme {
                    InterfaceAccueil()
                }
            }
        }
    }
}