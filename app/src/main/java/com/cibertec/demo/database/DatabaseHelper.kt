package com.cibertec.demo.database

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class DatabaseHelper(context: Context) :
    SQLiteOpenHelper(context, "firuvet.db", null, 2) {

    override fun onCreate(db: SQLiteDatabase) {

        db.execSQL(
            """
            CREATE TABLE usuarios(
                id INTEGER PRIMARY KEY AUTOINCREMENT,
                nickUsuario TEXT,
                correo TEXT,
                clave TEXT
            )
            """
        )

        db.execSQL(
            """
            CREATE TABLE mascotas(
                idMascota INTEGER PRIMARY KEY AUTOINCREMENT,
                nombre TEXT,
                especie TEXT,
                genero TEXT,
                raza TEXT,
                fechaNacimiento TEXT,
                esEsterilizado INTEGER,
                apodos TEXT,
                alergias TEXT,
                nickDueño TEXT
            )
            """
        )

        db.execSQL(
            """
            CREATE TABLE citas(
                id INTEGER PRIMARY KEY AUTOINCREMENT,
                fecha TEXT,
                hora TEXT,
                lugar TEXT,
                estado TEXT
            )
            """
        )
    }

    override fun onUpgrade(
        db: SQLiteDatabase,
        oldVersion: Int,
        newVersion: Int
    ) {
        db.execSQL("DROP TABLE IF EXISTS usuarios")
        db.execSQL("DROP TABLE IF EXISTS mascotas")
        db.execSQL("DROP TABLE IF EXISTS citas")

        onCreate(db)
    }
}