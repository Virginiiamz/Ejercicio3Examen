package com.munozcastrovirginia.examenEJ3.ui.segundoscreen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun SegundaScreen(navigateToPantalla1: () -> Unit) {

    var mensaje by remember { mutableStateOf("") }

    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top,
    ) {
        Text("Segunda pantalla")
        Spacer(modifier = Modifier.height(16.dp))
        Button(
            onClick = {navigateToPantalla1() }
        ) {
            Text("Ir a la pantalla 1")
        }
        Spacer(modifier = Modifier.height(16.dp))
        Column {
            TextField(
                value = mensaje,
                onValueChange = { mensaje = it },
                label = { Text("Introduce un mensaje:") }
            )
            Button(
                onClick = {}
            ) {
                Text("Ir a la pantalla 3")
            }
        }

    }
}