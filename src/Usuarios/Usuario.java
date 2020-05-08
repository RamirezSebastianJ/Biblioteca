
package Usuarios;


public class Usuario {
    String nombre;
    String tipo;
    float id;

    public Usuario(String nombre, String tipo, float id) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public float getId() {
        return id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setId(float id) {
        this.id = id;
    }

}
