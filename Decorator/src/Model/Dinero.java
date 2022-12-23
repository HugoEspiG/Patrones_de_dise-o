package model;

public class Dinero extends Decorador{

	public Dinero(IComponent hero) {
		super(hero);
	}

	@Override
	public void operation() {
		super.operation();
		System.out.println("TENGO mucho dinero!!$$$$$$");
		
	}

}
