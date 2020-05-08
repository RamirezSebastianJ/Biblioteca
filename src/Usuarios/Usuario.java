
package Usuarios;

import Libros.Libro;
import java.util.ArrayList;


public class Usuario {
    String nombre;
    String userlogin;
    String contraseña;
    int tipo;
    ArrayList<Libro> librosPrestados = new ArrayList<Libro>();
        
    public Usuario(String nombre, String userlogin, String contraseña, int tipo) {
        this.nombre = nombre;
        this.userlogin = userlogin;
        this.contraseña = contraseña;
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public int getTipo() {
        return tipo;
    }

    public String getUserlogin() {
        return userlogin;
    }

    public String getContraseña() {
        return contraseña;
    }
    
    public void setArray(Libro auxiliar){
        librosPrestados.add(auxiliar);
    }

    public ArrayList<Libro> getLibrosPrestados() {
        return librosPrestados;
    }
    
    public void setLibrosPrestados(Libro borrar) {
        for(int i = 0; i < librosPrestados.size(); i++){
            if(librosPrestados.get(i)==borrar){
                librosPrestados.remove(i);
            }
        }
    }
}
