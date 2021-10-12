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
public class OrdenPedido extends Documento {

    @Override
    public void imprime() {
        System.out.println("Muetsras la Orden de pedido: " + contenido);
    }

    @Override
    public void visualiza() {
        System.out.println("Imprime la Orden de  Pedido: " + contenido
        );
    }

}
