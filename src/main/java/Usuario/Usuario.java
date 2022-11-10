package Usuario;

public class Usuario {
    private String nombre;
    private String email;
    private String patologia;
    private char grupoSanguineo;
    private int numeroDeCelular;
    private long dni;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPatologia() {
        return patologia;
    }

    public void setPatologia(String patologia) {
        this.patologia = patologia;
    }

    public char getGrupoSanguineo() {
        return grupoSanguineo;
    }

    public void setGrupoSanguineo(char grupoSanguineo) {
        this.grupoSanguineo = grupoSanguineo;
    }

    public int getNumeroDeCelular() {
        return numeroDeCelular;
    }

    public void setNumeroDeCelular(int numeroDeCelular) {
        this.numeroDeCelular = numeroDeCelular;
    }

    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public Usuario(String nombre, String email) {
        this.nombre = nombre;
        this.email = email;
    }
}
