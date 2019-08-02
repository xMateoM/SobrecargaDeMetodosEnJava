package impuestos;

import static constants.ParafiscalesEnteros.CERO;

public class Parafiscales {
    private double salario;

    public Parafiscales(double salario){
        this.salario = salario;
    }

    public Parafiscales(){
        this.salario = CERO.getNumero();
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }
}
