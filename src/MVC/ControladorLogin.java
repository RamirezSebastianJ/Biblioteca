
package MVC;


import Libros.Libro;
import Libros.LibroFactory;
import Libros.LibroFactoryMethod;
import MVC.Administrador.InterfazAdministrador;
import MVC.Administrador.InterfazCrearLibro;
import MVC.Administrador.InterfazModificarLibro;
import MVC.Usuario.InterfazDevolverLibro;
import MVC.Usuario.InterfazLlevarLibro;
import MVC.Usuario.InterfazReservarLibro;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;


public class ControladorLogin implements ActionListener{

    int auxiliarNum = 0;

    VentanaLoger ventanaLoger;
    LogicaLogin logicaLogin;
    
    InterfazAdministrador interfazAdministrador = new InterfazAdministrador();

    
    InterfazUsuario interfazUsuario = new InterfazUsuario() ;
    InterfazReservarLibro interfazReservar = new InterfazReservarLibro();
    InterfazLlevarLibro interfazLLevarLibro = new InterfazLlevarLibro();
    InterfazDevolverLibro devolverLibro = new InterfazDevolverLibro();


    InterfazModificarLibro intModLibro = new InterfazModificarLibro();
    InterfazCrearLibro intCrearLibro=  new InterfazCrearLibro();

    InterfazDevolverLibro inDevLibro =  new InterfazDevolverLibro();
    InterfazLlevarLibro intLlevarLibro =  new InterfazLlevarLibro();
    InterfazReservarLibro intResLibro = new InterfazReservarLibro();


    
    public static LibroFactoryMethod factory = new LibroFactory();
    public static Libro auxiliar;
    public static ArrayList<Libro> libros = new ArrayList<Libro>();
    
    public void Llenar(){
        auxiliar = factory.createLibro("Cien Años de soledad", 2, "Gabo", "normal");
        libros.add(auxiliar);
        auxiliar = null;
        auxiliar = factory.createLibro("Elbosson De higgs No te gva a hacer la cama", 3, "SantaOlalla", "criticos");
        libros.add(auxiliar);
        auxiliar = null;
        auxiliar = factory.createLibro("La ileada", 10, "Homero", "masivos");
        libros.add(auxiliar);
    }
    
    public ControladorLogin(){}

    public ControladorLogin(VentanaLoger ventanaLoger, LogicaLogin logicaLogin) {
        this.ventanaLoger = ventanaLoger;
        this.logicaLogin = logicaLogin;
        

        //Botones VentanaLoger
        this.ventanaLoger.jIngresar.addActionListener(this);
        
        //Casillas de texto ventanaLoger
        this.ventanaLoger.jUser.addActionListener(this);
        this.ventanaLoger.jPassword.addActionListener(this);
        
        //Botones InterfazAdministrador
        this.interfazAdministrador.JModificarLibro.addActionListener(this);
        this.interfazAdministrador.jRegistrarLibro.addActionListener(this);
        this.interfazAdministrador.jButton1.addActionListener(this);
        
        //Botones INTERFAZ USUARIO
        this.interfazUsuario.jLlevar.addActionListener(this);
        this.interfazUsuario.jReservar.addActionListener(this);
        this.interfazUsuario.jDevolver.addActionListener(this);

        //Botones InterfazCrearLibro
        this.intCrearLibro.JGuardar.addActionListener(this);
        this.intCrearLibro.jDescartar.addActionListener(this);
        
        
        //Botones InterfazModificarLibro
        this.intModLibro.jButtonBuscar.addActionListener(this);
        this.intModLibro.jGuardar.addActionListener(this);
        this.intModLibro.jDescartar.addActionListener(this);
        //Botones InterfazDevolverLibro
        this.inDevLibro.jEntregar.addActionListener(this);
        this.inDevLibro.jCancelar.addActionListener(this);
        //Botones InterfazDevolverLibro
        this.intLlevarLibro.jGuardar.addActionListener(this);
        this.intLlevarLibro.jDescartar.addActionListener(this);
        //Botones InterfazReservarLibro
        this.intResLibro.jGuardar.addActionListener(this);
        this.intResLibro.jDescartar.addActionListener(this); 
    }
    
