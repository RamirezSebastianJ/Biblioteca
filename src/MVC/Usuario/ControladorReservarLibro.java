
package MVC.Usuario;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControladorReservarLibro implements ActionListener{
    InterfazReservarLibro intResLibro;

    public ControladorReservarLibro(InterfazReservarLibro intResLibro) {
        this.intResLibro = intResLibro;
        
        //Botones InterfazReservarLibro
        this.intResLibro.jGuardar.addActionListener(this);
        this.intResLibro.jDescartar.addActionListener(this);   
    }
    
    public void iniciar(){
        intResLibro.setTitle("Reservar");
        intResLibro.setLocationRelativeTo(null);
        intResLibro.setResizable(false);
    }
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
