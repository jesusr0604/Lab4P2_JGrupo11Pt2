package lab4p2_grupo11;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class CYE {

    Entrenador entrenador;
    static Scanner leer = new Scanner(System.in);
    static Random ran = new Random();

    public CYE(Entrenador entrenador) {
        this.entrenador = entrenador;
    }

    public void capturarPokemon(Entrenador entrenador) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa el nombre del nuevo Pokémon: ");
        String nuevoPokemon = scanner.nextLine();
        int lvl = ran.nextInt(999);
        int puntos = ran.nextInt(999);
        int HP = ran.nextInt(999);
        int ATK = ran.nextInt(999);
        int DEF = ran.nextInt(999);
        int SP = ran.nextInt(999);
        System.out.println("Ingrese el especial del Pokemon: ");
        String SPE = leer.next();

        Pokemon pokemonCapturado = new Pokemon(nuevoPokemon, lvl, puntos, HP, ATK, DEF, SP, SPE);

        System.out.print("¿Deseas agregar a " + nuevoPokemon + " al equipo (E) o a la PC (C)? ");
        String opcion = scanner.nextLine().toLowerCase();
        if (opcion.equals("e")) {
            if (entrenador.getPokemon().size() < 5) {
                entrenador.getPokemon().add(pokemonCapturado);
                System.out.println("Pokemon Agregado");

            } else {

                System.out.println("El equipo del entrenador está completo. No se puede capturar más Pokémon.");
                System.out.println("El Pokemon estara en la caja");
                entrenador.getCaja().add(pokemonCapturado);

            }
        } else if (opcion.equals("c")) {
            entrenador.getCaja().add(pokemonCapturado);
            System.out.println("Pokemon ha sido trasladado a la caja");
        } else {
            System.out.println("Opción no válida.");
        }
    }

    public void entrenar(Entrenador entrenador) {
        if (entrenador.getPokemon().size() == 0 && entrenador.getCaja().size() == 0) {
            System.out.println("No tienes Pokémon en tu equipo. ¡Captura algunos antes de entrenar!");
            return;
        } else {
            System.out.println("¿El Pokenon viene en la caja o es principal?");
            String des = leer.next().toLowerCase();
            switch (des) {
                case "caja": {
                    imprimircaja(new ArrayList(entrenador.getCaja()));
                    System.out.println("Que Pokemon desea elegir");
                    int pos2 = leer.nextInt() - 1;
                    Pokemon a = entrenador.getCaja().get(pos2);
                    double multiplicador = ran.nextDouble() * 2;
                    int puntosExperiencia = ran.nextInt(4900) + 100;
                    int experienciaGanada = (int) (puntosExperiencia * multiplicador);
                    int tot= a.getPuntosXP()+experienciaGanada;
                    a.setPuntosXP(tot);
                    System.out.println(a.getEspecie() + " ha ganado " + experienciaGanada + " puntos de experiencia.");

                }
                break;
                case "principal": {
                 imprimirprincipal(new ArrayList(entrenador.getCaja()));
                    System.out.println("Que Pokemon desea elegir");
                    int pos2 = leer.nextInt() - 1;
                    Pokemon a = entrenador.getPokemon().get(pos2);
                    double multiplicador = ran.nextDouble() * 2;
                    int puntosExperiencia = ran.nextInt(4900) + 100;
                    int experienciaGanada = (int) (puntosExperiencia * multiplicador);
                    int tot= a.getPuntosXP()+experienciaGanada;
                    a.setPuntosXP(tot);
                    System.out.println(a.getEspecie() + " ha ganado " + experienciaGanada + " puntos de experiencia.");
                }
                break;
                default: {
                    System.out.println("No Valido");
                    break;
                }
            }
            Random random = new Random();

        }

    }

    public static void imprimirprincipal(ArrayList<Entrenador> t) {

        String no = "";
        for (int i = 0; i < t.size(); i++) {
            no += i + 1 + "." + t.get(i).getPokemon() + "\n";
        }
        System.out.println(no);

    }

    public static void imprimircaja(ArrayList<Entrenador> t) {

        String no = "";
        for (int i = 0; i < t.size(); i++) {
            no += i + 1 + "." + t.get(i).getCaja() + "\n";
        }
        System.out.println(no);

    }
}
