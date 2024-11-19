package com.munozcastrovirginia.examenEJ3.ui.primerscreen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun PrimerScreen(navigateToPantalla2: () -> Unit) {

    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
    ) {
        Text("Primera Pantalla")
        Spacer(modifier = Modifier.height(16.dp))
        Button(
            onClick = {navigateToPantalla2()}
        ) {
            Text("Ir a la pantalla 2")
        }
    }

}