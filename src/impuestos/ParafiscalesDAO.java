package impuestos;

import static constants.ParafiscalesEnteros.NOVECIENTOS;
import static constants.ParafiscalesDouble.*;

public class ParafiscalesDAO extends ParafiscalesNombre {

    public double calcularSalud(){
        if(this.getSalario() > NOVECIENTOS.getNumero()){
            return (this.getSalario() * CERO_CUATRO.getDescuento());
        }else{
            return (this.getSalario() * CERO_DOS.getDescuento());
        }
    }

    public double calcularPension(){
        if(this.getSalario() > NOVECIENTOS.getNumero()){
            return (this.getSalario() * CERO_CINCO.getDescuento());
        }else{
            return (this.getSalario() * CERO_TRES.getDescuento());
        }
    }

    public double totalSalario(){
        return (this.getSalario() - (this.calcularSalud() + this.calcularPension()));
    }
}
