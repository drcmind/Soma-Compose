package com.example.somacompose

import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.Text
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.setContent
import androidx.compose.ui.res.imageResource
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import androidx.ui.tooling.preview.Preview
import com.example.somacompose.data.artiste1
import com.example.somacompose.data.artiste2
import com.example.somacompose.data.artiste5
import com.example.somacompose.partie01.*
import com.example.somacompose.partie02.ScaffoldComposable
import com.example.somacompose.ui.SomaComposeTheme
import com.google.android.material.navigation.NavigationView

class MainActivity : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val navView : NavigationView = findViewById(R.id.nav_view)
        val navControler = findNavController(R.id.nav_host_fragment)
        navView.setupWithNavController(navControler)
    }
}
