package launcherBuilder;

import buiderPattern.ConsejoDirectivoBuilder;
import buiderPattern.IBuilder;
import products.consejoDirectivo;

public class Director {
	

	public consejoDirectivo getConsejoDirectivo() {
		ConsejoDirectivoBuilder cb = new ConsejoDirectivoBuilder();
                cb.reset();
		cb.putRector();
                cb.putRepresentanteDirectorEjecutivo();
                cb.putRepresentanteEstudiantes();
                cb.putRepresentanteExAlumnos();
                cb.putRepresentanteProfesores();
                return cb.getConsejo();
		
	}
	
	

}
