/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LauncherCentral;

import Escuelas.AdminMarketing;
import Escuelas.ArtesMusica;
import Escuelas.CienciasComunicacion;
import Escuelas.CienciasExactas;
import Escuelas.Deporte;
import Escuelas.Economia;
import Escuelas.FilosofiaHumanidades;
import Escuelas.Historia;
import Escuelas.MayorDerecho;
import Escuelas.PoliticaRelaciones;
import Escuelas.Publicidad;
import Estudiantes.AbstractEstudiantes;
import Profesores.AbstractProfesores;
import fabrik.AbstractFactory;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import javax.swing.JOptionPane;
import launcherBuilder.Director;
import products.consejoDirectivo;
import Egresos.*;

/**
 *
 * @author hugoa
 */
public class Inicio {

    ArrayList<AbstractProfesores> auxProf = null;
    ArrayList<AbstractEstudiantes> auxEst = null;
    private static Matricula matricula;

    public static void main(String[] args) {
        Inicio in = new Inicio();
        Usuario s = new Usuario(JOptionPane.showInputDialog(null, "Ingerese Usuario: "), JOptionPane.showInputDialog(null, "Ingerese Contraseña: "));
        Logica l = new Logica(s);

        l.agUser();
        if (l.logAdmon()) {
            in.menuAdmin();
        } else if (l.logUser()) {

            System.out.println("Bienvenido " + s.getUsuario());
        } else {
            System.out.println("Usuario no valido");
        }

    }

    public void menuAdmin() {
        int op = 0;
        boolean salir = false;
        String[] opcion = {"Revisar una facultad", "Reunir consejo", "Revisar los gastos mensuales", "Realizaar pago matricula", "Salir"};
        //Scanner sc = new Scanner(System.in);
        while (!salir) {
            op = JOptionPane.showOptionDialog(null, "Seleccione una opcion", "Bienvenido Administrador", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, opcion, opcion[0]);
            switch (op) {
                case 0:
                    genEscuelas();
                    break;
                case 1:
                    Director d = new Director();
                    consejoDirectivo a = d.getConsejoDirectivo();
                    System.out.println("El consejo directivo esta conformado por: ");
                    System.out.println(a.toString());
                    break;

                case 2:
                    revisarGastos();
                    break;
                case 3:
                    int i = 0;
                    String opciones[] = {"1", "2", "3", "4"};
                    i = JOptionPane.showOptionDialog(null, "1. Pregrado\n2.Posgrado\n3.Maestria\n4.Cancelar", "Selector de opciones",
                            JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);
                    switch (i) {
                        case 0:
                            matricula = new Pregrado();
                            matricula.realizarPago();
                            break;
                        case 1:
                            matricula = new Posgrado();
                            matricula.realizarPago();
                            break;
                        case 2:
                            matricula = new Maestria();
                            matricula.realizarPago();
                            break;
                        case 3:
                            break;

                    }
                    break;
                case 4:
                    System.out.println("Saliendo del programa");
                    salir = true;

            }
        }
    }

    public void genEscuelas() {
        String respuesta = null;
        AbstractFactory Escuelas = null;
        String[] EscuelasPos = {
            "Escuela Mayor de Derecho",
            "Escuela de Ciencias Exactas e Ingenieria",
            "Escuela de Ciencias de la Comunicacion",
            "Escuela de Economia",
            "Escuela Internacional de Administracion y Marketing",
            "Escuela de Psicologia",
            "Escuela de Politica y Relaciones Internacionales",
            "Escuela de Publicidad",
            "Escuela del Deporte",
            "Escuela de Filosofia y Humanidades",
            "Escuela de Historia",
            "Escuela de Artes y Musica"
        };
        respuesta = (String) JOptionPane.showInputDialog(null, "Ingrese la escuela que desee: ", "Escuela", JOptionPane.DEFAULT_OPTION, null, EscuelasPos, EscuelasPos[0]);
        if (respuesta.equals("Escuela Mayor de Derecho")) {
            Escuelas = new MayorDerecho();
        } else if (respuesta.equals("Escuela de Ciencias Exactas e Ingenieria")) {
            Escuelas = new CienciasExactas();
        } else if (respuesta.equals("Escuela de Ciencias de la Comunicacion")) {
            Escuelas = new CienciasComunicacion();
        } else if (respuesta.equals("Escuela de Economia")) {
            Escuelas = new Economia();
        } else if (respuesta.equals("Escuela Internacional de Administracion y Marketing")) {
            Escuelas = new AdminMarketing();
        } else if (respuesta.equals("Escuela de Politica y Relaciones Internacionales")) {
            Escuelas = new PoliticaRelaciones();
        } else if (respuesta.equals("Escuela de Publicidad")) {
            Escuelas = new Publicidad();
        } else if (respuesta.equals("Escuela del Deporte")) {
            Escuelas = new Deporte();
        } else if (respuesta.equals("Escuela de Filosofia y Humanidades")) {
            Escuelas = new FilosofiaHumanidades();
        } else if (respuesta.equals("Escuela de Historia")) {
            Escuelas = new Historia();
        } else if (respuesta.equals("Escuela de Artes y Musica")) {
            Escuelas = new ArtesMusica();
        }

        System.out.println(Escuelas.getDecano().QuienSoy());
        Random r = new Random();
        for (AbstractProfesores a : Escuelas.getProfesores(r.nextInt(20))) {
            r = new Random();
            a.QuienSoy(r.nextInt(4));
        }
        for (AbstractEstudiantes a : Escuelas.getEstudiantes(20 + r.nextInt(300))) {
            System.out.println(a.QuienSoy());
        }
        return;
    }

