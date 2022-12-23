/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import Command.Controlador;
import java.awt.Color;
import java.awt.Panel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JTextArea;

/**
 *
 * @author hugoa
 */
public class MiVentana extends JFrame {

    private JTextArea textField;
    private String clipboard;
    private Controlador miControlador;
    private JButton ctrlC;
    private JButton ctrlX;
    private JButton ctrlV;
    private JButton selec;
    private JComboBox caja;

    public MiVentana() {
        super("Editor de Texto");
        setLayout(null);
        setBounds(10, 10, 400, 400);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        initComponents();

    }

    private void initComponents() {
        // Panel
        caja = new JComboBox();
        caja.setBounds(10, 10, 100, 30);
        caja.addItem("Medico");
        caja.addItem("Enfermero");
        caja.addItem("Paciente");
        
        textField = new JTextArea();
        textField.setBounds(10, 50, 370, 230);

        ctrlC = new JButton("Guardar");
        ctrlC.setBounds(10, 300, 80, 30);

        ctrlX = new JButton("Deshacer");
        ctrlX.setBounds(135, 300, 100, 30);

        ctrlV = new JButton("Revisar");
        ctrlV.setBounds(280, 300, 80, 30);

        selec = new JButton("Seleccionar");
        selec.setBounds(110, 10, 100, 30);

        this.add(caja);
        this.add(selec);
        this.add(ctrlC);
        this.add(ctrlX);
        this.add(ctrlV);
        this.add(textField);
    }

    public Controlador getControlador() {
        return miControlador;
    }

    public void setControlador(Controlador controlador) {
        miControlador = controlador;
        ctrlC.addActionListener(miControlador);
        ctrlC.setActionCommand("Guardar");
        ctrlX.addActionListener(miControlador);
        ctrlX.setActionCommand("Deshacer");
        ctrlV.addActionListener(miControlador);
        ctrlV.setActionCommand("Revisar");
        selec.addActionListener(miControlador);
        selec.setActionCommand("Selec");
        
    }

    public String getCaja() {
        return (String) caja.getSelectedItem();
    }

    public JTextArea getTextField() {
        return textField;
    }

    public void setTextField(JTextArea textField) {
        this.textField = textField;
    }

}
