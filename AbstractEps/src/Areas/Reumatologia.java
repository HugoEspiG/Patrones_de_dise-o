/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Areas;

import AbstractFac.AbstractFactory;
import Doctores.AbstractDoctores;
import Enfermeros.AbstractEnfermeros;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author USUARIO
 */
public class Reumatologia implements AbstractFactory{

    private ArrayList<AbstractDoctores> doctores = null;
    private ArrayList<AbstractEnfermeros> enfermeros = null;

    @Override
    public ArrayList<AbstractDoctores> getDoctores(int i) {
        doctores = new ArrayList<>();
        Random r = new Random();
        for (int j = 0; j < i; j++) {
            doctores.add(new Doctores.Reumatologia());
        }
        return doctores;
    }

    @Override
    public ArrayList<AbstractEnfermeros> getEnfermeros(int i) {
        enfermeros = new ArrayList<>();
        for (int j = 0; j < i; j++) {
            enfermeros.add(new Enfermeros.Reumatologia());
        }
        return enfermeros;
    }

}
