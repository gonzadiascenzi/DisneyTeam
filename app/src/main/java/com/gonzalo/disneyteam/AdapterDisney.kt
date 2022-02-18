package com.gonzalo.disneyteam

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.gonzalo.disneyteam.model.DisneyModel

class AdaptadorDisney(val disney: List<DisneyModel>)
    : RecyclerView.Adapter<AdaptadorDisney.ViewHolder> (){



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AdaptadorDisney.ViewHolder {
        //Enlazar xml con nuestro adaptador
        val v = LayoutInflater.from(parent.context).inflate(R.layout.item_list, parent, false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(holder: AdaptadorDisney.ViewHolder, position: Int) {
        //Enlace cada elemento del xlm con los datos de los paises
        val d = disney[position]
        holder.nombre.text = d.nombre
        holder.bandera.setImageResource(d.imagen)


    }

    override fun getItemCount(): Int {
        return disney.size
    }

    class ViewHolder(v: View): RecyclerView.ViewHolder(v){
        var nombre: TextView
        var bandera: ImageView
        init {
            nombre = v.findViewById(R.id.tvNombre)
            bandera = v.findViewById(R.id.arImagen)

        }
    }
}