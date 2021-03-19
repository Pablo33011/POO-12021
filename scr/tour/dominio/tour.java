package tour.dominio;

import java.util.Comparator;
import java.util.List;

public class tour {
    public String nombreTour;
    private List<equipo> equipos;
    private List<etapa> etapas;
    private List<ciclista> todosCorredores;

    public tour(String nombreTour) {
        this.nombreTour = nombreTour;
    }

    public String getNombreTour() {
        return nombreTour;
    }

    public void setNombreTour(String nombreTour) {
        this.nombreTour = nombreTour;
    }

    public List<equipo> getEquipos() {
        return equipos;
    }

    public void setEquipos(List<equipo> equipos) {
        this.equipos = equipos;
    }

    public List<etapa> getEtapas() {
        return etapas;
    }

    public void setEtapas(List<etapa> etapas) {
        this.etapas = etapas;
    }

    public List<ciclista> getTodosCorredores() {
        return todosCorredores;
    }

    public void setTodosCorredores(List<ciclista> todosCorredores) {
        this.todosCorredores = todosCorredores;
    }

    public void getCorredoresOrdenadosEdad(equipo e){
        List<ciclista>corredoresOrdenaros;
        corredoresOrdenaros= (List<ciclista>) e.getCorredorlist().stream().sorted(Comparator.comparing(ciclista::getEdad));



        corredoresOrdenaros.forEach(corredor -> {
            System.out.println(corredor.getNombre());
            System.out.println(corredor.getEdad());
        });

    }
}