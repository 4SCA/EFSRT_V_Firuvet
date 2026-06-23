package com.cibertec.demo.database

import android.content.ContentValues
import android.content.Context

class CitaDAO(context: Context) {

    private val dbHelper = DatabaseHelper(context)

    fun registrar(
        fecha: String,
        hora: String,
        lugar: String,
        estado: String
    ): Long {

        val db = dbHelper.writableDatabase

        val values = ContentValues()
        values.put("fecha", fecha)
        values.put("hora", hora)
        values.put("lugar", lugar)
        values.put("estado", estado)

        return db.insert(
            "citas",
            null,
            values
        )
    }
}