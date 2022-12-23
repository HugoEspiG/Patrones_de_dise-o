/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import AbstractFac.AbstractFactory;
import Areas.MedicinaInterna;
import Areas.Pediatria;
import Areas.Reumatologia;
import Doctores.AbstractDoctores;
import Enfermeros.AbstractEnfermeros;
import buiderPattern.FormulaBuilder;
import buiderPattern.IBuilder;
import java.util.Random;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author hugoa
 */
public class Launcher {

    public static void main(String[] args) {
        Launcher l= new Launcher();
        l.menuAdmin();
    }

    public void menuAdmin() {
        int op = 0;
        boolean salir = false;
        InventarioFarmacia inv = InventarioFarmacia.getSingletonInstance();
        Scanner sc = new Scanner(System.in);

        System.out.println("-------Bienvenido-------");
        System.out.println("----------Menu----------");
        System.out.println("1. Ver empleados en algun Area");
        System.out.println("2. Generar formula");
        System.out.println("3. Revisar inventario");
        System.out.println("4. Añadir al inventario");
        System.out.println("5. Eliminar del inventario");
        System.out.println("Salir");

        while (!salir) {

            System.out.print("\nIngrese una opcion - > ");
            op = sc.nextInt();
            switch (op) {
                case 1:
                    verAreas();
                    break;

                case 2:
                    FormulaBuilder form = new FormulaBuilder();
                    form.reset();
                    int r;
                    r=JOptionPane.showConfirmDialog(null, "Necesita Acetaminofen: ","Ingrese respuesta",JOptionPane.YES_NO_OPTION);
                    if(r==0){
                        form.putAcetaminofen();
                        inv.quitarMedicamento("Acetaminofen");
                    }
                    r=JOptionPane.showConfirmDialog(null, "Necesita Penisilina: ","Ingrese respuesta",JOptionPane.YES_NO_OPTION);
                    if(r==0){
                        form.putPenisilina();
                        inv.quitarMedicamento("Penisilina");
                    }
                    r=JOptionPane.showConfirmDialog(null, "Necesita Ibuprofeno: ","Ingrese respuesta",JOptionPane.YES_NO_OPTION);
                    if(r==0){
                        form.putIbuprofeno();
                        inv.quitarMedicamento("Ibuprofeno");
                    }
                    r=JOptionPane.showConfirmDialog(null, "Necesita Naproxeno: ","Ingrese respuesta",JOptionPane.YES_NO_OPTION);
                    if(r==0){
                        form.putNaproxeno();
                        inv.quitarMedicamento("Naproxeno");
                    }
                    System.out.println("Formula: \n"+form.getFormula().toString());
                    break;

                case 3:
                    for(String s:inv.getInventarioMedicamento()){
                        System.out.println(s);
                    }
                    break;
                case 4:
                    inv.setInventarioMedicamento(JOptionPane.showInputDialog(null, "nuevo al inventario: "));
                    break;
                case 5:
                    inv.quitarMedicamento(JOptionPane.showInputDialog(null, "Quitar del inventario: "));
                    break;
                case 6:
                    System.out.println("Saliendo del programa");
                    salir = true;

            }
        }
    }
    
        public void verAreas(){
         String respuesta = null;
        AbstractFactory Escuelas = null;
        String[] EscuelasPos = {
            "Medicina Interna",
            "Pediatria",
            "Reumatologia",
        };
        respuesta = (String) JOptionPane.showInputDialog(null, "Ingrese el Area que desee: ", "Areas", JOptionPane.DEFAULT_OPTION, null, EscuelasPos, EscuelasPos[0]);
        if (respuesta.equals("Medicina Interna")) {
            Escuelas = new MedicinaInterna();
        } else if (respuesta.equals("Pediatria")) {
            Escuelas = new Pediatria();
        } else if (respuesta.equals("Reumatologia")) {
            Escuelas = new Reumatologia();
        }

        Random r=new Random();
        
        for(AbstractDoctores a:Escuelas.getDoctores(r.nextInt(10))){
            System.out.println(a.QuienSoy());
        }
            System.out.println("");
        for(AbstractEnfermeros a:Escuelas.getEnfermeros(10+r.nextInt(30))){
            System.out.println(a.QuienSoy());       
        }

        
    }

}
