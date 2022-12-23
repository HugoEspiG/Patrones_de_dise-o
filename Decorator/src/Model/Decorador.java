package model;

public abstract class Decorador implements IComponent {

	private IComponent hero;
	
	public Decorador(IComponent hero) {
		this.hero=hero;
	}
	
	@Override
	public void operation() {
		hero.operation();
	}
	
	
}
