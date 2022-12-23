/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Portafolios;

import fabrik.AbstractFactory;
import productoAcciones.AbstractAcciones;
import productoBono.AbstractBonos;
import productoCuenta.AbstractCuenta;

/**
 *
 * @author Labing
 */
public class clientePersonalGrande implements AbstractFactory {

    @Override
    public AbstractCuenta getCuenta() {
        return new productoCuenta.clientePersonalGrande();
    }

    @Override
    public AbstractAcciones getAcciones() {
        return new productoAcciones.clientePersonalGrande();
    }

    @Override
    public AbstractBonos getBonos() {
        return new productoBono.clientePersonalGrande();
    }


}
