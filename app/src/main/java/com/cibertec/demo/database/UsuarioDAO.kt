package com.cibertec.demo.database

import com.cibertec.demo.database.UsuarioDAO
import android.content.ContentValues
import android.content.Context

class UsuarioDAO(context: Context) {

    private val dbHelper = DatabaseHelper(context)

    fun registrar(
        nick: String,
        correo: String,
        clave: String
    ): Long {

        val db = dbHelper.writableDatabase

        val values = ContentValues()

        values.put("nickUsuario", nick)
        values.put("correo", correo)
        values.put("clave", clave)

        return db.insert(
            "usuarios",
            null,
            values
        )
    }

    fun validarLogin(
        nick: String,
        clave: String
    ): Boolean {

        val db = dbHelper.readableDatabase

        val cursor = db.rawQuery(
            "SELECT * FROM usuarios WHERE nickUsuario = ? AND clave = ?",
            arrayOf(nick, clave)
        )

        val existe = cursor.moveToFirst()

        cursor.close()
        db.close()

        return existe
    }
}

    
