package com.cibertec.demo.database

import android.content.ContentValues
import android.content.Context
import android.database.Cursor
import com.cibertec.demo.entity.Mascota

class MascotaDAO(context: Context) {

    private val dbHelper = DatabaseHelper(context)

    fun registrar(mascota: Mascota): Long {

        val db = dbHelper.writableDatabase

        val valores = ContentValues().apply {
            put("nombre", mascota.nombre)
            put("especie", mascota.especie)
            put("genero", mascota.genero)
            put("raza", mascota.raza)
            put("fechaNacimiento", mascota.fechaNacimiento)
            put("esEsterilizado", if (mascota.esEsterilizado) 1 else 0)
            put("apodos", mascota.apodos.joinToString(","))
            put("alergias", mascota.alergias.joinToString(","))
            put("nickDueño", mascota.nickDueño)
        }

        val resultado = db.insert("mascotas", null, valores)

        db.close()

        return resultado
    }

    fun listar(nickUsuario: String): MutableList<Mascota> {

        val lista = mutableListOf<Mascota>()

        val db = dbHelper.readableDatabase

        val cursor: Cursor =
            db.rawQuery(
                "SELECT * FROM mascotas WHERE nickDueño = ?",
                arrayOf(nickUsuario)
            )

        if (cursor.moveToFirst()) {
            do {

                val mascota = Mascota(
                    idMascota = cursor.getInt(
                        cursor.getColumnIndexOrThrow("idMascota")
                    ),
                    nombre = cursor.getString(
                        cursor.getColumnIndexOrThrow("nombre")
                    ),
                    especie = cursor.getString(
                        cursor.getColumnIndexOrThrow("especie")
                    ),
                    genero = cursor.getString(
                        cursor.getColumnIndexOrThrow("genero")
                    ),
                    raza = cursor.getString(
                        cursor.getColumnIndexOrThrow("raza")
                    ),
                    fechaNacimiento = cursor.getString(
                        cursor.getColumnIndexOrThrow("fechaNacimiento")
                    ),
                    esEsterilizado = cursor.getInt(
                        cursor.getColumnIndexOrThrow("esEsterilizado")
                    ) == 1,
                    apodos = cursor.getString(
                        cursor.getColumnIndexOrThrow("apodos")
                    ).split(",").toMutableList(),
                    alergias = cursor.getString(
                        cursor.getColumnIndexOrThrow("alergias")
                    ).split(",").toMutableList(),
                    nickDueño = cursor.getString(
                        cursor.getColumnIndexOrThrow("nickDueño")
                    )
                )

                lista.add(mascota)

            } while (cursor.moveToNext())
        }

        cursor.close()
        db.close()

        return lista
    }
}