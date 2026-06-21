package com.cibertec.demo.database

import android.content.ContentValues
import android.content.Context

class UsuarioDAO(context: Context) {

    private val dbHelper =
        DatabaseHelper(context)

    fun registrar(
        nick: String,
        correo: String,
        clave: String
    ): Long {

        val db =
            dbHelper.writableDatabase

        val values =
            ContentValues()

        values.put(
            "nickUsuario",
            nick
        )

        values.put(
            "correo",
            correo
        )

        values.put(
            "clave",
            clave
        )

        return db.insert(
            "usuarios",
            null,
            values
        )
    }
}