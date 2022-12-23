package ArchivoInverso;

import java.io.File;
import java.util.ArrayList;

/**
 *
 * @author pablo
 */
public class Main {
    
    public static void main(String[] args) {
        InterfaceArchivo archivo = new ArchivoTxt();
        File doc = new File("C:\\Users\\pablo\\OneDrive\\Documents\\AlejoPersonal\\universidad\\patronesDiseño\\PatronBridge\\src\\main\\java\\archivos\\Fichero.txt");
        ArrayList<String> aux = archivo.leerFichero(doc);
        System.out.println("ARCHIVO AL DERECHO");
        System.out.println(aux);
        Inverso invertir = new Inverso();
        ArrayList<String> auxInvertido = invertir.invertirArchivo(aux);
        System.out.println("ARCHIVO INVERTIDO");
        System.out.println(auxInvertido);
        archivo.crearArchivo(auxInvertido);
        
        archivo = new ArchivoBin();
        File doc2 = new File("C:\\Users\\pablo\\OneDrive\\Documents\\AlejoPersonal\\universidad\\patronesDiseño\\PatronBridge\\src\\main\\java\\archivos\\Fichero.bin");
        ArrayList<String> aux2 = archivo.leerFichero(doc2);
        System.out.println("ARCHIVO AL DERECHO");
        System.out.println(aux2);
        ArrayList<String> auxInvertido2 = invertir.invertirArchivo(aux2);
        System.out.println("ARCHIVO INVERTIDO");
        System.out.println(auxInvertido2);
        archivo.crearArchivo(auxInvertido2);
    }
    
}
