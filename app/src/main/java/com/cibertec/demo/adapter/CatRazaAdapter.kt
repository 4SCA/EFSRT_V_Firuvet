package com.cibertec.demo.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.cibertec.demo.BuildConfig
import com.cibertec.demo.R
import com.cibertec.demo.data.api.CatApiClient
import com.cibertec.demo.entity.CatBreed
import com.cibertec.demo.entity.CatImage
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class CatRazaAdapter(private val listaRazas: List<CatBreed>, private val onItemClickListener: (CatBreed) -> Unit): RecyclerView.Adapter<CatRazaAdapter.CatRazaViewHolder>() {

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): CatRazaViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_raza, parent, false)
        return  CatRazaViewHolder(view)
    }

    override fun onBindViewHolder(holder: CatRazaViewHolder, position: Int){
        val raza= listaRazas[position]
        holder.tvRaza.text = raza.name

        CatApiClient.apiService.getImagesByBreed(raza.id, limit = 1, BuildConfig.CAT_API_KEY)
            .enqueue(object: Callback<List<CatImage>>{
                override fun onResponse(call: Call<List<CatImage>?>, response: Response<List<CatImage>?>) {
                    if(response.isSuccessful){
                        val images = response.body()
                        if (!images.isNullOrEmpty()) {
                            val imageUrl = images.first().url
                            Glide.with(holder.itemView.context)
                                .load(imageUrl)
                                .placeholder(R.drawable.ic_placeholder)
                                .into(holder.ivRaza)
                        } else {
                            holder.ivRaza.setImageResource(R.drawable.ic_placeholder)
                        }
                    }
                }

                override fun onFailure(call: Call<List<CatImage>?>, t: Throwable) {
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

    inner class CatRazaViewHolder(view: View): RecyclerView.ViewHolder(view){
        val ivRaza: ImageView = view.findViewById(R.id.ivRaza)
        val tvRaza: TextView = view.findViewById(R.id.tvRaza)
    }
}