package Command;

import Command.Command;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import memento.Caretaker;
import memento.Memento;
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
public class listCommand extends Command {

    public listCommand(JTextArea text, Caretaker caretaker, Originator originator, String ruta) {
        super(text, caretaker, originator, ruta);
    }
    
    
    @Override
    public void excecute() {
        try {
            String[] valores = new String[caretaker.getMementos().size()];
            for (int i = 0; i < valores.length; i++) {
                valores[i] = caretaker.getMemento(i).getEstado().getName();
            }
            String i = (String) JOptionPane.showInputDialog(null, "Ingrese el estado que desee: ", "Estados", JOptionPane.DEFAULT_OPTION, null, valores, caretaker.getMemento(0));
            for (int j = 0; j < valores.length; j++) {
                if (valores[j] == i) {
                    originator.restaurar(caretaker.getMemento(j));                    
                }
            }
            file = originator.getEstado();
            Scanner sc = new Scanner(file);
            fw = new FileWriter(caretaker.getMemento(caretaker.getMementos().size() - 1).getEstado());
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
