package desafio.dominio;

public class Promotor extends Empleado{
    private int volantesRepartidos;
    private int comprasVolante;
    private long valorVolante;

    public Promotor(String nombre, int volantesRepartidos, long valorVolante, int comprasVolante){
        super(nombre);

        this.comprasVolante=comprasVolante;
        this.valorVolante=valorVolante;
        this.volantesRepartidos=volantesRepartidos;
    }

    @Override
    protected long calcularSalario() {
        return (volantesRepartidos * valorVolante) + (17000 * comprasVolante);
    }
}
