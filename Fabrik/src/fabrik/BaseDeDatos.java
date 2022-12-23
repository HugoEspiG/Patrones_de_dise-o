/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fabrik;

/**
 *
 * @author hugoa
 */
public class BaseDeDatos {
    private String nombre;
    private static BaseDeDatos baseDeDatos;

    // El constructor es privado, no permite que se genere un constructor por defecto.
    private BaseDeDatos(String nombre) {
        this.nombre = nombre;
    }

    public static BaseDeDatos getSingletonInstance(String nombre) {
        if (baseDeDatos == null){
            baseDeDatos = new BaseDeDatos(nombre);
        }
        else{
            System.out.println("No se puede crear el objeto "+ nombre + " porque ya existe un objeto de la clase SoyUnico");
        }
        
        return baseDeDatos;
    }
    
    // metodos getter y setter

    public static BaseDeDatos getBaseDeDatos() {
        return baseDeDatos;
    }

    public static void setBaseDeDatos(BaseDeDatos baseDeDatos) {
        BaseDeDatos.baseDeDatos = baseDeDatos;
    }

}
