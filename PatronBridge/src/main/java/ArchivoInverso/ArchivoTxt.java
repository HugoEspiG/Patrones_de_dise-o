package ArchivoInverso;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author pablo
 */
public class ArchivoTxt implements InterfaceArchivo {

    @Override
    public ArrayList<String> leerFichero(File fichero) {
        ArrayList<String> lista = new ArrayList();
        FileReader fr = null;
        BufferedReader br;

        try {
            fr = new FileReader(fichero);
            br = new BufferedReader(fr);

            // Lectura del fichero
            String linea;
            while ((linea = br.readLine()) != null) {
                lista.add(linea);
            }
        } catch (IOException e) {
            e.printStackTrace(System.out);
        } finally {
            try {
                if (fr != null) {
                    fr.close();
                }
            } catch (IOException e2) {
                e2.printStackTrace(System.out);
            }
        }
        return lista;
    }

    @Override
    public void crearArchivo(ArrayList<String> contenido) {
        try {
            PrintWriter writer = new PrintWriter("C:\\\\Users\\\\pablo\\\\OneDrive\\\\Documents\\\\AlejoPersonal\\\\universidad\\\\patronesDiseño\\\\PatronBridge\\\\src\\\\main\\\\java\\\\archivos\\\\FicheroReversa.txt", "UTF-8");
            for(int i=0; i<contenido.size();i++){
                writer.println(contenido.get(i));
            }
            writer.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
