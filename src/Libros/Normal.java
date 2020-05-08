
package Libros;

import java.util.Calendar;
import java.util.Date;


public class Normal extends Libro{
    
    Date fechaReserva;
    Date fechaEntrega;
    
    public Normal(String nombre, int ejemplares, String autor) {
        super(nombre, ejemplares, autor);
    }
    

    @Override
    public void setFechaReserva(Date fechaReserva) {
        this.fechaReserva = fechaReserva;
    }

    @Override
    public void setFechaEntrega(Date fechaEntrega) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(fechaEntrega); 
        calendar.add(Calendar.DAY_OF_YEAR, 10);
        this.fechaEntrega = calendar.getTime();
    }

    @Override
    public Date getFechaEntrega() {
        return fechaEntrega;
    }

    @Override
    public String getCategoria() {
        return "Normal";
    }
}
