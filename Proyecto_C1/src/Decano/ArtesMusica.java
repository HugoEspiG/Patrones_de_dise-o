/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Decano;

import Profesores.*;

/**
 *
 * @author USUARIO
 */
public class ArtesMusica extends AbstractDecano {

    @Override
    public String QuienSoy() {
        return "Soy el decano de la Escuela de Artes y Musica";
    }
    
    @Override
    public int gastoMetodo() {
    
        for(int i=0;i<gastosList.size();i++) {
			salario+=gastosList.get(i).gastoMetodo();
		}
		System.out.println("Soy decano y mi reporte de gastos es: "+salario);
		return salario;
    }

    public void ingresarProfesores(){
        AbstractProfesores profe = new Profesores.ArtesMusica();
        AbstractProfesores profe2 = new Profesores.ArtesMusica();
        
        gastosList.add(profe);
        gastosList.add(profe2);
        
    }
}
