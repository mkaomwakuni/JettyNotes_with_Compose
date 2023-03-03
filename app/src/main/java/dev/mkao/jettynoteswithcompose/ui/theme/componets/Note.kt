package dev.mkao.jettynoteswithcompose.ui.theme.componets

import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Checkbox
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import dev.mkao.jettynoteswithcompose.ui.theme.rwGreen


@SuppressLint("NotConstructor")
    @Composable
    fun Note() {
        val backgroundShape: Shape = RoundedCornerShape( 4.dp)
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp)
                .shadow(1.dp, backgroundShape)
                .background(Color.White, backgroundShape)
                .heightIn(min = 64.dp)
          )
        {

            NoteColor(
                //Applying some padding
                modifier = Modifier
                    .align(Alignment.CenterVertically)
                    .padding(start = 16.dp, end = 16.dp),
                color = rwGreen,
                size = 40.dp,
                border = 1.dp )

            //Centering Text & Checkbox composable
         Column(modifier = Modifier
             .weight(1f)
             .align(Alignment.CenterVertically)
         ){
             Text(
                 text = "Title",
                 color = Color.Black,
                 maxLines = 1,
                 style = TextStyle(
                     fontWeight = FontWeight.Normal,
                     fontSize = 16.sp,
                     letterSpacing = 0.15.sp
              )
             )
             Text(
                 text = "Description",
                 color = Color.Black.copy(alpha = 0.75f),
                 maxLines = 1,
                 style = TextStyle(
                     fontWeight = FontWeight.Normal,
                     fontSize = 14.sp,
                     letterSpacing = 0.25.sp)
             )
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
