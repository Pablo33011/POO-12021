package parcial.dominio;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Pooflix {

    private List<Material> catalogo;
    private int Cantidad = 15;
    Scanner Leer = new Scanner(System.in);
    private int codigobuscado;

    public Pooflix(List<parcial.dominio.Material> catalogo) {
        this.catalogo = new ArrayList<>();
    }

    public boolean agregarMaterial(Material catalogo) {
        if(this.catalogo.size() < Cantidad){
            return true;
        }else {
            return false;
        }
    }



}

