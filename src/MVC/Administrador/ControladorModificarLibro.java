
package MVC.Administrador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControladorModificarLibro implements ActionListener{
    
    InterfazModificarLibro intModLibro;

    public ControladorModificarLibro(InterfazModificarLibro intModLibro) {
        this.intModLibro = intModLibro;

        //Botones InterfazModificarLibro
        this.intModLibro.jGuardar.addActionListener(this);
        this.intModLibro.jDescartar.addActionListener(this);
    }

    public void iniciarModificador(){
        intModLibro.setTitle("Reservar");
        intModLibro.setLocationRelativeTo(null);
        intModLibro.setResizable(false);
    }
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
