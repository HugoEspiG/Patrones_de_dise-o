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
public class TarjetaCred implements MetodoPago{

    @Override
    public void pagar() {
        System.out.println("Pago con tarjeta de credito, difieralo a 64 cuotas :c, todo sea por la bendicion");
    }

}
