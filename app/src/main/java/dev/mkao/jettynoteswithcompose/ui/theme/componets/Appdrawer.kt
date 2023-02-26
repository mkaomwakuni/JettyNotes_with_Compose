package dev.mkao.jettynoteswithcompose.ui.theme.componets

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Switch
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import dev.mkao.jettynoteswithcompose.ui.theme.JettyNotesThemeSetting
import dev.mkao.jettynoteswithcompose.ui.theme.JettyNotesWithComposeTheme

@Composable
private fun AppDrawer() {
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
    val imageAlpha = if (isSelected) {
        2f
    } else {
     0.8f
    }
    //colors fpr the text for the states selected and unselected
    val textColor = if (isSelected) {
        colors.primary
    }
    else {
        colors.onSurface.copy(alpha = 0.8f)
    }
    //color for the states if button is un/selected
    val backgroundColor = if (isSelected){
        colors.primary.copy(alpha = 0.14f)
    }else {
        colors.surface
    }

    Surface(//1) {
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 8.dp, end = 8.dp, top = 8.dp),
        color = backgroundColor,
        shape = MaterialTheme.shapes.small){
        Row(horizontalArrangement = Arrangement.Start,
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .clickable(onClick = onClick)
            .fillMaxWidth()
            .padding(6.dp)
        ) {
            Image(imageVector = icon,
                contentDescription = "Navigation Button",
            colorFilter = ColorFilter.tint(textColor),
            alpha = imageAlpha)
            Spacer(Modifier.width(18.dp))
            Text(text = label,
            style = MaterialTheme.typography.bodyMedium,
            color = textColor,
            modifier = Modifier.fillMaxWidth())
        }
   }

}
@Composable
private fun LightDarkItem() {
    Row(Modifier
        .padding(8.dp)
    ) {
       Text(text = "Switch Dark Mode",
       style = MaterialTheme.typography.bodyMedium,
       color = MaterialTheme.colorScheme.onSurface.copy(alpha = 0.8f),
       modifier = Modifier
           .weight(2f)
           .padding(start = 8.dp, top = 8.dp, bottom = 8.dp)
           .align(alignment = Alignment.CenterVertically)
       )
        Switch(checked = JettyNotesThemeSetting.isDarkModeEnabled, onCheckedChange = {
            JettyNotesThemeSetting.isDarkModeEnabled = it
        },
        modifier = Modifier
            .padding(start = 8.dp, end = 8.dp)
            .align(alignment = Alignment.CenterVertically))
    }
}

    @Preview
@Composable
fun AppDrawerPreview(){
    JettyNotesWithComposeTheme {
        AppDrawer()
        
    }
}
@Composable
@Preview
fun ScreenNavigationButtonPreview(){
    JettyNotesWithComposeTheme {
        ScreenNavigationButton(icon = Icons.Filled.Home, label = "Jetty Notes" , isSelected = true,
        onClick = { })
    }
}
@Preview
@Composable
fun LightDarkItemPreview(){
    JettyNotesWithComposeTheme {
        LightDarkItem()

    }
}