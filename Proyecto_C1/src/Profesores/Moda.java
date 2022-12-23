/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Profesores;

import ModelProf.IComponentProf;
import ModelProf.ProfesorGrado1;
import ModelProf.ProfesorGrado2;
import ModelProf.ProfesorGrado3;
import ModelProf.ProfesorN;

/**
 *
 * @author USUARIO
 */
public class Moda extends AbstractProfesores {

    @Override
    public void QuienSoy(int i) {
        String s="\nProfesor de: "+Moda.class.getName();
        IComponentProf prof = new ProfesorN();
        switch (i){
            case 1:
                 prof=new ProfesorN();       
                 break;
            case 2:
                 prof=new ProfesorGrado1(new ProfesorN());       
                 break;
            case 3:
                 prof=new ProfesorGrado2(new ProfesorGrado1(new ProfesorN()));       
                 break;
            case 4:
                 prof= new ProfesorGrado3(new ProfesorGrado2(new ProfesorGrado1(new ProfesorN())));    
                 break;
        }
        System.out.println(s);
        prof.operation();
        
    }
    
    @Override
    public int gastoMetodo() {
    
        return salario;
    }
    

}
