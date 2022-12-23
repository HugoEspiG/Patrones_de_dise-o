package mediador;

public class Launcher {
	
	public static void main(String[] arg) {
		
		Mediador m=new Mediador();
		
		ComponentB cb=new ComponentB(m,"1");
		
		ComponentA ca=new ComponentA(m,"2");

		ComponentA ca1=new ComponentA(m,"3");
		
		
		ca1.enviarMsg("Se terminó la clase!");
		
	}

}
