/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JackStv
 */
public class VehiculoGasolinero implements Vehiculo {

    @Override
    public Automovil creaAutomovil(String modelo, String color, int potencia, double espacio) {
        return new AutomovilGasolinero(modelo, color, potencia, espacio);
    }

    @Override
    public Scooter crearScooter(String modelo, String color, int potencia) {
        return new ScooterGasolinero(modelo, color, potencia);
    }

    @Override
    public Motocicleta creaMotocicleta(String modelo, String color, String tipo, int potencia) {
        return new MotocicletaGasolinero(modelo, color, tipo, potencia);
    }

}
