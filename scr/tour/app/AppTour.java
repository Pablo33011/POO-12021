package tour.app;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import tour.dominio.etapa;
import tour.dominio.equipo;
import tour.dominio.corredor;

public class AppTour {
    public static void main(String[] args){
        etapa paris= new etapa("Paris") ;
        equipo Paisas = new equipo("Los Paisas");
        corredor sneyder = new corredor(35,"sneyder",1);
        corredor Brayan = new corredor(37,"Brayan",2);
        corredor Covid = new corredor(31,"Covid Julian",3);
        corredor Kevin = new corredor(38,"Kevin",4);
        corredor Ander = new corredor(22,"Ander",5);
        Paisas.corredorlist = new ArrayList<>();
        Paisas.corredorlist.addAll(Arrays.asList(sneyder,Brayan,Covid,Kevin,Ander));

    }

}
