package desafio.dominio;

public class Directo extends Empleado{
    private long salario;
    public Directo(String nombre, long salario){
        super(nombre);
        this.salario=salario;
    }
    public long calcularSaludyPension(){
        return (long)(salario*0.135);
    }


    @Override
    protected long calcularSalario() {
        long salar=salario;
        salar=(salario-calcularSaludyPension());
        return salar;
    }

    public long getSalario() {
        return salario;
    }
}
