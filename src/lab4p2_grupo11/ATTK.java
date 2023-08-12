package lab4p2_grupo11;

import static java.lang.Math.random;
import java.util.Random;

public class ATTK extends Movimiento {

    public int PuntosDePoder;
    public int PuntosDePresicion;

    public ATTK(int PuntosDePoder, int PuntosDePresicion, String nombre, String Descripcion) {
        super(nombre, Descripcion);
        this.PuntosDePoder = PuntosDePoder;
        this.PuntosDePresicion = PuntosDePresicion;
    }

    public int getPuntosDePoder() {
        return PuntosDePoder;
    }

    public void setPuntosDePoder(int PuntosDePoder) {
        this.PuntosDePoder = PuntosDePoder;
    }

    public int getPuntosDePresicion() {
        return PuntosDePresicion;
    }

    public void setPuntosDePresicion(int PuntosDePresicion) {
        this.PuntosDePresicion = PuntosDePresicion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    @Override
    public String toString() {
        return "ATTK{" + "PuntosDePoder=" + PuntosDePoder + ", PuntosDePresicion=" + PuntosDePresicion + '}';
    }

    int Ataque(Pokemon pk, Pokemon pk2) {
        Random random = new Random();
        int numeroAleatorio = random.nextInt(50 - 1 + 1) + 1;
        int numeroAleatorio2 = random.nextInt(500 - 100 + 1) + 100;
        int suma= pk.getSP()+pk2.getSP();
        
        if (suma== numeroAleatorio2) {
            numeroAleatorio=numeroAleatorio*2;
        }
        return numeroAleatorio;
    }

}
