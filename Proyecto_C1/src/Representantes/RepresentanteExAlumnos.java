/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Representantes;

/**
 *
 * @author USUARIO
 */
public class RepresentanteExAlumnos {
    
    private String nombre, apellido;
    private int cedula, edad;

    public RepresentanteExAlumnos(String nombre, String apellido, int cedula, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
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

    @Override
    public String toString() {
        return "RepresentantesExAlumnos{" + "nombre=" + nombre + ", apellido=" + apellido + ", cedula=" + cedula + ", edad=" + edad + '}';
    }
    
    
}
