package com.cibertec.demo.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.cibertec.demo.R
import com.cibertec.demo.data.api.DogApiClient
import com.cibertec.demo.entity.DogImageResponse
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class DogRazaAdapter(var listaRazas: List<String>, val onItemClickListener: (String) -> Unit):
    RecyclerView.Adapter<DogRazaAdapter.DogRazaViewHolder>(){
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): DogRazaAdapter.DogRazaViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_raza, parent, false)
        return DogRazaViewHolder(view)
    }

    override fun onBindViewHolder(holder: DogRazaViewHolder, position: Int) {
        val raza = listaRazas[position]
        holder.tvRaza.text = raza.capitalize()

        DogApiClient.apiService.getRandomImageByBreed(raza).enqueue(
            object : Callback<DogImageResponse>{
                override fun onResponse(
                    call: Call<DogImageResponse?>,
                    response: Response<DogImageResponse?>
                ) {
                    if(response.isSuccessful){
                        val imageUrl = response.body()?.message
                        Glide.with(holder.itemView.context)
                            .load(imageUrl)
                            .placeholder(R.drawable.ic_placeholder)
                            .into(holder.ivRaza)
                    }
                }

                override fun onFailure(p0: Call<DogImageResponse?>, p1: Throwable) {
                    holder.ivRaza.setImageResource(R.drawable.ic_placeholder)
                }
            })
        holder.itemView.setOnClickListener {
            onItemClickListener(raza)
        }
    }

    override fun getItemCount(): Int {
        return listaRazas.size
    }

    inner class DogRazaViewHolder(view: View): RecyclerView.ViewHolder(view){
        val ivRaza : ImageView = view.findViewById(R.id.ivRaza)
        val tvRaza : TextView = view.findViewById(R.id.tvRaza)

    }
}