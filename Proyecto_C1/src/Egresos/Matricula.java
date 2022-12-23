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
public abstract class Matricula {
    
    public void realizarPago(){
        
        MetodoPago pago = pagar();
    }
    
    public abstract MetodoPago pagar();
    
}
