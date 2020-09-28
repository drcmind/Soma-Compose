package com.example.somacompose.partie02

import androidx.compose.foundation.Icon
import androidx.compose.foundation.Image
import androidx.compose.foundation.Text
import androidx.compose.foundation.layout.*
import androidx.compose.material.Divider
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.twotone.Email
import androidx.compose.material.icons.twotone.ExitToApp
import androidx.compose.material.icons.twotone.Person
import androidx.compose.material.icons.twotone.Settings
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.unit.dp
import com.example.somacompose.R

@Composable
fun DrawerComposable(){
    Column {
        val imageHead = R.drawable.image_compose
        Image(
                asset = imageResource(id = imageHead),
                modifier = Modifier
                        .preferredHeight(200.dp)
                        .fillMaxWidth(),
                contentScale = ContentScale.Crop
        )
        Spacer(modifier= Modifier.size(4.dp))
        Divider(thickness = 1.dp, color = Color.Gray)
        Spacer(modifier= Modifier.size(4.dp))
        Row(verticalGravity = Alignment.CenterVertically) {
            Icon(Icons.TwoTone.Person)
            Spacer(modifier= Modifier.size(8.dp))
            Text(text = "Contact")
        }
        Spacer(modifier= Modifier.size(8.dp))
        Row(verticalGravity = Alignment.CenterVertically) {
            Icon(Icons.TwoTone.Settings)
            Spacer(modifier= Modifier.size(8.dp))
            Text(text = "Paramètre")
        }
        Spacer(modifier= Modifier.size(8.dp))
        Row(verticalGravity = Alignment.CenterVertically) {
            Icon(Icons.TwoTone.Email)
            Spacer(modifier= Modifier.size(8.dp))
            Text(text = "Commentaire")
        }
        Spacer(modifier= Modifier.size(8.dp))
        Row(verticalGravity = Alignment.CenterVertically) {
            Icon(Icons.TwoTone.ExitToApp)
            Spacer(modifier= Modifier.size(8.dp))
            Text(text = "Déconnexion")
        }
    }
}