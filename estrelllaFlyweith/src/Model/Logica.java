/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Valentina
 */
public class Logica {

    MiVentana v;
    ArrayList<Persona> ar = new ArrayList<>();
    ArrayList<Persona> aux = new ArrayList<>();
    Random r;
    int contadorID=0,CD=0,CI=0,CAR=0,CAB=0;
    
    public Logica(MiVentana v) {
        this.v = v;
    }

    public void pintarP() {
        for (int i = 0; i < 250; i++) {
            r = new Random();
            ar.add(new Persona(contadorID, r.nextInt(600), r.nextInt(600), 50, 50));
        contadorID++;
        }
        v.getMiPanel().setPersonas(ar);
        v.getMiPanel().repaint();
    }

    public void pintarD() {
        CD++;
        for (Persona p : ar) {
            p.setX(p.getX() + 50);

        }
        if(CD>CI){
        for (int i = 0; i < 15; i++) {
            ar.add(new Persona(contadorID,r.nextInt(50), r.nextInt(600), 50, 50));
            contadorID++;
        }
        }
        v.getMiPanel().setPersonas(ar);
        v.getMiPanel().repaint();

    }
    public void pintarI() {
        CI++;
        for (Persona p : ar) {
            p.setX(p.getX() - 50);

        }
        if(CI>CD){
        for (int i = 0; i < 15; i++) {
            ar.add(new Persona(contadorID,550+r.nextInt(50), r.nextInt(600), 50, 50));
            contadorID++;
        }
        }
        v.getMiPanel().setPersonas(ar);
        v.getMiPanel().repaint();

    }
    public void pintarAB() {
        CAB++;
        for (Persona p : ar) {
            p.setY(p.getY() + 50);

        }
        if(CAB>CAR){
        for (int i = 0; i < 15; i++) {
            ar.add(new Persona(contadorID,r.nextInt(600), r.nextInt(50), 50, 50));
            contadorID++;
        }
        }
        v.getMiPanel().setPersonas(ar);
        v.getMiPanel().repaint();

    }
    public void pintarAR() {
        CAR++;
        for (Persona p : ar) {
            p.setY(p.getY()-50);

        }
        if(CAR>CAB){
        for (int i = 0; i < 15; i++) {
            ar.add(new Persona(contadorID,r.nextInt(600), 550+r.nextInt(50), 50, 50));
            contadorID++;
        }
        }
        v.getMiPanel().setPersonas(ar);
        v.getMiPanel().repaint();

    }
}
