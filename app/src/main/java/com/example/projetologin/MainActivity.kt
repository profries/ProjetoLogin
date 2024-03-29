package com.example.projetologin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.EditText
import android.widget.Toast
import com.example.projetologin.model.Usuario

class MainActivity : AppCompatActivity() {

    var listaUsuarios = ArrayList<Usuario>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        iniciaListaUsuarios()

        setContentView(R.layout.activity_main)
    }

    private fun iniciaListaUsuarios() {
        listaUsuarios.add(Usuario("usuario1","senha1"))
        listaUsuarios.add(Usuario("usuario2","senha2"))
        listaUsuarios.add(Usuario("usuario3","senha3"))
    }

    fun realizaLogin(view: View) {

        var textoNome = findViewById(R.id.editNome) as EditText
        //var textoSenha = findViewById<EditText>(R.id.editSenha)
        var textoSenha: EditText = findViewById(R.id.editSenha)

        val nomeString = textoNome.text.toString()
        val senhaString = textoSenha.text.toString()

        Log.i("Campo Nome", nomeString)
        Log.i("Campo Senha",senhaString)

        if(listaUsuarios.contains(Usuario(nomeString,senhaString))){
            Toast.makeText(this,
                this.getString(R.string.msg_ok_login), Toast.LENGTH_SHORT).show()
        }
        else{
            Toast.makeText(this,
                this.getString(R.string.msg_error_login), Toast.LENGTH_SHORT).show()
        }

        textoSenha.setText("")


    }


}
