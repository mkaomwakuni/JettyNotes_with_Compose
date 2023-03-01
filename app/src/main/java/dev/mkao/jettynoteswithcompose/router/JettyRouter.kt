package dev.mkao.jettynoteswithcompose.router

import androidx.compose.runtime.MutableState
import androidx.compose.ui.graphics.BlendMode.Companion.Screen
sealed class  Screen {
    object  Notes : Screen()
    object  DeleteNote : Screen()
    object  Trash:Screen()
}

object JettyRouter  {
/**
 * Allows you to change the screen in the
 * Also keeps track of the current screen.
 *
 **/
  var currentScreen : Screen by MutableState(Screen.Notes)
  fun navigateTo(destination: Screen){
   /**The navigateTo function is a method of the JetNotesRouter object
    * and it takes a destination parameter of type Screen
    * which represents the screen that the user wants to navigate to
    **/
    currentScreen = Screen
  }
 }