package tour.dominio;

public class ciclista {
    private int edad;
    private String nombre;
    private int posicionLLegada;

    public ciclista(int edad, String nombre, int posicionLLegada) {
        this.edad = edad;
        this.nombre = nombre;
        this.posicionLLegada = posicionLLegada;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
