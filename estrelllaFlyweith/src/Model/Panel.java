package Model;

import java.awt.*;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Panel extends JPanel {

    public int sizeX = 4;
    public int sizeY = 4;

    private ArrayList<Persona> personas = new ArrayList();

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
            
        for(Persona p:personas){
            g.drawImage(p.getFoto().getImage(), p.getX(),p.getY(), p.getTx(), p.getTy(), null);
            
        }
    }

    public void setPersonas(ArrayList<Persona> p) {
        this.personas = p;
    }

}
