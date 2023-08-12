package lab4p2_grupo11;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;
import java.awt.Color;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.swing.JColorChooser;

public class Lab4P2_Grupo11 {

    static Scanner leer = new Scanner(System.in);
    static Random ran = new Random();

    public static void main(String[] args) {
        ArrayList<Entrenador> trainer = new ArrayList();
        int res = 0;
        do {
            System.out.println("----- Bienvenido al Sistema Pokemon -----"
                    + "\n1 -> Registrar entrenador "
                    + "\n2 -> Battle Factory "
                    + "\n3 ->  Capturar/Entrenar"
                    + "\n4 ->  Añadir Movimiento"
                    + "\n0-> Salir"
                    + "\nIngrese la opcion que desea:");

            res = leer.nextInt();
            switch (res) {
                case 1: {
                    System.out.println("Ingrese su nombre: ");
                    String nombre = leer.next();
                    System.out.println("Ingrese su Edad: ");
                    int edad = leer.nextInt();

                    double dinero = 0;
                    do {
                        System.out.println("Ingrese cuanto dinero tiene: ");
                        dinero = leer.nextDouble();
                    } while (dinero < 1);
                    ArrayList<Pokemon>caja = new ArrayList();
                     ArrayList<Pokemon>Pokemon = new ArrayList();
                    Entrenador T = new Entrenador(nombre, edad, dinero, caja,Pokemon);
                    trainer.add(T);
                    

                }
                break;
                case 2: {

                }
                break;
                case 3: {

                    System.out.println("¿Desea Entrenar o Capturar?");
                    String resp = leer.next().toLowerCase();
                    switch (resp) {
                        case "entrenar": {
                            if (trainer.isEmpty()) {
                                System.out.println("No hay Entrenadores");
                            } else {
                                imprimirtrainer(trainer);
                                System.out.println("\n Seleccione el entrenador que desea: ");
                                int pos = leer.nextInt() - 1;
                                Entrenador cons = trainer.get(pos);
//                                System.out.println(cons + "\n ¿Desea ir a la caja o los  principales?");
//                                String des = leer.next().toLowerCase();
                                CYE e = new CYE(cons);
                                e.entrenar(cons);
//                                switch (des) {
//                                    case "caja": {
//                                        imprimircaja(trainer);
//                                        System.out.println("Que Pokemon desea elegir");
//                                        int pos2 = leer.nextInt()-1;
//                                         trainer.get(pos).getCaja().get(pos2);
//                                         Pokemon a=  trainer.get(pos).getCaja().get(pos2);
//                                        
//
//                                    }
//                                    break;
//                                    case "principales": {
//                                        imprimirprincipal(trainer);
//                                        System.out.println("Que Pokemon desea elegir");
//                                        int pos2 = leer.nextInt()-1;
//                                        trainer.get(pos).getPokemon();
//                                    }
//                                    break;
//                                    default: {
//                                        System.out.println("No Valido");
//                                    }
//                                    break;
//                                }

                            }
                        }
                        break;
                        case "capturar": {
                            if (trainer.isEmpty()) {
                                System.out.println("No hay Entrenadores");
                            } else {
                                imprimirtrainer(trainer);
                                System.out.println("\n Seleccione el entrenador que desea: ");
                                int pos = leer.nextInt() - 1;
                                Entrenador cons = trainer.get(pos);
                                CYE e = new CYE(cons);
                                e.capturarPokemon(cons);
                            }
                        }
                        break;
                    }

                }
                break;
                case 4: {

                }
                break;
                case 0: {
                    System.out.println("Adios...");
                }
                break;
                default: {
                    System.out.println("No Valido");
                }
                break;
            }
        } while (res != 0);
    }

    public static void imprimirtrainer(ArrayList<Entrenador> t) {

        String no = "";
        for (int i = 0; i < t.size(); i++) {
            no += i + 1 + "." + t.get(i).toString() + "\n";
        }
        System.out.println(no);

    }

    public static void imprimirprincipal(ArrayList<Entrenador> t) {

        String no = "";
        for (int i = 0; i < t.size(); i++) {
            no += i + 1 + "." + t.get(i).getPokemon().toString() + "\n";
        }
        System.out.println(no);

    }

    public static void imprimircaja(ArrayList<Entrenador> t) {

        String no = "";
        for (int i = 0; i < t.size(); i++) {
            no += i + 1 + "." + t.get(i).getCaja().toString() + "\n";
        }
        System.out.println(no);

    }
}
