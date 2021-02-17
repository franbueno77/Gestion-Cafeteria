import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
/**
 * Esta clase contiene un Arraylist de la clase Producto
 * @author Fran
 */
public class Productos {

    public ArrayList<Producto> productoArrayList = new ArrayList<>();
/**
 * método constructor
 * @param productoArrayList 
 */
    public Productos(ArrayList<Producto> productoArrayList) {
        this.productoArrayList = productoArrayList;
    }
/**
 * método constructor
 */
    public Productos() {
    }
/**
 * añade productos
 * @param nombreProducto
 * @param precioProducto 
 */
    public void  annadirProducto(String nombreProducto, double precioProducto){

        productoArrayList.add(new Producto(nombreProducto, precioProducto));
        System.out.println("Producto añadido\n");
    }
/**
 * añade los productos a las mesas
 * @param nombProducto
 * @param precioProducto
 * @param annadirOtroProducto 
 */
    public void  annadirProductosAmesa(String nombProducto, double precioProducto, String annadirOtroProducto){
  Scanner src = new Scanner(System.in);

  do {
        System.out.println("Indique un producto: ");
        nombProducto = src.next();
        System.out.println("Indique el precio del producto: ");
        precioProducto = src.nextDouble();
      System.out.println("¡Producto añadido al pedido!");
        System.out.println("¿Desea añadir otro producto? (Si/No)");
        annadirOtroProducto = src.next();
annadirProducto(nombProducto,precioProducto);
  }
while ((!annadirOtroProducto.equalsIgnoreCase("No")));
listarProductos();
    }
/**
 * lista los productos
 * 
 */ 
    public void listarProductos(){

        Producto producto;
        Iterator it=productoArrayList.iterator();
        while (it.hasNext()){
            producto=(Producto)it.next();
            System.out.println(producto);
        }
    }

    public int crearFactura(){
        int totalFactura=0;

        Iterator it=productoArrayList.iterator();
        while (it.hasNext()){
            Producto  producto=(Producto)it.next();
            totalFactura+=producto.getPrecioProducto();
        }
        return totalFactura;

    }


}