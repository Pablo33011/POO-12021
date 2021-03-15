package dispensadoraComida.app;
import dispensadoraComida.dominio.Maquina;
import dispensadoraComida.dominio.Productos;

import java.util.ArrayList;
import java.util.Arrays;


public class AppMaquina {
    public static void main(String[] args){
        int cantidadtotal;

        Productos gaseosa= new Productos("Quatro",6);
        Productos ponque= new Productos("Gansito", 8);
        Productos papita= new Productos("Margarita", 0);
        Productos dulces= new Productos("Sparkies",2);
        Productos chocolate= new Productos("Chocolatina Jet", 4);
        Productos jugo= new Productos("Hit", 7);
        Productos cafe= new Productos("Sobre Cafe instantaneo",3);
        Productos agua= new Productos("cristal", 2);
        Productos energizante= new Productos("Mosnter", 1);
        Productos mani= new Productos("La especial",4);

        Maquina Maquina = new Maquina("spenser");
        Maquina.productos = new ArrayList<>();
        Maquina.getProductos().addAll(Arrays.asList(gaseosa,ponque,papita,dulces,chocolate,jugo,cafe,agua,energizante,mani));
        System.out.println("la cantidad de productos es : " + Maquina.productos.size());
        System.out.println("los productos son : ");
        Maquina.mostrarProductos();
        System.out.println("los productos agotados son : ");
        Maquina.consultarAgotados();


        cantidadtotal = Maquina.cantidadtotal();
        System.out.println("la cantidad total de productos es : ");
        System.out.println(cantidadtotal);

        Maquina.ingresarProducto("Margarita",0 );
        System.out.println("los productos agotados son : ");
        Maquina.consultarAgotados();

        Maquina.sacarProducto("Quatro", 6);
        System.out.println("El producto que usted sacó : ");
        Maquina.consultarAgotados();

        Maquina.consultarCantidad("Gansito");
    }
}