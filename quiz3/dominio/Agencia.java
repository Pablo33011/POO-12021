package quiz3.dominio;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Agencia {
    private String nombre;
    private List<Inmueble> inmue =new ArrayList<>();

    public void agregarInmueble(Inmueble i){
        inmue.add(i);
    };
    public boolean arrendar(Arrendable inmueble){
        return inmueble.Arrendar();
    }
    public boolean devolver(Arrendable inmueble){
        return inmueble.Devolver();
    }
    public List<Inmueble> getArrendablesDisponibles(){
        return inmue.stream().filter(inmueble -> !inmueble.isArrendado()).collect(Collectors.toList());
    }
    public List<Inmueble> getArrendados(){
        return inmue.stream().filter(inmueble -> inmueble.isArrendado()).collect(Collectors.toList());
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setInmue(List<Inmueble> inmue) {
        this.inmue = inmue;
    }

    public String getNombre() {
        return nombre;
    }

    public List<Inmueble> getInmue() {
        return inmue;
    }
}