    public void revisarGastos() {
        String respuesta = null;
        AbstractFactory escuela = null;
        int aux = 0;
        String[] EscuelasPos = {
            "Escuela Mayor de Derecho",
            "Escuela de Ciencias Exactas e Ingenieria",
            "Escuela de Ciencias de la Comunicacion",
            "Escuela de Economia",
            "Escuela Internacional de Administracion y Marketing",
            "Escuela de Psicologia",
            "Escuela de Politica y Relaciones Internacionales",
            "Escuela de Publicidad",
            "Escuela del Deporte",
            "Escuela de Filosofia y Humanidades",
            "Escuela de Historia",
            "Escuela de Artes y Musica",
            "Total de toda la universidad"
        };

        respuesta = (String) JOptionPane.showInputDialog(null, "Ingrese la escuela que desee: ", "Escuela", JOptionPane.DEFAULT_OPTION, null, EscuelasPos, EscuelasPos[0]);
        if (respuesta.equals("Escuela Mayor de Derecho")) {
            escuela = new Escuelas.MayorDerecho();
            escuela.getDecano().ingresarProfesores();
        } else if (respuesta.equals("Escuela de Ciencias Exactas e Ingenieria")) {
            escuela = new Escuelas.CienciasExactas();
            escuela.getDecano().ingresarProfesores();
        } else if (respuesta.equals("Escuela de Ciencias de la Comunicacion")) {
            escuela = new Escuelas.AdminMarketing();
            escuela.getDecano().ingresarProfesores();
        } else if (respuesta.equals("Escuela de Economia")) {
            escuela = new Escuelas.CienciasComunicacion();
            escuela.getDecano().ingresarProfesores();
        } else if (respuesta.equals("Escuela Internacional de Administracion y Marketing")) {
            escuela = new Escuelas.Economia();
            escuela.getDecano().ingresarProfesores();
        } else if (respuesta.equals("Escuela de Politica y Relaciones Internacionales")) {
            escuela = new Escuelas.PoliticaRelaciones();
            escuela.getDecano().ingresarProfesores();
        } else if (respuesta.equals("Escuela de Publicidad")) {
            escuela = new Escuelas.Publicidad();
            escuela.getDecano().ingresarProfesores();
        } else if (respuesta.equals("Escuela del Deporte")) {
            escuela = new Escuelas.Deporte();
            escuela.getDecano().ingresarProfesores();
        } else if (respuesta.equals("Escuela de Filosofia y Humanidades")) {
            escuela = new Escuelas.FilosofiaHumanidades();
            escuela.getDecano().ingresarProfesores();
        } else if (respuesta.equals("Escuela de Historia")) {
            escuela = new Escuelas.Historia();
            escuela.getDecano().ingresarProfesores();
        } else if (respuesta.equals("Escuela de Artes y Musica")) {
            escuela = new Escuelas.ArtesMusica();
            escuela.getDecano().ingresarProfesores();
        } else if (respuesta.equals("Total de toda la universidad")) {
            aux = 1;
            GastosDivision gastosTotales = new GastosDivision();

            gastosTotales.gastosList.add(escuela = new Escuelas.MayorDerecho());
            escuela.getDecano().ingresarProfesores();
            gastosTotales.gastosList.add(escuela = new Escuelas.AdminMarketing());
            escuela.getDecano().ingresarProfesores();
            gastosTotales.gastosList.add(escuela = new Escuelas.ArtesMusica());
            escuela.getDecano().ingresarProfesores();
            gastosTotales.gastosList.add(escuela = new Escuelas.CienciasComunicacion());
            escuela.getDecano().ingresarProfesores();
            gastosTotales.gastosList.add(escuela = new Escuelas.CienciasExactas());
            escuela.getDecano().ingresarProfesores();
            gastosTotales.gastosList.add(escuela = new Escuelas.Deporte());
            escuela.getDecano().ingresarProfesores();
            gastosTotales.gastosList.add(escuela = new Escuelas.Economia());
            escuela.getDecano().ingresarProfesores();
            gastosTotales.gastosList.add(escuela = new Escuelas.FilosofiaHumanidades());
            escuela.getDecano().ingresarProfesores();
            gastosTotales.gastosList.add(escuela = new Escuelas.Historia());
            escuela.getDecano().ingresarProfesores();
            gastosTotales.gastosList.add(escuela = new Escuelas.Moda());
            escuela.getDecano().ingresarProfesores();
            gastosTotales.gastosList.add(escuela = new Escuelas.PoliticaRelaciones());
            escuela.getDecano().ingresarProfesores();
            gastosTotales.gastosList.add(escuela = new Escuelas.Psicologia());
            escuela.getDecano().ingresarProfesores();
            gastosTotales.gastosList.add(escuela = new Escuelas.Publicidad());
            escuela.getDecano().ingresarProfesores();
            
            System.out.println("el valor total de gastos en la universidad es de: " + gastosTotales.gastoMetodo());
        }
        if (aux != 1) {
            System.out.println("el valor total de la escuela de " + escuela.getClass().getName() + "es de: " + escuela.gastoMetodo());
        }

    }

}
