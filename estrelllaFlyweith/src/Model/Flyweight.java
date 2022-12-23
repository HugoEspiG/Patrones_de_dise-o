/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;
import javax.swing.ImageIcon;
/**
 *
 * @author juanp
 */
public class Flyweight {
    
    private ImageIcon foto;

    public Flyweight(String url){
        this.foto = new ImageIcon(url);
    }
    
    public ImageIcon getFoto() {
        return foto;
    }

    public void setFoto(ImageIcon foto) {
        this.foto = foto;
    }
}
