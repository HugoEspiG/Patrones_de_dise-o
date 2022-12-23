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
public class RepresentanteEstudiantes {

     private String nombre, apellido;
    private int cedula, edad, facultadE;

    public RepresentanteEstudiantes(String nombre, String apellido, int cedula, int edad, int facultadP) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.edad = edad;
        this.facultadE = facultadP;
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

    public int getFacultadE() {
        return facultadE;
    }

    public void setFacultadE(int facultadE) {
        this.facultadE = facultadE;
    }

    @Override
    public String toString() {
        return "RepresentanteEstudiantes{" + "nombre=" + nombre + ", apellido=" + apellido + ", cedula=" + cedula + ", edad=" + edad + ", facultadP=" + facultadE + '}';
    }

}
