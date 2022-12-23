package Model;

import java.awt.Color;
import javax.swing.*;

public class MiVentana extends JFrame {

    private Panel myPanel;
    private JButton boton1;
    private JButton boton2;
    private JButton boton3;
    private JButton boton4;
    private Controlador miControlador;
    
    public MiVentana() {
        super("Hola Mundo");
        setLayout(null);
        setBounds(10, 10, 1000, 700);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        initComponents();

    }

    private void initComponents() {
        // Panel

        myPanel = new Panel();
        myPanel.setLayout(null);
        myPanel.setBounds(10, 10, 600, 600);
        myPanel.setBackground(Color.BLACK);

        boton1= new JButton("->");
        boton1.setBounds(800, 150,100, 50);
        
        boton2= new JButton("<-");
        boton2.setBounds(650, 150,100, 50);
        
        boton3= new JButton("^");
        boton3.setBounds(750, 50,50, 100);
        
        boton4= new JButton("v");
        boton4.setBounds(750, 200,50, 100);
        
        this.add(boton1);
        this.add(boton2);
        this.add(boton3);
        this.add(boton4);
        this.add(myPanel);
    }

    public Panel getMiPanel() {
        return myPanel;
    }

    public void setMiPanel(Panel miPanel) {
        this.myPanel = miPanel;
    }

    public Controlador getControlador() {
        return miControlador;
    }

    public void setControlador(Controlador controlador) {
        		miControlador = controlador;
		boton1.addActionListener(miControlador);
		boton1.setActionCommand("Derecha");
		boton2.addActionListener(miControlador);
		boton2.setActionCommand("Izquierda");
		boton3.addActionListener(miControlador);
		boton3.setActionCommand("Arriba");
		boton4.addActionListener(miControlador);
		boton4.setActionCommand("Abajo");


    }

}
