/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LauncherCentral;

/**
 *
 * @author hugoa
 */
public class UsuarioAdmon {
    
    private String usuario;
    private String contrasenia;
    private String nombre="Hugo";
    private String Apellido="Espinosa";
    private int cedula=1010123792;
    private int edad=21;
    
    private static UsuarioAdmon usuarioAdmon;

    // El constructor es privado, no permite que se genere un constructor por defecto.
    private UsuarioAdmon(String usuario, String contrasenia) {
        this.usuario=usuario;
        this.contrasenia=contrasenia;
    }

    public static synchronized UsuarioAdmon getSingletonInstance(String usuario,String contrasenia) {
        if (usuarioAdmon == null){
            usuarioAdmon = new UsuarioAdmon(usuario,contrasenia);
        }
        
        return usuarioAdmon;
    }

    @Override
    public String toString() {
        return "Rector{" + "nombre=" + nombre + ", Apellido=" + Apellido + ", cedula=" + cedula + ", edad=" + edad + '}';
    }

    
    // metodos getter y setter

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }


    public static UsuarioAdmon getUsuarioAdmon() {
        return usuarioAdmon;
    }

    public static void setUsuarioAdmon(UsuarioAdmon usuarioAdmon) {
        UsuarioAdmon.usuarioAdmon = usuarioAdmon;
    }


}
