/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package memento;

import java.io.File;

/**
 *
 * @author hugoa
 */
public class Originator {
        private File estado;
        
	public void setEstado(File estado) {
		this.estado = estado;
	}

	public File getEstado() {
		return estado;
	}

	public Memento guardar() {
		return new Memento(estado);
	}

	public void restaurar(Memento m) {
		this.estado = m.getEstado();
	}
}
