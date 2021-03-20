package tour.dominio;

import java.util.List;


public class equipo {
    public String nombreEquipo;
    public List<ciclista> corredorlist;

    public List<equipo> equipoList;

    public equipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }

    public List<ciclista> getCorredorlist() {
        return corredorlist;
    }

    public void setCorredorlist(List<ciclista> corredorlist) {
        this.corredorlist = corredorlist;
    }

    public String getNombreEquipo() {
        return nombreEquipo;
    }

    public void setNombreEquipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }


}