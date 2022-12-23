/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author hugoa
 */
public class InventarioFarmacia {
        private static InventarioFarmacia inventario;
        ArrayList<String> inventarioMedicamento;

    // El constructor es privado, no permite que se genere un constructor por defecto.
    private InventarioFarmacia() {
    inventarioMedicamento=new ArrayList<String>();
    for(int i=0;i<20;i++){
    inventarioMedicamento.add("Acetaminofen");
    inventarioMedicamento.add("Penisilina");
    inventarioMedicamento.add("Naproxeno");
    inventarioMedicamento.add("Ibuprofeno");
        
    }
    }

    public static synchronized InventarioFarmacia getSingletonInstance() {
        if (inventario == null){
            inventario = new InventarioFarmacia();
        }
        
        return inventario;
    }

    public static InventarioFarmacia getInventario() {
        return inventario;
    }

    public static void setInventario(InventarioFarmacia inventario) {
        InventarioFarmacia.inventario = inventario;
    }

    public ArrayList<String> getInventarioMedicamento() {
        return inventarioMedicamento;
    }

    public void setInventarioMedicamento(String s) {
        this.getInventarioMedicamento().add(s);
    }
    
    public void quitarMedicamento(String s){
    if(inventarioMedicamento.contains(s))
    this.inventarioMedicamento.remove(s);
}
    
}
