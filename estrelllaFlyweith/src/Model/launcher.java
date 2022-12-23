/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author pablo
 */
public class launcher {

    public static void main(String[] args) {
                MiVentana miVentana=new MiVentana();
		Logica miLogica=new Logica(miVentana);
                miLogica.pintarP();
		Controlador miControlador=new Controlador(miLogica);
		miVentana.setControlador(miControlador);

    }

}
