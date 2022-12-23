/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cadena;

/**
 *
 * @author hugoa
 */
public class Paciente extends IAprobador{

    @Override
    public void setNext(IAprobador aprobador) {
       next =aprobador;
    }

    @Override
    public IAprobador getNext() {
        return next;
    }

    @Override
    public void manejoCarpeta(String Puesto) {

        if(Puesto.equals("Paciente")){
           ruta=Puesto;
        }else{
            next.manejoCarpeta(Puesto);
            ruta=next.ruta;
        }
    }
}
