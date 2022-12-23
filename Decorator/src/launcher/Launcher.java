package launcher;

import model.*;

public class Launcher {
	
	public static void main(String[] args) {
		IComponent heroe=new SuperFuerza(new Hero());
		
		heroe.operation();
		
		
		
		
	}

}
