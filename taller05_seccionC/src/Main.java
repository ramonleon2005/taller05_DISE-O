public class Main {
    public static void main(String[] args) {
        System.out.println("--- PRUEBA DEL SINGLETON ---");
        GestorConexion db1 = GestorConexion.getInstance();
        GestorConexion db2 = GestorConexion.getInstance();
        
        System.out.println("Son la misma instancia de BD? " + (db1 == db2));
        db1.ejecutarConsulta("INSERT INTO inventario ...");

        System.out.println("\n--- PRUEBA DEL FACTORY METHOD ---");
        // Se instancian en tiempo de ejecucion enviando un arreglo de atributos
        Producto pFisico = ProductoFactory.crearProducto("FISICO", new Object[]{1.5, "20x15x10"});
        Producto pDigital = ProductoFactory.crearProducto("DIGITAL", new Object[]{350.0, "PDF"});

        pFisico.mostrarDetalles();
        pDigital.mostrarDetalles();
        
        // Guardando en BD a traves del Singleton
        db2.ejecutarConsulta("UPDATE inventario SET tipo='DIGITAL'...");
    }
}