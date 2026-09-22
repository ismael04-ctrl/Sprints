package com.example.traansportistas.viewmodel

import androidx.lifecycle.ViewModel
import com.example.traansportistas.model.Transporte
import com.example.traansportistas.R

import com.example.traansportistas.model.EstadoEnvio

class TransporteViewModel : ViewModel() {

    val listaTransportes: List<Transporte> = listOf(
        Transporte(
            id = 1,
            origen = "Valencia",
            destino = "Madrid",
            pesoKg = 1200,
            estado = EstadoEnvio.EN_TRANSITO,
            precio = 450.0
        ),
        Transporte(
            id = 2,
            origen = "Barcelona",
            destino = "Sevilla",
            pesoKg = 2500,
            estado = EstadoEnvio.PENDIENTE,
            precio = 890.0
        ),
        Transporte(
            id = 3,
            origen = "Bilbao",
            destino = "Zaragoza",
            pesoKg = 800,
            estado = EstadoEnvio.ENTREGADO,
            precio = 310.0
        ),
        Transporte(
            id = 4,
            origen = "Alicante",
            destino = "Murcia",
            pesoKg = 450,
            estado = EstadoEnvio.PENDIENTE,
            precio = 180.0
        )
    )
}