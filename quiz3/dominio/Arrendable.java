package quiz3.dominio;

public interface Arrendable {

    default boolean Arrendar() {


        return false;
    }
    default boolean Devolver() {

        return false;
    }
}
