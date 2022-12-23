/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Profesores;

import ModelProf.IComponentProf;
import Egresos.Component;


/**
 *
 * @author Labing
 */
public abstract class AbstractProfesores extends Component {
    
    int salario = 4000000;
    
    public abstract void QuienSoy(int i);
    
}
