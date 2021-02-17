import java.util.ArrayList;
/**
 * Esta clase engloba un ArrayList de la clase Mesa
 * @author Fran
 */
public class Mesas {

    public ArrayList<Mesa> mesaArrayList = new ArrayList<>();
/**
 * crea una nueva mesa
 * @param codigoMesa
 * @param mesaAbierta 
 */
    public void annadirMesa (String codigoMesa, boolean mesaAbierta){
        mesaArrayList.add(new Mesa(codigoMesa,mesaAbierta));
        System.out.println("Mesa añadida");
    }


/**
 * lista las mesas
 * @param mesas 
 */
    public void listarMesas(Mesas mesas){
        for (Mesa m:mesaArrayList) {
            System.out.println(m+"\n");
        }
    }
/**
 * muestra las mesas que están abiertas
 * @param mesas 
 */
    public void mostrarMesasAbiertas(Mesas mesas) {

        System.out.print("Mesas abiertas: ");
        for (Mesa m: mesaArrayList) {
            if(m.isMesaAbierta()){
                System.out.print("["+m.getCodigoMesa()+"] ");
            }
        }
        System.out.println();
        System.out.println();

    }
    /**
     * muestra la lista de las mesas que están cerradas
     * @param mesas 
     */
    public void mostrarMesasCerradas(Mesas mesas){
        System.out.print("Mesas cerradas: ");
        for (Mesa m: mesaArrayList){
            if(!m.isMesaAbierta()){
                System.out.print("["+m.getCodigoMesa()+"] ");
            }
        }
        System.out.println();
        System.out.println();

    }
/**
 * elige la mesa a facturar
 * @param codMesa
 * @return mesaElegida
 */
    public Mesa elegirMesaAFacturar (String codMesa){
        Mesa mesaElegida = new Mesa();
        for (Mesa m: mesaArrayList) {
            if(m.getCodigoMesa().equalsIgnoreCase(codMesa)){

                mesaElegida=m;
            }
        }
        return mesaElegida;
    }


    /*public void abrirMesa(String codMesa){
        Mesa mesaElegida= new Mesa();
        for (Mesa m:mesaArrayList) {
            if(m.getCodigoMesa().equalsIgnoreCase(codMesa))
                mesaElegida=m;
            m.setMesaAbierta(true);
        }
        System.out.println("La mesa"+mesaElegida+"ahora está abierta.");
    }*/
}