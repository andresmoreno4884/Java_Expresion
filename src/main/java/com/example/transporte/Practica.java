
package com.example.transporte;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Practica {

    public static void main(String[] args) {

        // 1. Crear la lista de cinco vehículos
        List<Vehiculo> flota = new ArrayList<>();

        flota.add(new Bus("BUS101", 40, "Centro-Norte"));
        flota.add(new Bus("BUS102", 35, "Sur-Centro"));
        flota.add(new Taxi("TAX201", 4, "Taxis Bogotá"));
        flota.add(new Taxi("TAX202", 4, "Radio Taxi"));
        flota.add(new Vehiculo("VEH301", 8));

        // 2. Recorrer la flota e imprimir descripción y tarifa
        System.out.println("===== FLOTA DE VEHICULOS =====");

        for (Vehiculo vehiculo : flota) {
            System.out.println(vehiculo.descripcion());
            System.out.println(
                    "Tarifa para 10 km: "
                    + vehiculo.calcularTarifa(10));
            System.out.println("-------------------------");
        }

        System.out.println("Total de vehiculos: " + flota.size());

        // 3. Contar vehículos con capacidad mayor a 10
        int contador = 0;

        for (Vehiculo vehiculo : flota) {
            if (vehiculo.getCapacidad() > 10) {
                contador++;
            }
        }

        System.out.println(
                "Vehiculos con capacidad mayor a 10: " + contador);

        // 4. Crear el mapa de conductores
        Map<String, String> conductores = new HashMap<>();

        conductores.put("BUS101", "Carlos");
        conductores.put("BUS102", "Andres");
        conductores.put("TAX201", "Daniela");

        // 5. Consultar un conductor existente
        String placaBus = "BUS101";

        if (conductores.containsKey(placaBus)) {
            System.out.println(
                    "El conductor de " + placaBus + " es "
                    + conductores.get(placaBus));
        }

        // Consultar una placa inexistente
        String placaInexistente = "XYZ999";

        if (conductores.containsKey(placaInexistente)) {
            System.out.println(
                    "El conductor es "
                    + conductores.get(placaInexistente));
        } else {
            System.out.println(
                    "No existe un conductor asignado a "
                    + placaInexistente);
        }
    }
}
