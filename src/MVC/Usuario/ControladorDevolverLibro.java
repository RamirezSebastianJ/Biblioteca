
package MVC.Usuario;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControladorDevolverLibro implements ActionListener{
    InterfazDevolverLibro inDevLibro;

    public ControladorDevolverLibro(InterfazDevolverLibro inDevLibro) {
        this.inDevLibro = inDevLibro;

        //Botones InterfazDevolverLibro
        this.inDevLibro.jEntregar.addActionListener(this);
        this.inDevLibro.jCancelar.addActionListener(this);
    }

    public void iniciar(){
        inDevLibro.setTitle("Reservar");
        inDevLibro.setLocationRelativeTo(null);
        inDevLibro.setResizable(false);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
