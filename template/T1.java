package template;

public class T1 extends Algorithm{

	@Override
	public void step1() {
		otroMetodo();
		System.out.println("En t1, este es el paso 1");
		
	}

	@Override
	public void step3() {
		System.out.println("En t1, este es el paso 3");
		
	}
	
	private void otroMetodo() {
		System.out.println("esto hace parte de la clase t1");
	}

}
