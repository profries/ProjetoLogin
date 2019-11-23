package com.example.projetologin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun realizaLogin(view: View) {

        var textoNome = findViewById(R.id.editNome) as EditText
        var textoSenha = findViewById<EditText>(R.id.editSenha)


        Toast.makeText(this,"Login realizado com sucesso!", Toast.LENGTH_SHORT).show()
        Log.i("Campo Nome",textoNome.text.toString())
        Log.i("Campo Senha",textoSenha.text.toString())

    }


}
