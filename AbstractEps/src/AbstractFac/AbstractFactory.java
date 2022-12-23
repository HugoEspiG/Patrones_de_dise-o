/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractFac;


import Doctores.AbstractDoctores;
import Enfermeros.AbstractEnfermeros;
import java.util.ArrayList;



/**
 *
 * @author Labing
 */
public interface AbstractFactory  {

    public ArrayList<AbstractDoctores> getDoctores(int i);
    public ArrayList<AbstractEnfermeros> getEnfermeros(int i);
}
