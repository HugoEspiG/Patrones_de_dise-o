/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Egresos;

/**
 *
 * @author juanp
 */
public class TarjetaDeb implements MetodoPago{

    @Override
    public void pagar() {
        System.out.println("Pago con tarjeta debito, debes tener mucha plata, adopteme maestra !!");
    }

}
