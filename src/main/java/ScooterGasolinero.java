/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JackStv
 */
public class ScooterGasolinero extends Scooter {

    public ScooterGasolinero(String modelo, String color, int potencia) {
        super(modelo, color, potencia);
    }

    @Override
    public void mostrarCaracteristicas() {
        System.out.println("Caracteristicas de Scooter Gasolinero");
    }

}
