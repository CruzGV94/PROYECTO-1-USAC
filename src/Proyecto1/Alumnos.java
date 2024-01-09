
package Proyecto1;

public class Alumnos {
    private int Carnet;
    private String Nombre;
    private String Apellido;
    private String Correo;
    private String Contra;
    private char Genero;

    public Alumnos() {
    }

    public Alumnos(int Carnet, String Nombre, String Apellido, String Correo, String Contra, char Genero) {
        this.Carnet = Carnet;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Correo = Correo;
        this.Contra = Contra;
        this.Genero = Genero;
    }

    public int getCarnet() {
        return Carnet;
    }

    public void setCarnet(int Carnet) {
        this.Carnet = Carnet;
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

    public String getContra() {
        return Contra;
    }

    public void setContra(String Contra) {
        this.Contra = Contra;
    }

    public char getGenero() {
        return Genero;
    }

    public void setGenero(char Genero) {
        this.Genero = Genero;
    }

    @Override
    public String toString() {
        return this.getNombre() + " " + getApellido();
    }
}
