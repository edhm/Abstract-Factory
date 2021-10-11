/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JackStv
 */
public class AutomovilGasolinero extends Automovil {

    public AutomovilGasolinero(String modelo, String color, int potencia, double espacio) {
        super(modelo, color, potencia, espacio);
    }

    @Override
    public void mostrarCaracteristicas() {
        System.out.println(" Automovil Gasolinero");
    }

}
