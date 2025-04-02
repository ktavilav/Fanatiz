package com.example.splashfanatiz.ui.screen

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.splashfanatiz.R

@Composable
fun RegisterSocialMediaScreen(navController: NavController) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFF1C1B2C)), // Fondo oscuro
        contentAlignment = Alignment.TopCenter
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .fillMaxSize()
                .padding(horizontal = 24.dp, vertical = 32.dp)
        ) {

            Image(
                painter = painterResource(id = R.drawable.fanatiz_image),
                contentDescription = "Fanatiz Logo",
                modifier = Modifier
                    .height(60.dp)
            )

            Spacer(modifier = Modifier.height(8.dp))

            Text(
                text = "El estadio más grande del mundo",
                color = Color.Gray,
                fontSize = 14.sp,
                textAlign = TextAlign.Center
            )

            Spacer(modifier = Modifier.height(32.dp))

            // Texto de selección
            Text(
                text = "Selecciona una opción para iniciar",
                color = Color.White,
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center
            )

            Spacer(modifier = Modifier.height(24.dp))

            // Botón de Google
            SocialLoginButton(
                text = "Ingresar con Google",
                icon = painterResource(id = R.drawable.google_image),
                backgroundColor = Color.White,
                textColor = Color.Black
            )

            Spacer(modifier = Modifier.height(12.dp))

            // Botón de Apple
            SocialLoginButton(
                text = "Ingresar con Apple",
                icon = painterResource(id = R.drawable.apple_image),
                backgroundColor = Color.White,
                textColor = Color.Black
            )

            Spacer(modifier = Modifier.height(12.dp))

            // Botón de operador
            Button(
                onClick = { /* Acción */ },
                colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF3A3247)), // Color oscuro
                shape = RoundedCornerShape(8.dp),
                modifier = Modifier
                    .fillMaxWidth()
                    .height(50.dp)
            ) {
                Text(text = "Ingresa con tu operador", color = Color.White)
            }

            Spacer(modifier = Modifier.height(12.dp))

            // Botón de email
            Button(
                onClick = { navController.navigate("login_screen") }, // Navega a RegisterScreen
                colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFD90F0C)),
                shape = RoundedCornerShape(8.dp),
                modifier = Modifier
                    .fillMaxWidth()
                    .height(50.dp)
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.email_image),
                    contentDescription = "Email Icon",
                    tint = Color.White,
                    modifier = Modifier.size(20.dp)
                )
                Spacer(modifier = Modifier.width(8.dp))
                Text(text = "Ingresar con email", color = Color.White)
            }

            Spacer(modifier = Modifier.height(24.dp))

            Text(
                text = "¿No estás registrado?",
                color = Color.White,
                fontSize = 14.sp
            )

            Spacer(modifier = Modifier.height(8.dp))

            // Botón de registro
            OutlinedButton(
                onClick = { /* Acción */ },
                colors = ButtonDefaults.outlinedButtonColors(contentColor = Color.White),
                border = BorderStroke(1.dp, Color(0xFFD90F0C)),
                shape = RoundedCornerShape(8.dp),
                modifier = Modifier
                    .fillMaxWidth()
                    .height(50.dp)
            ) {
                Text(text = "Regístrate", color = Color(0xFFD90F0C))
            }
        }
    }
}

@Composable
fun SocialLoginButton(text: String, icon: Painter, backgroundColor: Color, textColor: Color) {
    Button(
        onClick = { /* Acción */ },
        colors = ButtonDefaults.buttonColors(containerColor = backgroundColor),
        shape = RoundedCornerShape(8.dp),
        modifier = Modifier
            .fillMaxWidth()
            .height(50.dp)
    ) {
        Icon(
            painter = icon,
            contentDescription = "Social Icon",
            tint = Color.Unspecified,
            modifier = Modifier.size(20.dp)
        )
        Spacer(modifier = Modifier.width(8.dp))
        Text(text = text, color = textColor)
    }
}
