package dispensadoraComida.dominio;

public class Productos {
    private String nombreProducto;
    private int cantidadProducto;

    public Productos(String nombreProducto, int cantidadProducto) {
        this.nombreProducto = nombreProducto;
        this.cantidadProducto= cantidadProducto;
    }


    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public int getCantidadProducto() {
        return cantidadProducto;
    }

    public void setCantidadProducto(int cantidadProducto) {
        this.cantidadProducto = cantidadProducto;
    }
}
