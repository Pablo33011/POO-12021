package parcial.dominio;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Pooflix {
    public static final int Cantidad =15;


    private List<Material> Catalogo =new ArrayList<>();



    public boolean agregar(Material m) {
        if(Catalogo.size()< Cantidad && buscar(m.getCodigo())==null){
            return Catalogo.add(m);
        }
        return false;
    }

    public boolean retirar(int codigo) {
        if(buscar(codigo)!=null){
            Catalogo.remove(buscar(codigo));
        }
        if(buscar(codigo)==null) {
            return true;
        }
        return false;
    }


    public Material buscar(String nombre){
        for (Material Buscado: Catalogo) {
            if(Buscado.getNombre()==nombre){
                return Buscado;
            }
        }
        return null;
    }
    public List<Material> OrdenarxCodigo(){
        List<Material> Organizado= Catalogo.stream()
                .sorted(Comparator.comparingInt(Material::getCodigo).reversed())
                .collect(Collectors.toList());
        return Organizado;
    }
    public Material buscar(int codigo){
        for (Material Buscado: Catalogo) {
            if(Buscado.getCodigo()==codigo){
                return Buscado;
            }
        }
        return null;
    }

    public List<Material> BuscarxTipo(String Tipo){
        List<Material> buscado=new ArrayList<>();
        if(Tipo==TipoMaterial.Pelicula || Tipo==TipoMaterial.Serie || Tipo==TipoMaterial.Documental || Tipo==TipoMaterial.Stand_Up
                || Tipo==TipoMaterial.Animadas){
            for(Material busquedaen: Catalogo){
                if(busquedaen.getTipo()==Tipo){
                    buscado.add(busquedaen);
                }
            }
        }
        return buscado;
    }

    public int DuracionTotal(){
        int Total = 0;
        for(Material Requeri: Catalogo){
            Total+=Requeri.getDuracion();
        }
        return Total;
    }

}

