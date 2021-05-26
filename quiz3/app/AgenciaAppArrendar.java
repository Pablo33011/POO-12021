package quiz3.app;
import quiz3.dominio.*;
import java.util.Arrays;
import java.util.List;

public class AgenciaAppArrendar {
    public static void main(String[] args) {
        Agencia ArrendarVivienda=new Agencia();
        Casa n1=new Casa();
        n1.setValorArriendo(500000);
        n1.setValorVenta(75000000);

        Apartamento n2= new Apartamento();
        n2.setValorArriendo(650000);
        n2.setValorVenta(130000000);

        Lote n3=new Lote();
        n3.setValorVenta(106000000);



        List<Inmueble> in= Arrays.asList(n1, n2, n3);
        in.forEach(i->ArrendarVivienda.agregarInmueble(i));
        System.out.println(ArrendarVivienda.arrendar(n1));
        System.out.println(ArrendarVivienda.arrendar(n1));
        System.out.println(ArrendarVivienda.devolver(n1));
        System.out.println(ArrendarVivienda.devolver(n1));
        System.out.println("Inmuebles disponibles: ");
        ArrendarVivienda.getArrendablesDisponibles().forEach(i-> System.out.println(i.toString()));
        System.out.println("Inmuebles arrendados: ");
        ArrendarVivienda.getArrendados().forEach(i-> System.out.println(i.toString()));
        System.out.println();

    }
}
