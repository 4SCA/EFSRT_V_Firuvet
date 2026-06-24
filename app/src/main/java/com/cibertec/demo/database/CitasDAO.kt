package com.cibertec.demo.database

import android.content.ContentValues
import android.content.Context
import com.cibertec.demo.entity.Cita

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

    fun listar(): MutableList<Cita> {

        val lista = mutableListOf<Cita>()

        val db = dbHelper.readableDatabase

        val cursor = db.rawQuery(
            "SELECT * FROM citas",
            null
        )

        if (cursor.moveToFirst()) {
            do {
                lista.add(
                    Cita(
                        idUsuario = cursor.getInt(
                            cursor.getColumnIndexOrThrow("idUsuario")
                        ),
                        mascota = cursor.getString(
                            cursor.getColumnIndexOrThrow("mascota")
                        ),
                        lugar = cursor.getString(
                            cursor.getColumnIndexOrThrow("lugar")
                        ),
                        fecha = cursor.getString(
                            cursor.getColumnIndexOrThrow("fecha")
                        ),
                        hora = cursor.getString(
                            cursor.getColumnIndexOrThrow("hora")
                        ),
                        motivo = cursor.getString(
                            cursor.getColumnIndexOrThrow("motivo")
                        ),
                        comentario = cursor.getString(
                            cursor.getColumnIndexOrThrow("comentario")
                        )
                    )
                )
            } while (cursor.moveToNext())
        }

        cursor.close()
        db.close()

        return lista
    }
}