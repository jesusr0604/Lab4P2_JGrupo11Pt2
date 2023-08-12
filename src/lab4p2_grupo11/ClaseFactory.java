package lab4p2_grupo11;

import java.util.ArrayList;
import java.util.Arrays;
import static lab4p2_grupo11.Lab4P2_Grupo11.leer;

public class ClaseFactory {

    public ArrayList<Entrenador> PocketTrainers = new ArrayList();

    public ClaseFactory(ArrayList<Entrenador> PocketTrainers) {

    }

    public Pokemon poke(Entrenador entre) {
        ArrayList<Pokemon> pol = entre.getPokemon();
        for (int i = 0; i < pol.size(); i++) {
            System.out.println(i + "." + pol.get(i).getEspecie());
        }
        System.out.println("Ingrese el numero del pokemon que desea ");
        int pos = leer.nextInt();
        if (pos > 0 && pos < 7) {
            Pokemon elec = pol.get(pos);
            return elec;
        } else {
            return poke(entre);
        }
    }

    public ArrayList<Entrenador> Recurr1(ArrayList<Entrenador> PocketTrainers) {
        if (PocketTrainers.get(0).getPokemon().isEmpty() || PocketTrainers.get(1).getPokemon().isEmpty()) {
            return PocketTrainers;

        } else {
            Entrenador Entrenador1 = PocketTrainers.get(0);
            Entrenador Entrenador2 = PocketTrainers.get(1);
            Pokemon elec = poke(Entrenador1);
            Pokemon elec2 = poke(Entrenador2);

            int cos = Batalla(elec, elec2);

        }

    }

    public int Batalla(Pokemon one, Pokemon tu) {
        if (one.getSP() > tu.getSP()) {

        }else{
            
        }
        
    }

    public Movimiento Selecc(Pokemon entre) {
       
        for (int i = 0; i < entre.getNumeros().length-1; i++) {
            System.out.println(i + "." + entre.getNumeros();
        }
        System.out.println("Ingrese el numero del movimiento que desea ");
        int pos = leer.nextInt();
        if (pos > 0 && pos < 7) {
            
            return elec;
        } else {
            return poke(entre);
        }
    }
}
