/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fabrik;

import productoAcciones.AbstractAcciones;
import productoBono.AbstractBonos;
import productoCuenta.AbstractCuenta;



/**
 *
 * @author Labing
 */
public interface AbstractFactory  {
    public AbstractCuenta getCuenta();
    public AbstractAcciones getAcciones();
    public AbstractBonos getBonos();
}
