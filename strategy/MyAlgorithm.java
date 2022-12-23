package strategy;

public class MyAlgorithm {

	private Process p=null;
	
	public MyAlgorithm(Process p) {
		this.p=p;
	}
	
	
	public void execAlgorithm() {
		p.step1();
		p.step2();
		p.step3();
		p.step4();
	}

	public Process getP() {
		return p;
	}

	public void setP(Process p) {
		this.p = p;
	}
	
	
	
}
