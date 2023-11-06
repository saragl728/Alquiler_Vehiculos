package com.example.alquiler_vehiculos.Adapter

import android.app.AlertDialog
import android.app.Dialog
import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.alquiler_vehiculos.Vehiculos
import com.example.alquiler_vehiculos.databinding.ItemVehiculoBinding

class VehicleViewHolder(view: View) : RecyclerView.ViewHolder(view) {
val binding = ItemVehiculoBinding.bind(view)
    fun render(vehicleModel: Vehiculos){
        //hago que se conecten los datos de la clase con el layout
        binding.nombreVehiculo.text = vehicleModel.modelo
        binding.Volumen.text = vehicleModel.capacidad
        binding.numeroPlazas.text = vehicleModel.numeroPlazas
        Glide.with(binding.fotoVehiculo.context).load(vehicleModel.urlVehiculo).into(binding.fotoVehiculo)

    }

}