package org.basic.project.bottomBar

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.VectorPainter
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.compose.ui.unit.sp
import cafe.adriel.voyager.navigator.tab.Tab
import cafe.adriel.voyager.navigator.tab.TabOptions

object HomeTabScreen : Tab { //Tab es la dependencia tab-navigator
    override val options: TabOptions

        @Composable
        get(){ //Getter de options

            val icon : VectorPainter = rememberVectorPainter(Icons.Default.Home)

            return remember {
                TabOptions(
                    index = 0u,
                    title = "Home",
                    icon = icon

                )
            }
        }

    @Composable //Determina que algo es mostrable en la pantalla
    override fun Content() {
        Box(
            modifier = Modifier.fillMaxSize().background(Color.Red),
            contentAlignment = Alignment.Center
        ){
            Text(
                text = "Home Screen",
                fontSize = 30.sp,
                color = Color.White
            )
        }
    }


}