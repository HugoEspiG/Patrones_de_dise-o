/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Escuelas;

import fabrik.AbstractFactory;
import Decano.AbstractDecano;
import Profesores.AbstractProfesores;
import Estudiantes.AbstractEstudiantes;
import java.util.ArrayList;

/**
 *
 * @author Labing
 */
public class CienciasComunicacion extends AbstractFactory {

    private ArrayList<AbstractProfesores> profesores = null;
    private ArrayList<AbstractEstudiantes> estudiantes = null;

    @Override
    public Decano.CienciasComunicacion getDecano() {
        Decano.CienciasComunicacion decano = new Decano.CienciasComunicacion();
        gastosList.add(decano);
        return decano;
    }

    @Override
    public ArrayList<AbstractProfesores> getProfesores(int i) {
        profesores = new ArrayList<>();
        for (int j = 0; j < i; j++) {
            profesores.add(new Profesores.CienciasComunicacion());
        }
        return profesores;
    }

    @Override
    public ArrayList<AbstractEstudiantes> getEstudiantes(int i) {
        estudiantes = new ArrayList<>();
        for (int j = 0; j < i; j++) {
            estudiantes.add(new Estudiantes.CienciasComunicacion());
        }
        return estudiantes;
    }

    @Override
    public int gastoMetodo() {

        for (int i = 0; i < gastosList.size(); i++) {
            sumaSalarios += gastosList.get(i).gastoMetodo();
        }
        System.out.println("Soy escuela y mi reporte de gastos es: " + sumaSalarios);
        return sumaSalarios;
    }
}
