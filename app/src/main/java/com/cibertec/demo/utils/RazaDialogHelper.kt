package com.cibertec.demo.utils

import android.app.AlertDialog
import android.content.Context
import android.view.LayoutInflater
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.cibertec.demo.BuildConfig
import com.cibertec.demo.R
import com.cibertec.demo.adapter.CatRazaAdapter
import com.cibertec.demo.adapter.DogRazaAdapter
import com.cibertec.demo.data.api.CatApiClient
import com.cibertec.demo.data.api.DogApiClient
import com.cibertec.demo.entity.CatBreed
import com.cibertec.demo.entity.DogBreedsResponse
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

object RazaDialogHelper {
    fun mostrarDialogoRazasPerros(context: Context, onSelected: (String) -> Unit) {
        val view = LayoutInflater.from(context).inflate(R.layout.dialog_razas, null)
        val rv = view.findViewById<RecyclerView>(R.id.rvRazas)

        val dialog = AlertDialog.Builder(context)
            .setView(view)
            .create()

        DogApiClient.apiService.getAllBreeds().enqueue(object : Callback<DogBreedsResponse> {

            override fun onResponse(call: Call<DogBreedsResponse>, response: Response<DogBreedsResponse>) {
                val breedsMap = response.body()?.message ?: emptyMap()
                val list = breedsMap.keys.toList()

                rv.layoutManager = LinearLayoutManager(context)
                rv.adapter = DogRazaAdapter(list) { raza ->
                    onSelected(raza)
                    dialog.dismiss()
                }
            }

            override fun onFailure(call: Call<DogBreedsResponse>, t: Throwable) {
                Toast.makeText(context, "Error cargando razas", Toast.LENGTH_SHORT).show()
            }
        })

        dialog.show()
    }
    fun mostrarDialogoRazasGatos(context: Context, onSelected: (String) -> Unit) {
        val view = LayoutInflater.from(context).inflate(R.layout.dialog_razas, null)
        val rv = view.findViewById<RecyclerView>(R.id.rvRazas)

        val dialog = AlertDialog.Builder(context)
            .setView(view)
            .create()

        CatApiClient.apiService.getAllBreeds(BuildConfig.CAT_API_KEY)
            .enqueue(object : Callback<List<CatBreed>> {

                override fun onResponse(
                    call: Call<List<CatBreed>>,
                    response: Response<List<CatBreed>>
                ) {
                    val list = response.body() ?: emptyList()

                    rv.layoutManager = LinearLayoutManager(context)
                    rv.adapter = CatRazaAdapter(list) { raza ->
                        onSelected(raza.name)
                        dialog.dismiss()
                    }
                }

                override fun onFailure(call: Call<List<CatBreed>>, t: Throwable) {
                    Toast.makeText(context, "Error cargando gatos", Toast.LENGTH_SHORT).show()
                }
            })

        dialog.show()
    }
}