import java.util.ArrayList;
import java.util.Objects;
/**
 * Esta es la clase Mesa
 * @author Fran
 */
public class Mesa {
    
    private String codigoMesa;
    private boolean mesaAbierta;
    private Productos listaProductos;


/**
 * constructor de la clase
 * @param codigoMesa
 * @param mesaAbierta 
 */
    public Mesa(String codigoMesa, boolean mesaAbierta) {
        this.codigoMesa = codigoMesa;
        this.mesaAbierta = mesaAbierta;
        this.listaProductos=new Productos();
    }
    /**
     * constructor de la clase
     */
    public Mesa() {
    }
    /**
     * devuelve códigoMesa
     * @return codigoMesa
     */
    public String getCodigoMesa() {
        return codigoMesa;
    }
    /**
     * establece en codigo de la mesa
     * @param codigoMesa 
     */
    public void setCodigoMesa(String codigoMesa) {
        this.codigoMesa = codigoMesa;
    }
    /**
     * devuelve el estado de la mesa
     * @return mesaAbierta
     */
    public boolean isMesaAbierta() {
        return mesaAbierta;
    }
/**
 * establece el estado de la mesa
 * @param mesaAbierta 
 */
    public void setMesaAbierta(boolean mesaAbierta) {
        this.mesaAbierta = mesaAbierta;
    }
    /**
     * método toString
     * @return String
     */
    @Override
    public String toString() {
        return "Mesa{" +
                "Código de Mesa='" + codigoMesa + '\'' +
                ", Mesa abierta=" + mesaAbierta +
                '}';
    }

     /**
      * se obtiene la lista de los productos
      * @return listaProductos
      */
    public Productos getListaProductos() {
        return listaProductos;
    }

/**
 * si las mesas tienen el mismo código, devuelve true
 * @param o
 * @return boolean
 */
    @Override
    public boolean equals(Object o) {
        Mesa mesa= (Mesa) o;
    return mesa.getCodigoMesa().equalsIgnoreCase(getCodigoMesa());
    }


}