/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fabrik;

import Decano.AbstractDecano;
import Profesores.AbstractProfesores;
import Estudiantes.AbstractEstudiantes;
import java.util.ArrayList;
import Egresos.Component;



/**
 *
 * @author Labing
 */
public abstract class AbstractFactory extends Component {
    public int sumaSalarios = 0;
    public ArrayList<Component> gastosList = new ArrayList<Component>();
    
    public abstract AbstractDecano getDecano();
    public abstract ArrayList<AbstractProfesores> getProfesores(int i);
    public abstract ArrayList<AbstractEstudiantes> getEstudiantes(int i);
}
