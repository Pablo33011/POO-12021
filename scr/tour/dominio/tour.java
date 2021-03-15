package tour.dominio;

import java.util.List;

public class tour {
    private List<equipo> equipos;
    private List<etapa> etapas;
    private List<corredor> todosCorredores;


    public void getEquipos(){
        equipos.forEach(equipo -> {
            System.out.println(equipo.getNombreEquipo());
        });
    }

    public void getEtapas(){
        etapas.forEach(etapa -> {
            System.out.println(etapa.getLugar());
        });
    }
     public corredor getTop10(){
        List<corredor> ganadores;
        todosCorredores.addAll(getTodosCorredores());
         return null;
     }


    public void setEquipos(List<equipo> equipos) {
        this.equipos = equipos;
    }

    public void setEtapas(List<etapa> etapas) {
        this.etapas = etapas;
    }

    public List<corredor> getTodosCorredores() {
        return todosCorredores;
    }

    public void setTodosCorredores(List<corredor> todosCorredores) {
        this.todosCorredores = todosCorredores;
    }
}