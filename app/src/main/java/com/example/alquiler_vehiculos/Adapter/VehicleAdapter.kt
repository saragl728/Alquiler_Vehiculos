package com.example.alquiler_vehiculos.Adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.alquiler_vehiculos.ListaVehiculos.Companion.listaDeVehiculos
import com.example.alquiler_vehiculos.Vehiculos
import com.example.alquiler_vehiculos.R

class VehicleAdapter : RecyclerView.Adapter<VehicleViewHolder>() {

    //implemento métodos abstractos
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VehicleViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return VehicleViewHolder(layoutInflater.inflate(R.layout.item_vehiculo, parent, false))
    }

    override fun getItemCount(): Int {
        return listaDeVehiculos.size
    }

    override fun onBindViewHolder(holder: VehicleViewHolder, position: Int) {
        val item = listaDeVehiculos[position]
        holder.render(item)
    }
}