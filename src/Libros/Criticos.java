
package Libros;


public class Criticos extends Libro {
    
    int fechaReserva;
    int fechaEntrega;
    
    public Criticos(String nombre, int ejemplares, String autor) {
        super(nombre, ejemplares, autor);
    }
    

    @Override
    public void getFechaReserva(int fechaReserva) {
        this.fechaReserva = fechaReserva;
    }

    public void getFechaEntrega(int fechaEntrega,String usuario) {
        if(usuario.equals("docente")){
            this.fechaEntrega = fechaReserva + 5;
        }else{
            this.fechaEntrega = fechaReserva + 2;
        }  
    }

    @Override
    public void getFechaEntrega(int fechaEntrega) {
        this.fechaEntrega = fechaReserva + 2;
    }
}
