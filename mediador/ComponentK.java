package mediador;

public abstract class ComponentK {
	
	Mediador m;
	String name;
	
	public ComponentK(Mediador m,String name) {
		this.m=m;
		this.m.componentes.add(this);
		this.name=name;
	}
	
	public abstract void enviarMsg(String s);
	
	public void recibirMsg(String msg, String sender) {
		System.out.println(msg);
		System.out.println("De parte de: "+sender);
	}

}
