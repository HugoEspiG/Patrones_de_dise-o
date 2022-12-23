/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Egresos;

import javax.swing.JOptionPane;

/**
 *
 * @author juanp
 */
public class Pregrado extends Matricula {

    String[] metodos = {
        "Pse",
        "Tarjeta Debito",
        "Tarjeta Credito",
        "Cheque",
        "Efectivo"
    };
    
    String respuesta = null;

    @Override
    public MetodoPago pagar() {
        respuesta = (String) JOptionPane.showInputDialog(null, "Ingrese el portafolio que desee: ", "Portafolio", JOptionPane.DEFAULT_OPTION, null, metodos, metodos[0]);

        if (respuesta.equals("Pse")) {
            return new Pse();
        }
        else if (respuesta.equals("Tarjeta Debito")) {
            return new TarjetaDeb();
        }
        else if (respuesta.equals("Tarjeta Credito")) {
            return new TarjetaCred();
        }
        else if (respuesta.equals("Cheque")) {
            return new Cheque();
        }else {
            return new Efectivo();
        }
    }

}
