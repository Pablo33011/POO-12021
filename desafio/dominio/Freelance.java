package desafio.dominio;

public class Freelance extends Empleado{

    long valorHora;

    int horasdeTrabajo;

    public Freelance(String nombre, long valorHora, int horasdeTrabajo){
        super(nombre);
        this.valorHora=valorHora;
        this.horasdeTrabajo = horasdeTrabajo;
    }

    @Override
    protected long calcularSalario() {
        return horasdeTrabajo *valorHora;
    }

}
