
package MVC.Usuario;

import MVC.InterfazUsuario;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

public class ControladorUsuario implements ActionListener {
    InterfazUsuario interfazUsuario;
    
    InterfazReservarLibro interfazReservar;
    InterfazLlevarLibro interfazLLevarLibro;
    InterfazDevolverLibro devolverLibro;
    
    public ControladorUsuario(){}

    public ControladorUsuario(InterfazUsuario interfazUsuario, InterfazReservarLibro interfazReservar, InterfazLlevarLibro interfazLLevarLibro, InterfazDevolverLibro devolverLibro) {
        this.interfazUsuario = interfazUsuario;
        this.interfazReservar = interfazReservar;
        this.interfazLLevarLibro = interfazLLevarLibro;
        this.devolverLibro = devolverLibro;
    
        //Botones INTERFAZ USUARIO
        this.interfazUsuario.jLlevar.addActionListener(this);
        this.interfazUsuario.jReservar.addActionListener(this);
        this.interfazUsuario.jDevolver.addActionListener(this);
    }

    public void iniciar(){
        interfazUsuario.setTitle("biblioteca - Usuario");
        interfazUsuario.setLocationRelativeTo(null);
        interfazUsuario.setResizable(false);
    }

    ///***********
    @Override
    public void actionPerformed(ActionEvent e) {
        JButton control = (JButton) e.getSource();
        
        if(control == interfazUsuario.jReservar){
            ControladorReservarLibro controladorReservarLibro = new ControladorReservarLibro(interfazReservar);
            controladorReservarLibro.iniciar();
        }
    
        if(control == interfazUsuario.jDevolver){
            ControladorDevolverLibro controladorDevolverLibro = new ControladorDevolverLibro(devolverLibro);
            controladorDevolverLibro.iniciar();
        }
        
        if(control == interfazUsuario.jLlevar){
            ControladorLlevarLibro controladorLlevarLibro = new ControladorLlevarLibro(interfazLLevarLibro);
            controladorLlevarLibro.iniciar();
        }
    }
    
}
