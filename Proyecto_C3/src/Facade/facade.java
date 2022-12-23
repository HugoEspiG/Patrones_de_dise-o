/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Facade;

import Command.Command;
import Command.Controlador;
import Command.commandGuardar;
import Command.commandUndo;
import Command.listCommand;
import cadena.IAprobador;
import cadena.Ordenador;
import cadena.Paciente;
import memento.Caretaker;
import memento.Originator;
import view.MiVentana;

/**
 *
 * @author hugoa
 */
public class facade {

    private Controlador miControlador;
    private MiVentana miVentana;
    private Command c;
    Caretaker caretaker;
    Originator originator;
    IAprobador aprobador;

    public void menu() {
        miVentana = new MiVentana();
        miControlador = new Controlador(this);
        miVentana.setControlador(miControlador);
        caretaker = new Caretaker();
        originator = new Originator();

    }

    public void undo() {
        c = new commandUndo(miVentana.getTextField(),caretaker,originator,selec());
        c.excecute();
        
    }

    public void guardar() {
        c = new commandGuardar(miVentana.getTextField(),caretaker,originator,selec());
        c.excecute();
    }

    public void listaEstados() {
        c = new listCommand(miVentana.getTextField(),caretaker,originator,selec());
        c.excecute();
    }

    public String selec(){
        aprobador=new Ordenador();
        aprobador.manejoCarpeta(miVentana.getCaja());
        return aprobador.ruta;
    }
}
