
package Libros;


public class Normal extends Libro{
    
    int fechaReserva;
    int fechaEntrega;
    
    public Normal(String nombre, int ejemplares, String autor) {
        super(nombre, ejemplares, autor);
    }
    

    @Override
    public void getFechaReserva(int fechaReserva) {
        this.fechaReserva = fechaReserva;
    }

    @Override
    public void getFechaEntrega(int fechaEntrega) {
        this.fechaEntrega = fechaReserva + 10;
    }
}
