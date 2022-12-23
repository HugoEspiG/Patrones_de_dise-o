package ArchivoInverso;

import java.io.File;
import java.util.ArrayList;

/**
 *
 * @author pablo
 */
public interface InterfaceArchivo {
    
    public ArrayList<String> leerFichero(File fichero);
    public void crearArchivo(ArrayList<String> contenido);

}
