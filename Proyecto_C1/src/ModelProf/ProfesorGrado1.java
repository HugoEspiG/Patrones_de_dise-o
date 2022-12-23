/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModelProf;

import java.util.Random;

/**
 *
 * @author hugoa
 */
public class ProfesorGrado1 extends DecoratorProf {

    public ProfesorGrado1(IComponentProf profesor) {
        super(profesor);
    }

    @Override
    public void operation() {
        super.operation();
        System.out.println("    especializacion");
    }

}
