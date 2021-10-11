/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JackStv
 */
public class VehiculoElectrico implements Vehiculo {

    @Override
    public Automovil creaAutomovil(String modelo, String color, int potencia, double espacio) {
        return new AutomovilElectrico(modelo, color, potencia, espacio);
    }

    @Override
    public Scooter crearScooter(String modelo, String color, int potencia) {
        return new ScooterElectrico(modelo, color, potencia);
    }

    @Override
    public Motocicleta creaMotocicleta(String modelo, String color, String tipo, int potencia) {
        return new MotocicletaElectrico(modelo, color, tipo, potencia);
    }

}
