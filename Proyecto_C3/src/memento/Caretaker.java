/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package memento;

import java.util.ArrayList;

/**
 *
 * @author hugoa
 */
public class Caretaker {
 	private ArrayList<Memento> mementos = new ArrayList<>();

	public void addMemento(Memento m) {
		mementos.add(m);
	}

	public Memento getMemento(int index) {
		return mementos.get(index);
	}   

    public ArrayList<Memento> getMementos() {
        return mementos;
    }
        
        
}
