/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JackStv
 */
public abstract class DptoInmobiliario {

    protected float precio;
    protected String dpto;
    protected int nHabitaciones;
    protected int ndivisiones;
    protected int nPlanta;
    protected String color;

    public DptoInmobiliario(float precio, String dpto, int nHabitaciones, int ndivisiones, int nPlanta, String color) {
        this.precio = precio;
        this.dpto = dpto;
        this.nHabitaciones = nHabitaciones;
        this.ndivisiones = ndivisiones;
        this.nPlanta = nPlanta;
        this.color = color;
    }

    public abstract void mostrarDescripcionDpto();
}
