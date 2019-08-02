package main;

import impuestos.ParafiscalesDAO;
import static constants.ParafiscalesStrings.*;
import javax.swing.*;

public class Main {
    public static void main(String[] args){
        ParafiscalesDAO parafiscalesDAO = new ParafiscalesDAO();

        String nombre = JOptionPane.showInputDialog(null, INGRESAR_NOMBRE.getMensaje());
        String salario = JOptionPane.showInputDialog(null, INGRESAR_SALARIO.getMensaje());

        parafiscalesDAO.setNombre(nombre);
        parafiscalesDAO.setSalario(Double.parseDouble(salario));
        JOptionPane.showMessageDialog(null, EMPLEADO.getMensaje() + parafiscalesDAO.getNombre() + "\n" +
                SALARIO.getMensaje() + parafiscalesDAO.getSalario() + "\n" +
                DESCUENTO_PENSION.getMensaje() + parafiscalesDAO.calcularPension() + "\n" +
                DESCUENTO_SALUD.getMensaje() + parafiscalesDAO.calcularSalud() + "\n" +
                SALARIO_FINAL.getMensaje() + parafiscalesDAO.totalSalario()
        );
    }
}