    public void iniciarLogin(){
        Llenar();
        ventanaLoger.setTitle("Blioteca");
        ventanaLoger.setLocationRelativeTo(null);
        ventanaLoger.setResizable(false);
        
    }
    
    public void iniciarInterfazAdministrador(){

        interfazAdministrador.setTitle("Administrador Bliblioteca");
        interfazAdministrador.setLocationRelativeTo(null);
        interfazAdministrador.setResizable(false);
        interfazAdministrador.setVisible(true);
    }
    
    public void iniciarInterfazUser(){
        
        interfazUsuario.setTitle("biblioteca - Usuario");
        interfazUsuario.setLocationRelativeTo(null);
        interfazUsuario.setResizable(false);
        interfazUsuario.setVisible(true);
    }
    
    public void iniciarCreador(){
        intCrearLibro.setTitle("Registrar");
        
        intCrearLibro.setLocationRelativeTo(null);
        intCrearLibro.setResizable(false);
        
        intCrearLibro.setVisible(true);
    }

    public void iniciarModificador(){
        intModLibro.setTitle("modificar");
        intModLibro.setLocationRelativeTo(null);
        intModLibro.setResizable(false);
        intModLibro.setVisible(true);
    }

    public void iniciarDevolver(){
        inDevLibro.setTitle("devolver");
        inDevLibro.setLocationRelativeTo(null);
        inDevLibro.setResizable(false);
        inDevLibro.setVisible(true);
    }

    public void iniciarLlevar(){
        intLlevarLibro.setTitle("Llevar");
        intLlevarLibro.setLocationRelativeTo(null);
        intLlevarLibro.setResizable(false);
        intLlevarLibro.setVisible(true);
    }

