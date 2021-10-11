/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JackStv
 */
public interface Vehiculo {

    Automovil creaAutomovil(String modelo, String color, int potencia, double espacio);

    Scooter crearScooter(String modelo, String color, int potencia);

    Motocicleta creaMotocicleta(String modelo, String color, String tipo, int potencia);
    
}
