package lab4p2_grupo11;

abstract class Movimiento {

    public String nombre;
    public String Descripcion;

    public Movimiento(String nombre, String Descripcion) {
        this.nombre = nombre;
        this.Descripcion = Descripcion;
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
        return "Movimiento{" + "nombre=" + nombre + ", Descripcion=" + Descripcion + '}';
    }
    
    int Ataque(Pokemon pk, Pokemon pk2){   
    
    return 0;
    }
    
    
           
}
