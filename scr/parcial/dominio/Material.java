package parcial.dominio;

public class Material {
    private int codigo;
    private String nombre;
    private  String Tipo;
    private int duracion;

    public Material(int codigo, int duracion, String nombre, String tipo) {
        this.codigo = codigo;

        this.duracion = duracion;

        this.nombre = nombre;

        this.Tipo = tipo;
    }

    public boolean setTipo(String contipo){
        if(Tipo ==TipoMaterial.Pelicula || Tipo ==TipoMaterial.Serie || Tipo ==TipoMaterial.Documental || Tipo ==TipoMaterial.Stand_Up
                || Tipo ==TipoMaterial.Animadas){
            Tipo =contipo;
            return true;
        }
        else
            {
            return false;
        }
    }
    public int getCodigo() {
        return codigo;
    }

    public int getDuracion() {
        return duracion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTipo() {
        return Tipo;
    }
}