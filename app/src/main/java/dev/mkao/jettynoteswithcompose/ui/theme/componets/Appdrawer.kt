package dev.mkao.jettynoteswithcompose.ui.theme.componets

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import dev.mkao.jettynoteswithcompose.ui.theme.JettyNotesWithComposeTheme

@Composable
private fun Appdrawer() {
    Row(modifier = Modifier.fillMaxWidth()){
        Image(imageVector = Icons.Filled.Menu , contentDescription ="Drawer Header Icon Menu",
        colorFilter = ColorFilter.tint(MaterialTheme.colorScheme.onSurface),
            modifier =  Modifier.padding(16.dp)
        )
        Text(text = "JettyNotes",
        modifier = Modifier
            .align(alignment = Alignment.CenterVertically)
    }
}
@Preview
@Composable
fun AppdrawerPreview(){
    JettyNotesWithComposeTheme {
        Appdrawer()
        
    }
}