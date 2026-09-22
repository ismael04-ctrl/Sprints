package com.example.traansportistas.view

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.traansportistas.R
import com.example.traansportistas.model.EstadoEnvio
import com.example.traansportistas.model.Transporte

@Composable
fun TransporteCard(
    modifier: Modifier = Modifier,
    transporte: Transporte
) {
    Card(
        modifier = modifier.fillMaxWidth(),
        elevation = CardDefaults.cardElevation(defaultElevation = 4.dp)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            horizontalArrangement = Arrangement.spacedBy(12.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            // Icono / Imagen del transporte
            Image(
                painter = painterResource(id = R.drawable.ic_launcher_foreground),
                contentDescription = "Icono de transporte",
                modifier = Modifier.size(56.dp)
            )

            Column(
                modifier = Modifier.weight(1f)
            ) {
                Text(
                    text = "${transporte.origen} ➔ ${transporte.destino}",
                    style = MaterialTheme.typography.titleMedium
                )
                Spacer(modifier = Modifier.height(4.dp))
                Row(
                    horizontalArrangement = Arrangement.spacedBy(8.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(
                        text = " ${transporte.pesoKg} kg",
                        style = MaterialTheme.typography.bodySmall
                    )
                    Text(
                        text = "• ${transporte.estado}",
                        style = MaterialTheme.typography.bodySmall,
                        color = MaterialTheme.colorScheme.primary
                    )
                }
            }

            Text(
                text = "${transporte.precio} €",
                style = MaterialTheme.typography.titleLarge
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun TransporteCardPreview() {
    TransporteCard(
        transporte = Transporte(1, "Valencia", "Madrid", 1200, EstadoEnvio.EN_TRANSITO, 450.0)
    )
}