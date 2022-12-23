package Decano;

import Profesores.*;

/**
 *
 * @author USUARIO
 */
public class AdminMarketing extends AbstractDecano {

    @Override
    public String QuienSoy() {
        return "Soy el decano de la Escuela Internacional de Administracion y Marketing";
    }

    @Override
    public int gastoMetodo() {

        salario = 5000000;

        for (int i = 0; i < gastosList.size(); i++) {
            salario += gastosList.get(i).gastoMetodo();
        }
        System.out.println("Soy decano y mi reporte de gastos es: " + salario);
        return salario;
    }
    
    public void ingresarProfesores(){
        AbstractProfesores profe = new Profesores.AdminMarketing();
        AbstractProfesores profe2 = new Profesores.AdminMarketing();
        
        gastosList.add(profe);
        gastosList.add(profe2);
        
    }

}
