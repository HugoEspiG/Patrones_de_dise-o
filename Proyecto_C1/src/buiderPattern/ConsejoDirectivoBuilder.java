package buiderPattern;

import LauncherCentral.UsuarioAdmon;
import Representantes.RepresentanteDirectorEjecutivo;
import Representantes.RepresentanteEstudiantes;
import Representantes.RepresentanteExAlumnos;
import Representantes.RepresentanteProfesores;
import products.consejoDirectivo;



public class ConsejoDirectivoBuilder implements IBuilderConsejoDirectivo{

	private consejoDirectivo ConsejoDirectivo;
	
	public void reset() {
		ConsejoDirectivo=new consejoDirectivo();
	}
	

    @Override
    public void putRepresentanteDirectorEjecutivo() {
        ConsejoDirectivo.setRde(new RepresentanteDirectorEjecutivo("Juan", "Pablo", 1001083566, 22));
    }

    @Override
    public void putRepresentanteEstudiantes() {
        ConsejoDirectivo.setRe(new RepresentanteEstudiantes("David", "Zarate", 404505400, 19, 10));
    }

    @Override
    public void putRepresentanteExAlumnos() {
        ConsejoDirectivo.setRea(new RepresentanteExAlumnos("Juan", "Caicedo", 101021454, 22));
    }

    @Override
    public void putRepresentanteProfesores() {
        ConsejoDirectivo.setRp(new RepresentanteProfesores("Juan", "Leyva", 79252391, 18, 5));
    }

    @Override
    public void putRector() {
        ConsejoDirectivo.setR(UsuarioAdmon.getSingletonInstance("Rector", "Rector123"));    
    }
    
    public consejoDirectivo getConsejo(){
        return this.ConsejoDirectivo;
    }

}
