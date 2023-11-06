package com.example.alquiler_vehiculos

import android.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.alquiler_vehiculos.Adapter.VehicleAdapter
import com.example.alquiler_vehiculos.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)

        //hago que use binding
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.recycler.layoutManager = LinearLayoutManager(this)
        binding.recycler.adapter = VehicleAdapter(ListaVehiculos.listaDeVehiculos)

        //hacer click en mostrar, debería hacer que se pudiera ver
        binding.botonMostrar.setOnClickListener {
            binding.recycler.visibility = View.VISIBLE
        }

        //hacer click en guardar
        binding.botonGuardar.setOnClickListener {
            var aviso = AlertDialog.Builder(this)
            aviso.setTitle("Confirmación")
            aviso.setMessage("¿Guardar datos?")
                .setPositiveButton(android.R.string.ok, {
                    dialog, which -> Toast.makeText(this, "Datos guardados", Toast.LENGTH_LONG).show()
                })
                .setNegativeButton(android.R.string.cancel,
                    {dialog, which -> Toast.makeText(this, "No se han guardado los datos", Toast.LENGTH_LONG).show()
        })
        }
    }
}