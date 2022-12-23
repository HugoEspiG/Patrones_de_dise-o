package Command;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
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
public class commandUndo extends Command {

    public commandUndo(JTextArea text, Caretaker caretaker, Originator originator, String ruta) {
        super(text, caretaker, originator, ruta);
    }



    @Override
    public void excecute() {
        try {
            originator.restaurar(caretaker.getMemento(caretaker.getMementos().size() - 2));
            file = originator.getEstado();
            Scanner sc = new Scanner(file);
            fw = new FileWriter(caretaker.getMemento(caretaker.getMementos().size()-1).getEstado());
            bw = new BufferedWriter(fw);
            while (sc.hasNextLine()) {
                bw.write(sc.nextLine());
            }
            bw.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

}
