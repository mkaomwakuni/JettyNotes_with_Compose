package dev.mkao.jettynoteswithcompose.ui.theme.componets

import android.annotation.SuppressLint
import android.inputmethodservice.Keyboard
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Checkbox
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


    @SuppressLint("NotConstructor")
    @Composable
    fun Note() {
        val backgroundShape: Shape = RoundedCornerShape( 4.dp)
        Row( modifier = Modifier.fillMaxWidth()
            .padding(8.dp)
            .shadow(1.dp,backgroundShape)
            .background(Color.White,backgroundShape)
            .heightIn(min = 64.dp)){

         Box(modifier = Modifier
             .size(40.dp)
             .background(Color.Green)
                 )
            //Centering Text & Checkbox composable
         Column(modifier = Modifier
             .weight(1f)
             .align(Alignment.CenterVertically) ){
             Text(text = "Title", maxLines = 1)
             Text(text = "Description", maxLines = 1)
         }
             Checkbox(
                 checked = false,
             onCheckedChange = { },
             modifier = Modifier
                 .padding(start = 8.dp)
                 .align(Alignment.CenterVertically)
             )
         }
    }

    @Preview
    @Composable
    private fun NotePreview() {
        Note()
    }
