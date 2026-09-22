package com.example.traansportistas.model

object EstadoEnvio {
    const val PENDIENTE = "Pendiente"
    const val EN_TRANSITO = "En tránsito"
    const val ENTREGADO = "Entregado"
}

data class Transporte(
    val id: Int,
    val origen: String,
    val destino: String,
    val pesoKg: Int,
    val estado: String,
    val precio: Double
)