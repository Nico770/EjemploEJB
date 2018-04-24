
package modelo;

import java.util.ArrayList;
import javax.ejb.Singleton;

/**
 *
 * @author Informatica
 */
@Singleton
public class Servicio implements ServicioLocal {
    private ArrayList<Producto> lista=new ArrayList();
    
    public Servicio() {
        lista.add(new Producto("bolso",20990));
        lista.add(new Producto("cinturon",9990));
        lista.add(new Producto("zapatillas adidas",25990));
    }

    @Override
    public void addProducto(Producto p) {
        lista.add(p);
        
    }

    @Override
    public ArrayList<Producto> getProductos() {
        return lista;
    }
    
    
    
    
}
