
package modelo;

import java.util.ArrayList;
import javax.ejb.Local;

/**
 *
 * @author Informatica
 */
@Local
public interface ServicioLocal {

    void addProducto(Producto p);

    ArrayList<Producto> getProductos();
    
}
