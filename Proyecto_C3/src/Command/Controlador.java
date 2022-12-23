package Command;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Valentina
*/
import Facade.facade;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class Controlador implements ActionListener{
facade l;
	public Controlador(facade log) {
		l = log;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals("Guardar")) {
                    l.guardar();
		}
                else if (e.getActionCommand().equals("Deshacer")) {
                    l.undo();
		}
                else if (e.getActionCommand().equals("Revisar")) {
                    l.listaEstados();
                }
                else if (e.getActionCommand().equals("Selec")) {
                    l.selec();
		}else{
                    System.out.println("Opcion aun no implementada");
                }
        }

   
}

