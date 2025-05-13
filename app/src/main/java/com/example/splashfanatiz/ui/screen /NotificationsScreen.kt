package com.example.splashfanatiz.ui.screen

import android.util.Log
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Switch
import androidx.compose.material3.SwitchDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun NotificationsScreen() {
    val notificacionesIniciales = listOf(
        "Gol" to true,
        "Inicio de partido" to true,
        "Fin de partido" to true,
        "Tarjeta amarilla" to false,
        "Tarjeta roja" to false,
        "Def. de penal" to false
    )

    var notificaciones by remember { mutableStateOf(notificacionesIniciales) }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFF1C1C3A)) // Fondo oscuro azulado
            .padding(16.dp)
    ) {
        Text(
            text = "Notificaciones push",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            color = Color.White
        )
        Spacer(modifier = Modifier.height(16.dp))
        Card(
            shape = RoundedCornerShape(12.dp),
            colors = CardDefaults.cardColors(
                containerColor = Color(0xFF2B2B5C)
            ),
            modifier = Modifier.fillMaxWidth()
        ) {
            Column(modifier = Modifier.padding(16.dp)) {
                Text(
                    text = "Notificaciones",
                    color = Color.White,
                    fontWeight = FontWeight.Bold,
                    fontSize = 16.sp
                )
                Spacer(modifier = Modifier.height(8.dp))
                notificaciones.forEachIndexed { index, (label, estadoInicial) ->
                    var isChecked by remember { mutableStateOf(estadoInicial) }
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(vertical = 8.dp),
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        Text(
                            text = label,
                            color = Color.White,
                            fontSize = 14.sp
                        )
                        Switch(
                            checked = isChecked,
                            onCheckedChange = { nuevoEstado ->
                                isChecked = nuevoEstado
                                Log.d("NotificacionesScreen", "La notificación '$label' ahora está '${if (nuevoEstado) "activada" else "desactivada"}'")

                                notificaciones = notificaciones.mapIndexed { i, (l, _) ->
                                    if (i == index) l to nuevoEstado else l to nuevoEstado
                                }
                            },
                            colors = SwitchDefaults.colors(
                                checkedThumbColor = Color.White,
                                checkedTrackColor = Color(0xFF4CAF50), // Verde
                                uncheckedThumbColor = Color.LightGray,
                                uncheckedTrackColor = Color.DarkGray
                            )
                        )
                    }
                }
            }
        }
    }
}