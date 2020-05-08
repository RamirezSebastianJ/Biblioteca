
package Libros;

import java.util.Date;


public abstract class Libro {
    String nombre;
    int ejemplares;
    String autor;
    

    public Libro(String nombre, int ejemplares, String autor) {
        this.nombre = nombre;
        this.ejemplares = ejemplares;
        this.autor = autor;
    }
    
    
    public abstract void setFechaReserva(Date fechaReserva);
    public abstract void setFechaEntrega(Date fechaEntrega);
    public abstract String getCategoria();
    public abstract Date getFechaEntrega();

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
    
    public void disminuirEjemplares() {
        this.ejemplares = this.ejemplares-1;
    }
    
    public void aumentarEjemplares() {
        this.ejemplares = this.ejemplares+1;
    }
}
