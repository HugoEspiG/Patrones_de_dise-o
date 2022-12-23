package products;

import LauncherCentral.UsuarioAdmon;
import Representantes.RepresentanteDirectorEjecutivo;
import Representantes.RepresentanteEstudiantes;
import Representantes.RepresentanteExAlumnos;
import Representantes.RepresentanteProfesores;

public class consejoDirectivo {

    private RepresentanteDirectorEjecutivo rde = null;
    private RepresentanteEstudiantes re = null;
    private RepresentanteProfesores rp = null;
    private RepresentanteExAlumnos rea = null;
    private UsuarioAdmon r=null;
    
    public String toString() {

        String resultado = "";
        if (rde != null) {
            resultado += "\n"+rde.toString();
        }
        if (re != null) {
            resultado += "\n"+re.toString();
        }
        if (rp != null) {
            resultado += "\n"+rp.toString();
        }
        if (rea != null) {
            resultado += "\n"+rea.toString();
        }if(r!=null){
            resultado +="\n"+r.toString();
        }
        
        return resultado;
    }

    public RepresentanteDirectorEjecutivo getRde() {
        return rde;
    }

    public void setRde(RepresentanteDirectorEjecutivo rde) {
        this.rde = rde;
    }

    public RepresentanteEstudiantes getRe() {
        return re;
    }

    public void setRe(RepresentanteEstudiantes re) {
        this.re = re;
    }

    public RepresentanteProfesores getRp() {
        return rp;
    }

    public void setRp(RepresentanteProfesores rp) {
        this.rp = rp;
    }

    public RepresentanteExAlumnos getRea() {
        return rea;
    }

    public void setRea(RepresentanteExAlumnos rea) {
        this.rea = rea;
    }

    public UsuarioAdmon getR() {
        return r;
    }

    public void setR(UsuarioAdmon r) {
        this.r = r;
    }
    

}
