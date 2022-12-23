package Command;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTextArea;
import memento.Caretaker;
import memento.Originator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author USUARIO
 */
public abstract class Command {
    File file;
    Caretaker caretaker;
    Originator originator;
    String ruta;
    String text;
    int cont = 0;
    FileWriter fw;
    BufferedWriter bw;

    public Command(JTextArea text,Caretaker caretaker,Originator originator,String ruta) {
        this.caretaker=caretaker;
        this.originator=originator;
        this.text = text.getText();
        this.ruta=ruta;
    }

    public abstract void excecute();
}
