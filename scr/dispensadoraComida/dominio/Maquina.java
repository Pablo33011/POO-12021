package dispensadoraComida.dominio;

import java.util.List;

public class Maquina {
    private String marca;
    private Productos producto;
    public List<Productos> productos;
    int total =0;
    int cantidadActual;
    public Maquina(String marca) {
        this.marca = marca;
    }

    public void mostrarProductos() {
        productos.forEach(Productos -> {
            System.out.println(Productos.getNombreProducto());
        });


    }

    public int cantidadtotal() {

        productos.forEach(Productos -> {
            total += Productos.getCantidadProducto();
        });

        return total;
    }


    public void  consultarAgotados(){
        productos.forEach(Productos -> {
            if(Productos.getCantidadProducto()!=0){

            }else {
                System.out.println(Productos.getNombreProducto());
            }
        });

    }

    public void consultarCantidad(String nombreProducto ){
        productos.forEach(Productos -> {
            if(nombreProducto.equals(Productos.getNombreProducto())){

                System.out.println("El numero de productos es:" );
                System.out.println(Productos.getCantidadProducto());
            }


        });

    }


    public void ingresarProducto(String nombreProducto, int cantidadProducto) {

        productos.forEach(Productos -> {
            cantidadActual= Productos.getCantidadProducto();
            if (nombreProducto.equals(Productos.getNombreProducto())){

                if(cantidadActual + cantidadProducto<=8){
                    Productos.setCantidadProducto(cantidadActual + cantidadProducto);

                }
                else{
                    System.out.println("La maquina ya esta en su numero maximo de productos.");
                }
            }
        });



    }



    public void sacarProducto(String nombreProducto, int cantidadProducto) {
        productos.forEach(Productos -> {
            cantidadActual= Productos.getCantidadProducto();
            if (nombreProducto.equals(Productos.getNombreProducto())){

                if(cantidadActual - cantidadProducto>=0){
                    Productos.setCantidadProducto(cantidadActual - cantidadProducto);

                }
                else{
                    System.out.println("No hay los suficientes productos.");
                }
            }
        });
    }

    public String getMarca() {
        return marca;
    }

    public Productos getProducto() {
        return producto;
    }

    public List<Productos> getProductos() {
        return productos;
    }
}
