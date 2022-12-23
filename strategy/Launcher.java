package strategy;

import java.util.Random;

public class Launcher {

	public static void main(String[] args) {

		Process p = null;
		Random r = new Random();

		for (int i = 0; i < 3; i++) {

			if (r.nextBoolean()) {
				p = new Strategy1();
			} else {
				p = new Strategy2();
			}

			MyAlgorithm my = new MyAlgorithm(p);
			my.execAlgorithm();
			
			System.out.println("----------------");
		}

	}
}
