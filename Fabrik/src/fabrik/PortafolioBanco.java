/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fabrik;


import Portafolios.clienteEmpresarialGrande;
import Portafolios.clienteEmpresarialPequeño;
import Portafolios.clientePersonalGrande;
import Portafolios.clientePersonalPequeño;
import javax.swing.JOptionPane;

/**
 *
 * @author Labing
 */
public class PortafolioBanco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String respuesta = null;
        String respuestaN = null;
        AbstractFactory Portafolio;
            String[] PortafoliosPos = {
            "Cliente Empresarial Grande",
            "Cliente Empresarial Pequeño",
            "Cliente Personal Grande",
            "Cliente Personal Pequeño"
        };
        respuestaN = (String) JOptionPane.showInputDialog(null, "Ingrese su nombre: ");
        respuesta = (String) JOptionPane.showInputDialog(null, "Ingrese el portafolio que desee: ","Portafolio",JOptionPane.DEFAULT_OPTION,null,PortafoliosPos,PortafoliosPos[0]);
        if (respuesta.equals("Cliente Empresarial Grande")) {
            Portafolio = new clienteEmpresarialGrande();
        } else if (respuesta.equals("Cliente Empresarial Pequeño")) {
            Portafolio = new clienteEmpresarialPequeño();
        } else if (respuesta.equals("Cliente´Personal Grande")) {
            Portafolio = new clientePersonalGrande();
        } else {
            Portafolio = new clientePersonalPequeño();
        }

        System.out.println(Portafolio.getCuenta().VenderPortafolio());
        System.out.println(Portafolio.getBonos().VenderPortafolio());
        System.out.println(Portafolio.getAcciones().VenderPortafolio());
        
        
        
    }

}
