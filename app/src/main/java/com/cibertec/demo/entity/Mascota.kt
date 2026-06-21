package com.cibertec.demo.entity

import java.io.Serializable

data class Mascota(
    var idMascota: Int,
    var nombre : String,
    var especie : String,
    var genero : String,
    var raza: String, //donde se obtiene desde la api
    var fechaNacimiento : String,
    var esEsterilizado : Boolean,
    var apodos : MutableList<String> = mutableListOf(),
    var alergias : MutableList<String> = mutableListOf(),
    val nickDueño : String
) : Serializable