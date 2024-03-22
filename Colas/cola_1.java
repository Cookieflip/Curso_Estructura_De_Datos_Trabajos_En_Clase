package Colas;

public class cola_1 {
    private NodoPedido cabeza,cola;

    public class NodoPedido{
        public int numeroPedido;
        public String nombreCliente;
        public NodoPedido next= null; //Apuntador
        public NodoPedido(int numPedido, String nomCliente){
            numeroPedido=numPedido;
            nombreCliente=nomCliente;

        }
    }

    public void agregarCola(int pedido, String cliente){
        NodoPedido nuevoPedido = new NodoPedido(pedido, cliente);
        if(cabeza==null&&cola==null){
            cabeza=nuevoPedido;
        }else{
            cola.next=nuevoPedido;
        }
        cola=nuevoPedido;
    }

    
}
