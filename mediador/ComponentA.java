package mediador;

public class ComponentA extends ComponentK{

	public ComponentA(Mediador m,String name) {
		super(m,name);
	}


	@Override
	public void enviarMsg(String s) {
		m.getMessage(s, name, 0);
		
	}
	
	public void recibirMsg(String msg, String sender) {
		
		System.out.println("SOY COMPONENTE A "+name);
		System.out.println(msg);
		System.out.println("De parte de: "+sender);
	}

}
