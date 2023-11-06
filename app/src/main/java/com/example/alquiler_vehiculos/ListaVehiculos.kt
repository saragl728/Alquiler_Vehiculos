package com.example.alquiler_vehiculos

class ListaVehiculos {
    companion object{
        val listaDeVehiculos = listOf<Vehiculos>(
            //añado vehículos
            Vehiculos("https://blanauto.com/sites/default/files/inline-images/vehiculos-carrozados-002.jpg", "Carrozado con o sin trampilla", "2 plazas", "15.8 m^3"),
            Vehiculos("https://blanauto.com/sites/default/files/inline-images/mercedes_benz_citan_long_diesel_109cdi_van_2013_front_three_quarter.jpeg", "Furgoneta pequeña", "2 plazas", "6 m^3"),
            Vehiculos("https://assets.gcs.ehi.com/content/enterprise_cros/data/vehicle/bookingCountries/ES/VANS/PKMD.doi.768.high.imageSmallThreeQuarterNodePath.png/1492744313677.png", "Furgoneta carga grande", "3 plazas", "20 m^3"),
            Vehiculos("https://assets.gcs.ehi.com/content/enterprise_cros/data/vehicle/bookingCountries/ES/VANS/IKMD.doi.352.high.imageSmallThreeQuarterNodePath.png/1492744318177.png", "Furgoneta carga mediana", "3 plazas", "6 m^3"),
            Vehiculos("https://d12z4gz8sifrx.cloudfront.net/sites/default/files/inline-images/kangoo-maxi-small.png", "Renault Kangoo", "3 plazas", "4.6 m^3")
        )
    }
}