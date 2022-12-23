package model;

public class SuperFuerza extends Decorador{

	public SuperFuerza(IComponent hero) {
		super(hero);
	}

	@Override
	public void operation() {
		super.operation();
		System.out.println("TENGO súper fuerza");
		comportamientoAnadido();
		
	}
	
	public void comportamientoAnadido() {
		System.out.println("cimpirtimiinti inididi");
	}

}
