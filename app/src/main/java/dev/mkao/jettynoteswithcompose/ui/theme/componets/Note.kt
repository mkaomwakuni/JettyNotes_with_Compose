package dev.mkao.jettynoteswithcompose.ui.theme.componets

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Checkbox
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

class Note {

    @Composable
    fun Note() {
        Box(
            modifier = Modifier
                .size(45.dp)
                .background(NGreen)
        )
        Text(text = "Title ", maxLines = 1)
        Text(text = "Body", maxLines = 2)
        Checkbox(
            checked = false, onCheckedChange = {},
            modifier = Modifier.padding(start = 8.dp)
        )
    }

    @Preview
    @Composable
    private fun NotePreview() {
        Note()
    }
}
