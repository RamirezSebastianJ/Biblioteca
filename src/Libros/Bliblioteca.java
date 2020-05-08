
package Libros;

import MVC.Administrador.ControladorAdministrador;
import MVC.Administrador.InterfazCrearLibro;
import MVC.Administrador.InterfazModificarLibro;
import MVC.ControladorLogin;
import MVC.LogicaLogin;
import MVC.VentanaLoger;

public class Bliblioteca {
    
    public static void main(String[] args){
        
        VentanaLoger ventanaLoger = new VentanaLoger();
        LogicaLogin logicalLogin = new LogicaLogin();
        
        
        
        ControladorLogin controlLogin = new ControladorLogin( ventanaLoger, logicalLogin);
        
        controlLogin.iniciarLogin();
        ventanaLoger.setVisible(true);
        
    }
}
