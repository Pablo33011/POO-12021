package desafio.dominio;

public class Vendedor extends Directo{
    private long ventasDelMes;

    public Vendedor(String nombre, long salario, long ventasDelMes){
        super(nombre, salario);
        this.ventasDelMes=ventasDelMes;
    }

    public long calcularComision(){

        long comision=0;
        if(getSalario()<=999999){
            comision+=ventasDelMes*0.05;
        }
        else{
            comision+=ventasDelMes*0.045;
        }
        return comision;
    }

    @Override

    protected long calcularSalario() {
        long sal=getSalario();
        sal+=calcularComision();
        sal-= calcularSaludyPension();
        return sal;
    }
}
