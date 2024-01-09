package Proyecto1;

public class Cursos {
    
    private int codigo;
    private String nombre;
    private int credito;
    private String profe;

    public Cursos() {
    }

    public Cursos(int codigo, String nombre, int credito, String profe) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.credito = credito;
        this.profe = profe;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCredito() {
        return credito;
    }

    public void setCredito(int credito) {
        this.credito = credito;
    }

    public String getProfe() {
        return profe;
    }

    public void setProfe(String profe) {
        this.profe = profe;
    }

    @Override
    public String toString() {
        return getNombre() + " " + getProfe();
    }

    
}
