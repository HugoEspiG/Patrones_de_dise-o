/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.Random;

/**
 *
 * @author juanp
 */
public class FlyweightFactory {
    
    private static Flyweight[] fw = new Flyweight[10];
            
            
    public static Flyweight getFlyweight(int i){
        if(fw[i]==null){
            fw[i]=new Flyweight("C:\\Users\\hugoa\\OneDrive\\Documents\\NetBeansProjects\\estrelllaFlyweith\\src\\Imagenes\\persona"+i+".jpg");
        }
        return fw[i];
    }
}
