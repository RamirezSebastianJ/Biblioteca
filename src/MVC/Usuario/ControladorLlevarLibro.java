
package MVC.Usuario;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControladorLlevarLibro implements ActionListener {
    InterfazLlevarLibro intLlevarLibro;

    public ControladorLlevarLibro(InterfazLlevarLibro intLlevarLibro) {
        this.intLlevarLibro = intLlevarLibro;

        //Botones InterfazDevolverLibro
        this.intLlevarLibro.jGuardar.addActionListener(this);
        this.intLlevarLibro.jDescartar.addActionListener(this);
    }
    
    public void iniciar(){
        intLlevarLibro.setTitle("Reservar");
        intLlevarLibro.setLocationRelativeTo(null);
        intLlevarLibro.setResizable(false);
    }

    
    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
