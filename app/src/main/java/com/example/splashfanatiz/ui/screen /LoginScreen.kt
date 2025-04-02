package com.example.splashfanatiz.ui.screen
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LoginScreen()
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LoginScreen() {
    var email by remember { mutableStateOf(TextFieldValue("")) }
    var password by remember { mutableStateOf(TextFieldValue("")) }
    var passwordVisible by remember { mutableStateOf(false) }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Black)
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Spacer(modifier = Modifier.height(80.dp))

        Text(
            text = "Fanatiz",
            color = Color(0xFFFF3D00),
            fontSize = 32.sp,
            fontWeight = FontWeight.Bold
        )

        Text(
            text = "El estadio más grande del mundo",
            color = Color.Gray,
            fontSize = 14.sp,
            textAlign = TextAlign.Center
        )

        Spacer(modifier = Modifier.height(50.dp))

        Text(
            text = "Acceso",
            color = Color.White,
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold
        )

        Spacer(modifier = Modifier.height(20.dp))

        TextField(
            value = email,
            onValueChange = { email = it },
            label = { Text("Correo Electrónico", color = Color.White) },
            modifier = Modifier.fillMaxWidth(),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email),
            colors = TextFieldDefaults.textFieldColors(
                containerColor = Color.White,
                errorPrefixColor = Color.Transparent,
                focusedIndicatorColor = Color.Red,
                unfocusedIndicatorColor = Color.Gray
            )
        )

        Spacer(modifier = Modifier.height(10.dp))

        TextField(
            value = password,
            onValueChange = { password = it },
            label = { Text("Contraseña", color = Color.White) },
            modifier = Modifier.fillMaxWidth(),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
            visualTransformation = if (passwordVisible) VisualTransformation.None else PasswordVisualTransformation(),
            colors = TextFieldDefaults.textFieldColors(
                containerColor = Color.White,
                errorPrefixColor = Color.Transparent,
                focusedIndicatorColor = Color.Red,
                unfocusedIndicatorColor = Color.Gray
            )
        )

        Spacer(modifier = Modifier.height(20.dp))

        Button(
            onClick = { /* Implement login logic */ },
            colors = ButtonDefaults.buttonColors(containerColor = Color.Red),
            modifier = Modifier.fillMaxWidth()
        ) {
            Text("Ingresar →", color = Color.White, fontSize = 16.sp)
        }

        Spacer(modifier = Modifier.height(15.dp))

        TextButton(onClick = { /* Implement password recovery */ }) {
            Text("Recuperar mi contraseña", color = Color.Gray, fontSize = 14.sp)
        }
    }
}
