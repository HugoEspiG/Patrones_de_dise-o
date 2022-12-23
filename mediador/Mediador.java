package mediador;

import java.util.ArrayList;

public class Mediador {

	ArrayList<ComponentK> componentes = new ArrayList<ComponentK>();

	public void getMessage(String msg, String sender, int destiny) {

		for (int i = 0; i < componentes.size(); i++) {

			componentes.get(i).recibirMsg(msg, sender);
		}

	}

}
