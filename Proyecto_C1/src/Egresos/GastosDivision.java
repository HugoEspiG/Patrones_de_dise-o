/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Egresos;

import java.util.ArrayList;

/**
 *
 * @author pablo
 */
public class GastosDivision extends Component {

    public ArrayList<Component> gastosList = new ArrayList<Component>();

    @Override
    public int gastoMetodo() {

        int suma = 0;

        for (int i = 0; i < gastosList.size(); i++) {
            suma += gastosList.get(i).gastoMetodo();
        }
        return suma;
    }

}
