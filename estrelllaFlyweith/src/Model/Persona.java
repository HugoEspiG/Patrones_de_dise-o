
package Model;

import javax.swing.ImageIcon;

/**
 * @author pablo
 */
public class Persona {
    private String nombre;
    private int id,x,y,tx,ty;

    public Persona(int id, int x, int y, int tx, int ty) {
        this.id = id;
        this.x = x;
        this.y = y;
        this.tx = tx;
        this.ty = ty;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getTx() {
        return tx;
    }

    public void setTx(int tx) {
        this.tx = tx;
    }

    public int getTy() {
        return ty;
    }

    public void setTy(int ty) {
        this.ty = ty;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public ImageIcon getFoto(){
        return FlyweightFactory.getFlyweight(id%10).getFoto();
    }
}
