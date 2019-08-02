package constants;

public enum ParafiscalesDouble {
    CERO_DOS(0.02),
    CERO_TRES(0.03),
    CERO_CUATRO(0.04),
    CERO_CINCO(0.05);

    private double descuento;

    ParafiscalesDouble(double v) {
        this.descuento = v;
    }

    public double getDescuento() {
        return descuento;
    }
}
