/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cadena;

/**
 *
 * @author hugoa
 */
public class Ordenador extends IAprobador{


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
        Paciente paciente = new Paciente();
        Medico medico = new Medico();
        Enfermero enfermero = new Enfermero();
        this.setNext(paciente);
        paciente.setNext(enfermero);
        enfermero.setNext(medico);
        next.manejoCarpeta(Puesto);
        ruta=next.ruta;
    }

}
