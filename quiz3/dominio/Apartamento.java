package quiz3.dominio;

public class Apartamento extends Inmueble implements Arrendable{
    @Override
    public boolean Arrendar() {
        if(this.isArrendado()){
            return false;
        }
        this.setArrendado(true);
        return true;
    }

    @Override
    public boolean Devolver() {
        if(this.isArrendado()){
            this.setArrendado(false);
            return true;
        }
        return false;
    }
}
