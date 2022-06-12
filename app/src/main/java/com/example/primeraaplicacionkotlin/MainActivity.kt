package com.example.primeraaplicacionkotlin

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


public class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    fun Enviarmensaje (view: View){


        val intent = Intent(this@MainActivity, pantallaMensaje::class.java)


        val txt_nombre = findViewById<EditText>(R.id.text_nombre);
        val rb_generoM = findViewById<RadioButton>(R.id.rb_generoM);
        val rb_generoF = findViewById<RadioButton>(R.id.rb_generoF);
        val fdn = findViewById<EditText>(R.id.text_fdn);
        val txt_celular = findViewById<EditText>(R.id.text_celular);

        val b = Bundle();
        b.putString("Nombre", txt_nombre.getText().toString());
        b.putString("fdn", fdn.getText().toString());
        if(rb_generoM.isChecked()==true or rb_generoM.isChecked()==true ) {

            if(rb_generoM.isChecked()==true) {
            b.putString("Género", rb_generoM.getText().toString());
            }
        else {
        b.putString("Género", rb_generoF.getText().toString()); }
        } else {
            val text = "Selecciona un Género"
            val duration = Toast.LENGTH_SHORT
            val toast = Toast.makeText(applicationContext, text, duration)
            toast.show()

        }

        b.putString("Celular", txt_celular.getText().toString());
        intent.putExtras(b);
        startActivity(intent);
    }
}