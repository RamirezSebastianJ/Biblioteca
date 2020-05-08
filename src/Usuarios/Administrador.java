
package Usuarios;

public class Administrador {
    String nombre;
    float id;
    private String nombreLogin;
    private String contraseña;

    public Administrador(String nombre, float id, String nombreLogin, String contraseña) {
        this.nombre = nombre;
        this.id = id;
        this.nombreLogin = nombreLogin;
        this.contraseña = contraseña;
    }

    public String getNombre() {
        return nombre;
    }

    public float getId() {
        return id;
    }

    public String getNoombreLogin() {
        return nombreLogin;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setId(float id) {
        this.id = id;
    }
    
    
    
}
