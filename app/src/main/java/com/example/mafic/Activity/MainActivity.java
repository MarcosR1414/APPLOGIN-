package com.example.mafic.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.example.mafic.R;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class MainActivity extends AppCompatActivity {

    private EditText emailEditText, passwordEditText;
    private Button loginButton;
    private FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Inicializar Firebase Authentication
        mAuth = FirebaseAuth.getInstance();

        emailEditText = findViewById(R.id.email_edit_text);
        passwordEditText = findViewById(R.id.password_edit_text);
        loginButton = findViewById(R.id.loginButton);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = emailEditText.getText().toString().trim();
                String password = passwordEditText.getText().toString().trim();

                // Verificar que se hayan proporcionado datos de inicio de sesión válidos
                if (email.isEmpty() || password.isEmpty()) {
                    Toast.makeText(MainActivity.this, "Por favor ingresa email y contraseña", Toast.LENGTH_SHORT).show();
                    return;
                }

                // Autenticar al usuario con Firebase Authentication
                mAuth.signInWithEmailAndPassword(email, password)
                        .addOnCompleteListener(MainActivity.this, new OnCompleteListener<AuthResult>() {
                            @Override
                            public void onComplete(@NonNull Task<AuthResult> task) {
                                if (task.isSuccessful()) {
                                    // Inicio de sesión exitoso, redirigir a la siguiente actividad
                                    FirebaseUser user = mAuth.getCurrentUser();
                                    if (user != null) {
                                        Toast.makeText(MainActivity.this, "Inicio de sesión exitoso", Toast.LENGTH_SHORT).show();
                                        // Ejemplo: Redirigir a otra actividad
                                        Intent intent = new Intent(MainActivity.this, Delive1.class);
                                        startActivity(intent);
                                        finish(); // Finalizar la actividad actual
                                    }
                                } else {
                                    // Si el inicio de sesión falla, mostrar un mensaje de error
                                    Toast.makeText(MainActivity.this, "Inicio de sesión fallido. Verifica tus credenciales.", Toast.LENGTH_SHORT).show();
                                }
                            }
                        });
            }
        });
    }
}
