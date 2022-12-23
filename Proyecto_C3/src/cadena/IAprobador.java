/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cadena;

/**
 *
 * @author hugoa
 */
public abstract class IAprobador {
    public IAprobador next;
    public String ruta;
    public abstract void setNext(IAprobador aprobador);
    public abstract IAprobador getNext();
    public abstract void manejoCarpeta(String puesto);
}
