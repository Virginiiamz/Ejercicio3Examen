package com.munozcastrovirginia.examenEJ3.ui.navegacion

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.munozcastrovirginia.examenEJ3.ui.primerscreen.PrimerScreen
import com.munozcastrovirginia.examenEJ3.ui.segundoscreen.SegundaScreen

@Composable
fun Navegacion() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = PrimeraPantalla) {
        // Aquí se definen las rutas de navegación
        composable<PrimeraPantalla> {
            PrimerScreen {
                navController.navigate(SegundaPantalla)
            }
        }

        composable<SegundaPantalla> {
            SegundaScreen {
                navController.popBackStack()
            }
        }

        composable<TerceraPantalla> {


            Text("Has navegado a la tercera pantalla")
        }
    }
}
