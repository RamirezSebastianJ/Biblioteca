
package Libros;

import java.util.Calendar;
import java.util.Date;


public class Criticos extends Libro {
    
    Date fechaReserva;
    Date fechaEntrega;
    
    public Criticos(String nombre, int ejemplares, String autor) {
        super(nombre, ejemplares, autor);
    }
    

    @Override
    public void setFechaReserva(Date fechaReserva) {
        this.fechaReserva = fechaReserva;
    }

    public void setFechaEntrega(Date fechaEntrega,int user) {
        if(user == 1){
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(fechaEntrega); 
            calendar.add(Calendar.DAY_OF_YEAR, 5);
            this.fechaEntrega = calendar.getTime();
        }else{
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(fechaEntrega); 
            calendar.add(Calendar.DAY_OF_YEAR, 2);
            this.fechaEntrega = calendar.getTime();
        }  
    }

    @Override
    public void setFechaEntrega(Date fechaEntrega) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(fechaEntrega); 
        calendar.add(Calendar.DAY_OF_YEAR, 2);
        this.fechaEntrega = calendar.getTime();
    }
    
    @Override
    public Date getFechaEntrega() {
        return fechaEntrega;
    }
     @Override
    public String getCategoria() {
        return "Criticos";
    }
}
