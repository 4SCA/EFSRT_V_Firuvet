package com.cibertec.demo.database

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class DatabaseHelper(context: Context) :
    SQLiteOpenHelper(
        context,
        "firuvet.db",
        null,
        1
    ) {

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
                id INTEGER PRIMARY KEY AUTOINCREMENT,
                nombre TEXT,
                raza TEXT,
                edad INTEGER,
                sexo TEXT
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

    }
}