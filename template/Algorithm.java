package template;

public abstract class Algorithm {
	
	
	public void templateMethod() {
		
		step1();
		step2();
		step3();
		step4();
		
	}

	
	public abstract void step1();
	public abstract void step3();
	
	private void step2(){
		System.out.println("This is step 2");
	}
	
	private void step4(){
		System.out.println("This is step 4");
	}
	
}
