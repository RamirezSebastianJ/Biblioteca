
package Libros;


public class Masivos extends Libro {
    
    int fechaReserva;
    int fechaEntrega;
    
    public Masivos(String nombre, int ejemplares, String autor) {
        super(nombre, ejemplares, autor);
    }
    

    @Override
    public void getFechaReserva(int fechaReserva) {
        this.fechaReserva = fechaReserva;
    }

    @Override
    public void getFechaEntrega(int fechaEntrega) {
        this.fechaEntrega = fechaReserva + 20;
    }
    
}
