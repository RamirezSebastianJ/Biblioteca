
package Libros;


public class LibroFactory implements LibroFactoryMethod{

    @Override
    public Libro createLibro(String nombre, int ejemplares, String autor, String categoria) {
        if(categoria.equals("masivos")){
            return new Masivos(nombre, ejemplares,autor);
        }
        
        if(categoria.equals("criticos")){
            return new Criticos(nombre, ejemplares,autor);
        }
        
        if(categoria.equals("normal")){
            return new Normal(nombre, ejemplares,autor);
        }        
        return null;
    }   
}
