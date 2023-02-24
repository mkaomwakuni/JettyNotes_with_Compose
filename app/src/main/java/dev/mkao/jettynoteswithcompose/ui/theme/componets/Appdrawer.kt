package dev.mkao.jettynoteswithcompose.ui.theme.componets

import android.graphics.drawable.Icon
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
import androidx.compose.ui.graphics.vector.ImageVector
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
        )
    }
}
@Composable
private  fun ScreenNavigationButton(
    icon: ImageVector,
    label : String,
    isSelected : Boolean,
    onClick:() -> Unit
){
    val colors = MaterialTheme.colorScheme

    //for different states of btn if selected or unselected
    val ImageAlpha = if (isSelected) {
        2f
    } else {
     0.8f
    }
    //colors fpr the text for the states selected and unselected
    val textcolor = if (isSelected) {
        colors.primary
    }
    else {
        colors.onSurface.copy(alpha = 0.8f)
    }
    //color for the states if button is un/selected
    val backgroundcolor = if (isSelected){
        colors.primary.copy(alpha = 0.14f)
    }else {
        colors.surface
    }
}
@Preview
@Composable
fun AppdrawerPreview(){
    JettyNotesWithComposeTheme {
        Appdrawer()
        
    }
}