package Command;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
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
public class commandGuardar extends Command {

    public commandGuardar(JTextArea text, Caretaker caretaker, Originator originator, String ruta) {
        super(text, caretaker, originator, ruta);
    }
  


    @Override
    public void excecute() {
        try {
            file= new File("C:\\Users\\hugoa\\OneDrive\\Documents\\NetBeansProjects\\Proyecto_C3\\"+ruta+"\\Estado"+ (caretaker.getMementos().size()));
            file.createNewFile();
            originator.setEstado(file);
            caretaker.addMemento(originator.guardar());
            fw= new FileWriter(file);
            bw=new BufferedWriter(fw);
            bw.write(text);
            bw.close();


        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

}
