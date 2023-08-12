
package lab4p2_grupo11;

import java.util.ArrayList;


public class Entrenador {
    private String nombre;
    private int edad;
    private double dinero;
    private ArrayList<Pokemon>Pokemon;
    private ArrayList<Pokemon>caja;

    public Entrenador() {
    }

    public Entrenador(String nombre, int edad, double dinero, ArrayList<Pokemon> caja,ArrayList<Pokemon>Pokemon) {
        this.nombre = nombre;
        this.edad = edad;
        this.dinero = dinero;
        this.caja = caja;
        this.Pokemon=Pokemon;
    }

    
    
    /*
    public Entrenador(String nombre, int edad, double dinero) {
        this.nombre = nombre;
        this.edad = edad;
        this.dinero = dinero;
        this.caja= caja;
    }
    
    
    

    public Entrenador(String nombre, int edad, double dinero, Pokemon[] Pokemon) {
        this.nombre = nombre;
        this.edad = edad;
        this.dinero = dinero;
        this.Pokemon = Pokemon;
        this.caja=caja;
        Pokemon e= new Pokemon();
        caja.add(e);

    }
*/

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getDinero() {
        return dinero;
    }

    public void setDinero(double dinero) {
        this.dinero = dinero;
    }

    public ArrayList<Pokemon> getPokemon() {
        return Pokemon;
    }

    public void setPokemon(ArrayList<Pokemon> Pokemon) {
        this.Pokemon = Pokemon;
    }

    

    public ArrayList<Pokemon> getCaja() {
        return caja;
    }

    public void setCaja(ArrayList<Pokemon> caja) {
        this.caja = caja;
                
        
    }

    @Override
    public String toString() {
        return "Entrenador{" + "nombre=" + nombre + ", edad=" + edad + ", dinero=" + dinero + ", Pokemon=" + Pokemon + ", caja=" + caja + '}';
    }

   
    
    
    
}
