package com.example.mafic.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import com.example.mafic.R;

public class Registro extends AppCompatActivity {
    TextView tv_Iniciar_sesion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_registro);

        tv_Iniciar_sesion =findViewById(R.id.tv_Iniciar_sesion);
        tv_Iniciar_sesion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentReg = new Intent(Registro.this,MainActivity.class);
                Registro.this.startActivity(intentReg);
            }
        });



    }
}