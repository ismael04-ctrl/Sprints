package com.example.traansportistas

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import com.example.traansportistas.model.EstadoEnvio
import com.example.traansportistas.model.Transporte
import com.example.traansportistas.ui.theme.TraansportistasTheme
import com.example.traansportistas.view.MainScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            TraansportistasTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    val listaPortes = listOf(
                        Transporte(1, "Valencia", "Madrid", 1200, EstadoEnvio.EN_TRANSITO, 450.0),
                        Transporte(2, "Barcelona", "Sevilla", 2500, EstadoEnvio.PENDIENTE, 890.0),
                        Transporte(3, "Bilbao", "Zaragoza", 800, EstadoEnvio.ENTREGADO, 310.0),
                        Transporte(4, "Alicante", "Murcia", 450, EstadoEnvio.PENDIENTE, 180.0),
                        Transporte(id = 5, origen = "Alicante", destino = "Murcia",pesoKg = 450, estado = EstadoEnvio.ENTREGADO,precio = 300.0),
                        Transporte(id = 6,origen = "Alicante",destino = "Murcia",pesoKg = 603,estado = EstadoEnvio.EN_TRANSITO,precio = 800.0
                        )
                    )

                    MainScreen(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(innerPadding),
                        transportes = listaPortes
                    )
                }
            }
        }
    }
}