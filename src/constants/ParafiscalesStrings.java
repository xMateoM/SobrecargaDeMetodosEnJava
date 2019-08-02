package constants;

public enum ParafiscalesStrings {
    INGRESAR_NOMBRE("Ingresa el nombre del empleado:"),
    INGRESAR_SALARIO("Ingrese el salario del empleado:"),
    EMPLEADO("Empleado: "),
    SALARIO("Su salario es: "),
    DESCUENTO_PENSION("Su descuento de pension es: "),
    DESCUENTO_SALUD("Su descuento de salud es: "),
    SALARIO_FINAL("Su salario final es de: ");

    private String mensaje;

    ParafiscalesStrings(String s) {
        this.mensaje = s;
    }

    public String getMensaje() {
        return mensaje;
    }
}
