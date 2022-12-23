package ArchivoInverso;

import java.util.ArrayList;

/**
 *
 * @author pablo
 */
public class Inverso {

    public ArrayList<String> invertirArchivo(ArrayList<String> archivo) {
        ArrayList<String> archivoAux = new ArrayList<String>();
        int p = archivo.size() - 1;
        
        for (int i = 0; i < archivo.size(); i++) {
            StringBuilder strb = new StringBuilder(archivo.get(p));
            archivoAux.add(strb.reverse().toString());
            p -= 1;
        }

        return archivoAux;
    }

}
