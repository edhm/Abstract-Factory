/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.conjuntosdedcoumentos;

/**
 *
 * @author JackStv
 */
public class SolicitudMatriculacion extends Documento {

    @Override
    public void imprime() {
        System.out.println("Muestra la Orden de Matriculación: " + contenido);
    }

    @Override
    public void visualiza() {
        System.out.println("Imprime la Orden de Matriculación:" + contenido);
    }

}
