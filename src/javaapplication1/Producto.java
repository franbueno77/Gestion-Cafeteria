import java.util.Objects;
/**
 * clase Producto
 * @author Fran
 */
public class Producto {
    private String nombreProducto;
    private  double precioProducto;

/**
 * constructor de la clase Producto
 * @param nombreProducto
 * @param precioProducto 
 */
    public Producto(String nombreProducto, double precioProducto) {
        this.nombreProducto = nombreProducto;
        this.precioProducto = precioProducto;
    }
/**
 * constructor de la clase Producto
 */
    public Producto() {

    }
/**
 * devuelve el nombre de Producto
 * @return nombreProducto
 */

    public String getNombreProducto() {
        return nombreProducto;
    }
/**
 * establece nombrePRoducto
 * @param nombreProducto 
 */
    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }
/**
 * devuelve el precio 
 * @return precioProducto
 */
    public double getPrecioProducto() {
        return precioProducto;
    }
/**
 * establece el precio
 * @param precioProducto 
 */
    public void setPrecioProducto(double precioProducto) {
        this.precioProducto = precioProducto;
    }
/**
 * método toString
 * @return String
 */
    @Override
    public String toString() {
        return "Producto{" +
                "Nombre del producto='" + nombreProducto + '\'' +
                ", Precio=" + precioProducto +"€"+
                '}'+"\n";
    }
/**
 * si los nombres de los productos son iguales, devuelve true
 * @param o
 * @return boolean
 */
    @Override
    public boolean equals(Object o) {
        Producto producto=(Producto) o;
        return producto.getNombreProducto().equalsIgnoreCase(getNombreProducto());
    }


}