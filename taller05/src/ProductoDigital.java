public class ProductoDigital implements Producto {
    private double tamanoMb;
    private String formatoArchivo;

    public ProductoDigital(double tamanoMb, String formatoArchivo) {
        this.tamanoMb = tamanoMb;
        this.formatoArchivo = formatoArchivo;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Producto Digital - Tamaño: " + tamanoMb + "MB, Formato: " + formatoArchivo);
    }

    @Override
    public double calcularCostoFinal() {
        return 20.0; // Sin costo de envio
    }
}