/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JackStv
 */
public class MotocicletaElectrico extends Motocicleta {

    public MotocicletaElectrico(String modelo, String color, String tipo, int potencia) {
        super(modelo, color, tipo, potencia);
    }

    @Override
    public void mostrarCaracteristicas() {
        System.out.println("Caracterisitcas de  la Motocicleta Electricaa");
    }

}
