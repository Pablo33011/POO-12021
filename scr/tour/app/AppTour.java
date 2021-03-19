package tour.app;

import java.util.*;

import tour.dominio.etapa;
import tour.dominio.equipo;
import tour.dominio.ciclista;
import tour.dominio.tour;

public class AppTour {
    public static void main(String[] args){
        etapa paris= new etapa("paris") ;
        tour francia = new tour("francia");
        equipo colombia = new equipo("colombia");
        ciclista jairo = new ciclista(35,"jairo",1);
        ciclista rigoberto = new ciclista(37,"rigoberto",2);
        ciclista andres = new ciclista(31,"andres",3);
        ciclista juan = new ciclista(38,"juan",4);
        ciclista sara = new ciclista(22,"sara",5);
        colombia.corredorlist = new ArrayList<>();
        francia.getEquipos().add(colombia);
        francia.getEquipos().addAll(Arrays.asList(colombia));
        francia.getEquipos().addAll(Arrays.asList(colombia));
        francia.getEtapas().addAll(Arrays.asList(paris));
        colombia.corredorlist.addAll(Arrays.asList(jairo,rigoberto,andres,juan,sara));


        francia.getCorredoresOrdenadosEdad(colombia);




    }


}