    public void iniciaReservar(){
        intResLibro.setTitle("Reservar");
        intResLibro.setLocationRelativeTo(null);
        intResLibro.setResizable(false);
        intResLibro.setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        JButton ingresar = (JButton) e.getSource();
        
        switch(auxiliarNum){
            case 0:
                if(ingresar == ventanaLoger.jIngresar){
            
                    if(ventanaLoger.jUser.getText().equals("admin") && ventanaLoger.jPassword.getText().equals("admin")){
                        ventanaLoger.setVisible(false);
                        iniciarInterfazAdministrador();
                        interfazAdministrador.jTextoUser.setText("Admin");
                        interfazAdministrador.jTextoID.setText("1234");
                        auxiliarNum = 1;
                    }
                    
                    if((ventanaLoger.jUser.getText().equals("docente") && ventanaLoger.jPassword.getText().equals("docente")) |
                        (ventanaLoger.jUser.getText().equals("general") && ventanaLoger.jPassword.getText().equals("general"))){
                        
                        ventanaLoger.setVisible(false);
                        auxiliarNum = 2;
                        iniciarInterfazUser();
                        interfazUsuario.jTextuser.setText("Juan");
                        interfazUsuario.jtextID.setText("124");
                        interfazUsuario.jtextOcupacion.setText("Estudiante");
                    }         
                }  
                break;
            case 1:
                if(ingresar == interfazAdministrador.jRegistrarLibro){
                    interfazAdministrador.setVisible(false);
                    iniciarCreador();
                    intCrearLibro.jComboBox1.removeAllItems();
                    intCrearLibro.jComboBox1.addItem("normal");
                    intCrearLibro.jComboBox1.addItem("masivos");
                    intCrearLibro.jComboBox1.addItem("criticos");

                    auxiliarNum = 3;
                }
                if(ingresar == interfazAdministrador.JModificarLibro){
                    interfazAdministrador.setVisible(false);
                    iniciarModificador();
                    
                     
                    auxiliarNum = 4;
                }
                break;
            case 2:
                if(ingresar == interfazUsuario.jDevolver){
                    interfazUsuario.setVisible(false);
                    iniciarDevolver();
                    auxiliarNum = 5;
                }
                if(ingresar == interfazUsuario.jLlevar){
                    interfazUsuario.setVisible(false);
                    iniciarLlevar();
                    auxiliarNum = 6;
                }
                if(ingresar == interfazUsuario.jReservar){
                    interfazUsuario.setVisible(false);
                    iniciaReservar();
                    auxiliarNum = 7;
                }
                break;
            case 3:
                
                if(ingresar == intCrearLibro.JGuardar){
                    if(!intCrearLibro.jTextField1.getText().equals("")&!intCrearLibro.jTextField2.getText().equals("")&!intCrearLibro.jTextField3.getText().equals("")){
                        intCrearLibro.jTextField1.getText();
                        auxiliar = factory.createLibro(intCrearLibro.jTextField1.getText(), Integer.parseInt(intCrearLibro.jTextField3.getText()), intCrearLibro.jTextField2.getText(), "normal");                        
                        libros.add(auxiliar);
                        auxiliar = null;
                        intCrearLibro.setVisible(false);
                        iniciarInterfazAdministrador();
                        auxiliarNum = 1;
                    }else{
                        JOptionPane.showMessageDialog(null,"Datos Incorrectos ¡Verifique!");
                    }
                }

                if(ingresar == intCrearLibro.jDescartar){
                    intCrearLibro.setVisible(false);
                    iniciarInterfazAdministrador();
                    auxiliarNum = 1;
                }
                break;
            case 4:
                int pos=-1;
                if(ingresar == intModLibro.jButtonBuscar){
                    for(int i=0; i<libros.size();i++){
                        auxiliar = libros.get(i);
                        if(auxiliar.getNombre().equals(intModLibro.cajonBuscar.getText())){
                            intModLibro.nombreL.setText(auxiliar.getNombre());
                            intModLibro.autorL1.setText(auxiliar.getAutor());
                            intModLibro.jTextField1.setText(auxiliar.getEjemplares()+"");
                            pos = i;
                            i=libros.size()+1;
                        }
                    }
                    if(auxiliar==null){
                        JOptionPane.showMessageDialog(null,"Libro no encontrado ¡Verifique!");
                    }
                }
                
                if(ingresar == intModLibro.jGuardar){
                    if(auxiliar.getEjemplares() != Integer.parseInt(intModLibro.jTextField1.getText()) & Integer.parseInt(intModLibro.jTextField1.getText())>0){
                       auxiliar.setEjemplares(Integer.parseInt(intModLibro.jTextField1.getText()));
                       libros.set(pos, auxiliar);
                       auxiliar = null;
                       intModLibro.setVisible(false);
                        iniciarInterfazAdministrador();
                        auxiliarNum = 1;
                    }else{
                        JOptionPane.showMessageDialog(null,"No hay cambio en los ejemplares ¡Verifique!");
                    }
                    
                }
                if(ingresar == intModLibro.jDescartar){
                    intModLibro.setVisible(false);
                    iniciarInterfazAdministrador();
                    auxiliarNum = 1;
                }

                break;
            case 5:
                if(ingresar == inDevLibro.jEntregar){
                    inDevLibro.setVisible(false);
                    iniciarInterfazUser();
                    auxiliarNum = 2;
                }
                if(ingresar == inDevLibro.jCancelar){
                    inDevLibro.setVisible(false);
                    iniciarInterfazUser();
                    auxiliarNum = 2;
                }
                break;
            case 6:
                if(ingresar == intLlevarLibro.jGuardar){
                    intLlevarLibro.setVisible(false);
                    iniciarInterfazUser();
                    auxiliarNum = 2;
                }
                if(ingresar == intLlevarLibro.jDescartar){
                    intLlevarLibro.setVisible(false);
                    iniciarInterfazUser();
                    auxiliarNum = 2;
                }

                break;
            case 7:
                if(ingresar == intResLibro.jGuardar){
                    intResLibro.setVisible(false);
                    iniciarInterfazUser();
                    auxiliarNum = 2;
                }
                if(ingresar == intResLibro.jDescartar){
                    intResLibro.setVisible(false);
                    iniciarInterfazUser();
                    auxiliarNum = 2;
                }
                break;
        }


        
    }
    
}
