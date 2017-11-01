package com.example.ma.loginscreen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class Suruta extends AppCompatActivity {
TextView mensaje;

    final static String usuario="UsuarioActivo";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_suruta);


        Intent intent = getIntent();
        Bundle mibundle = intent.getExtras();


        mensaje = (TextView) findViewById(R.id.mensaje);


      mensaje.setText("El usuario es: " + mibundle.getString(usuario) + " y sigue la aplicacion") ;



    }
}
