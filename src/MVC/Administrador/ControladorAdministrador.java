
package MVC.Administrador;

import Libros.Libro;
import Libros.LibroFactory;
import Libros.LibroFactoryMethod;
import static MVC.ControladorLogin.auxiliar;
import static MVC.ControladorLogin.factory;
import static MVC.ControladorLogin.libros;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JButton;
import javax.swing.JOptionPane;

public class ControladorAdministrador implements ActionListener {
    
    InterfazAdministrador interfazAdministrador;
    InterfazCrearLibro interfazCrearLibro;
    InterfazModificarLibro interfazModificarLibro;
    
    public static LibroFactoryMethod factory = new LibroFactory();
    public static Libro auxiliar;
    public static ArrayList<Libro> libros;
    
    
    public ControladorAdministrador(InterfazAdministrador interfazAdministrador, InterfazCrearLibro interfazCrearLibro, InterfazModificarLibro interfazModificarLibro ) {
        
        this.interfazAdministrador = interfazAdministrador;
        this.interfazCrearLibro = interfazCrearLibro;
        this.interfazModificarLibro = interfazModificarLibro;
        
        //Botones InterfazAdministrador
        this.interfazAdministrador.JModificarLibro.addActionListener(this);
        this.interfazAdministrador.jRegistrarLibro.addActionListener(this);
        
    }

    public void iniciarInterfazAdministrador(ArrayList<Libro> libros){

        interfazAdministrador.setTitle("Administrador Bliblioteca");
        interfazAdministrador.setLocationRelativeTo(null);
        interfazAdministrador.setResizable(false);
        interfazAdministrador.setVisible(true);
    }
    

    
    ///////////////////*****/////////////
    @Override
    public void actionPerformed(ActionEvent e) {
        JButton control = (JButton) e.getSource();
        
        if(control == this.interfazAdministrador.JModificarLibro){
            auxiliar = factory.createLibro("Odise", 2, "Homero", "normal");
            libros.add(auxiliar);
            ControladorModificarLibro controladorModificarLibro = new ControladorModificarLibro(interfazModificarLibro); 
            
        }
        if(control == this.interfazAdministrador.jRegistrarLibro){
           ControladorCrearLibro controladorCrearLibro = new ControladorCrearLibro(interfazCrearLibro); 
        }
    }
    
}
