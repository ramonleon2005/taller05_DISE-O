public class ProductoFisico implements Producto {
    private double pesoKg;
    private String dimensionesCm;

    public ProductoFisico(double pesoKg, String dimensionesCm) {
        this.pesoKg = pesoKg;
        this.dimensionesCm = dimensionesCm;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Producto Físico - Peso: " + pesoKg + "kg, Dimensiones: " + dimensionesCm);
    }

    @Override
    public double calcularCostoFinal() {
        return 50.0 + (pesoKg * 2.5); // Lógica de ejemplo de cobro por peso
    }
}