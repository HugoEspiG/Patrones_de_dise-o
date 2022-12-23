package model;

public class SentidoAracnido extends Decorador{

	public SentidoAracnido(IComponent hero) {
		super(hero);
	}

	@Override
	public void operation() {
		super.operation();
		System.out.println("TENGO SENTIDO Arácnido");
		
	}

}
