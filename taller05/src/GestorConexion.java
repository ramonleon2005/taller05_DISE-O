public class GestorConexion {
    // Instancia estática privada
    private static GestorConexion instancia;
    
    // Variables de estado simuladas
    private boolean estadoConexion;

    // El constructor debe ser privado para evitar instanciacion externa
    private GestorConexion() {
        this.estadoConexion = true;
        System.out.println("[DB] Conexión a la base de datos inicializada de forma segura.");
    }

    // Metodo de acceso global
    public static synchronized GestorConexion getInstance() {
        if (instancia == null) {
            instancia = new GestorConexion();
        }
        return instancia;
    }

    // Operacion de negocio simulada
    public void ejecutarConsulta(String query) {
        if (estadoConexion) {
            System.out.println("[DB] Ejecutando: " + query);
        }
    }
}