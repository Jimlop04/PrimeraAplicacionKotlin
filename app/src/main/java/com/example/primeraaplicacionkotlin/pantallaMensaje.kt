package com.example.primeraaplicacionkotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class pantallaMensaje : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pantalla_mensaje)

        val txt_nombre = findViewById<TextView>(R.id.txtmostrar_nombre);
        val txt_genero = findViewById<TextView>(R.id.txtmostrar_genero);
        val txt_fdn = findViewById<TextView>(R.id.txtmostrar_fdn);
        val txt_celular = findViewById<TextView>(R.id.txtmostrar_celular);

        val bundle = this.getIntent().getExtras();

        txt_nombre.setText(bundle?.getString("Nombre"));
        txt_genero.setText(bundle?.getString("Género"));
        txt_fdn.setText(bundle?.getString("fdn"));
        txt_celular.setText(bundle?.getString("Celular"));

    }

    fun regresarPrincipal (view: View){
        onBackPressed();

    }


}