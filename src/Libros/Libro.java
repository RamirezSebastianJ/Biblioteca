
package Libros;


public abstract class Libro {
    String nombre;
    int ejemplares;
    String autor;
    

    public Libro(String nombre, int ejemplares, String autor) {
        this.nombre = nombre;
        this.ejemplares = ejemplares;
        this.autor = autor;
    }
    
    
    public abstract void getFechaReserva(int fechaReserva);
    public abstract void getFechaEntrega(int fechaEntrega);

    public String getNombre() {
        return nombre;
    }

    public int getEjemplares() {
        return ejemplares;
    }

    public String getAutor() {
        return autor;
    }

    public void setEjemplares(int ejemplares) {
        this.ejemplares = ejemplares;
    }
    

    
}
