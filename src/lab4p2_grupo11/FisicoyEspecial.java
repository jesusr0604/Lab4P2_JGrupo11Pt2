package lab4p2_grupo11;

import java.util.Random;

public class FisicoyEspecial extends Movimiento {

    public int PuntosDePoder;
    public int PuntosDePresicion;

    public FisicoyEspecial(int PuntosDePoder, int PuntosDePresicion, String nombre, String Descripcion) {
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
        return "FisicoyEspecial{" + "PuntosDePoder=" + PuntosDePoder + ", PuntosDePresicion=" + PuntosDePresicion + '}';
    }

    @Override
    int Ataque(Pokemon pk, Pokemon pk2) {
        Random random = new Random();
        int numeroAleatorio = random.nextInt(50 - 1 + 1) + 1;
        int daño;
        if (pk.getATK() > pk2.getDEF()) {
            daño = pk.getATK() * 2;
            return daño;

        } else if (pk.getATK() > pk2.getDEF()) {
            daño = (int) (pk.getATK() * 0.5);
            return daño;
        } else {
            return pk.getATK();
        }
    }

}
