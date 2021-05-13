package desafio.app;

import desafio.dominio.*;

import java.util.Arrays;
import java.util.List;

public class Colchones {
    public static void main(String[] args) {
        Nomina nomin=new Nomina();
        Empleado juan=new Directo("Juan", 5360000);
        Empleado julian=new Vendedor("Julian", 2450000, 55510000);
        Empleado johanna=new Freelance("Johanna", 76000, 85);
        Empleado carolina=new Vendedor("Carolina", 990000,62487000);
        Empleado david=new Directo("David", 2895000);
        Empleado pedro=new Promotor("Pedro", 1500,250, 48);
        Empleado gustavo=new Freelance("Gustavo", 52500,60);
        List<Empleado> e= Arrays.asList(juan, julian, carolina, johanna, david, gustavo, pedro);


        nomin.setEmpleados(e);
        nomin.calcularNomina();
        nomin.listarDirectos();
        nomin.listarFreelancers();
        nomin.listarPromotores();
    }
}
