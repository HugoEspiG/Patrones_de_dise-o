/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Decano;
import Egresos.Component;
import java.util.ArrayList;

/**
 *
 * @author Labing
 */
public abstract class AbstractDecano extends Component {
    
    int salario = 5000000;
    ArrayList<Component> gastosList = new ArrayList<Component>();
    
    public abstract String QuienSoy();
    public abstract void ingresarProfesores();
    
}
