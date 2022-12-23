package mediador;

public class ComponentB extends ComponentK{

	public ComponentB(Mediador m,String name) {
		super(m,name);
	}

	@Override
	public void enviarMsg(String s) {
		m.getMessage(s, name, 1);
		
	}
	
	public void recibirMsg(String msg, String sender) {
		System.out.println("SOY COMPONENTE B"+name);
		System.out.println(msg);
		System.out.println("De parte de: "+sender);
	}

}
