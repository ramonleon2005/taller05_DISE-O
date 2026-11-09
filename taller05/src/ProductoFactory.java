import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

public class ProductoFactory {
    // Mapa que almacena los creadores registrados
    private static final Map<String, Function<Object[], Producto>> registro = new HashMap<>();

    // Bloque estatico para registrar los productos base 
    static {
        registrarTipo("FISICO", params -> new ProductoFisico((Double) params[0], (String) params[1]));
        registrarTipo("DIGITAL", params -> new ProductoDigital((Double) params[0], (String) params[1]));
    }

    // Metodo que permite inyectar nuevos tipos de productos sin modificar el codigo de fabrica
    public static void registrarTipo(String tipo, Function<Object[], Producto> creador) {
        registro.put(tipo.toUpperCase(), creador);
    }

    // Punto de creacion que decide el subtipo en tiempo de ejecucion
    public static Producto crearProducto(String tipo, Object[] params) {
        Function<Object[], Producto> creador = registro.get(tipo.toUpperCase());
        
        if (creador != null) {
            return creador.apply(params);
        }
        throw new IllegalArgumentException("Tipo de producto no soportado: " + tipo);
    }
}