/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JackStv
 */
public abstract class Motocicleta {

    protected String modelo;
    protected String color;
    protected String tipo;
    protected int potencia;

    public Motocicleta(String modelo, String color, String tipo, int potencia) {
        this.modelo = modelo;
        this.color = color;
        this.tipo = tipo;
        this.potencia = potencia;
    }

    public abstract void mostrarCaracteristicas();

}
