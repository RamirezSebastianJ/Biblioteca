
package MVC.Administrador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class ControladorCrearLibro implements ActionListener{
    InterfazCrearLibro intCrearLibro;

    public ControladorCrearLibro(InterfazCrearLibro intCrearLibro) {
        this.intCrearLibro = intCrearLibro;

        //Botones InterfazCrearLibro
        this.intCrearLibro.JGuardar.addActionListener(this);
        this.intCrearLibro.jDescartar.addActionListener(this);
    }
    
    
    
    public void iniciarCreador(){
        intCrearLibro.setTitle("Reservar");
        intCrearLibro.setLocationRelativeTo(null);
        intCrearLibro.setResizable(false);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
