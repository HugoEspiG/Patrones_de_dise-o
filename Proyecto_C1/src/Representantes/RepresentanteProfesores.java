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
public class RepresentanteProfesores {

    private String nombre, apellido;
    private int cedula, edad, facultadP;

    public RepresentanteProfesores(String nombre, String apellido, int cedula, int edad, int facultadP) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.edad = edad;
        this.facultadP = facultadP;
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

    public int getFacultadP() {
        return facultadP;
    }

    public void setFacultadP(int facultadP) {
        this.facultadP = facultadP;
    }

    @Override
    public String toString() {
        return "RepresentanteProfesores{" + "nombre=" + nombre + ", apellido=" + apellido + ", cedula=" + cedula + ", edad=" + edad + ", facultadP=" + facultadP + '}';
    }

}
