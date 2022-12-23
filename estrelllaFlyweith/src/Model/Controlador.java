package Model;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Valentina
*/
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Controlador implements ActionListener {
Logica l;
	public Controlador(Logica log) {
		l = log;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals("Derecha")) {
			l.pintarD();

		}
                else if (e.getActionCommand().equals("Izquierda")) {
			l.pintarI();

		}
                else if (e.getActionCommand().equals("Arriba")) {
			l.pintarAR();

		}
                else if (e.getActionCommand().equals("Abajo")) {
			l.pintarAB();

		}
	}

}

