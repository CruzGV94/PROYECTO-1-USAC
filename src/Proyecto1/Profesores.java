package Proyecto1;
import java.io.Serializable;

public class Profesores implements Serializable {
     
    private int Codigo;
    private String Nombre;
    private String Apellido;
    private String Correo;
    private String Contraseña;
    private char Genero;

    public Profesores() {
    }
    
    public Profesores(int Codigo, String Nombre, String Apellido, String Correo, String Contraseña, char Genero) {
        this.Codigo = Codigo;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Correo = Correo;
        this.Contraseña = Contraseña;
        this.Genero = Genero;
    }

    public int getCodigo() {
        return Codigo;
    }

    public void setCodigo(int Codigo) {
        this.Codigo = Codigo;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }

    public String getContraseña() {
        return Contraseña;
    }

    public void setContraseña(String Contraseña) {
        this.Contraseña = Contraseña;
    }

    public char getGenero() {
        return Genero;
    }

    public void setGenero(char Genero) {
        this.Genero = Genero;
    }

    @Override
    public String toString() {
        return getNombre() + " " + getApellido();
    }
    
    
}
