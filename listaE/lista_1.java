package listaE;
public class lista_1{
    private nodo head = null;
    public int length = 0;

    public class nodo{ //Clase interna llamada nodo
        public int data;
        public nodo next; //Enlace al siguiente nodo
        //De la 
        //El constructor inicializa las variables de mi clase nodo
        nodo(int valor){
            data = valor;
            next = null;
        }
    }

    public boolean IsEmptyList(){
        return head == null;
    }

    public int ObtenerNodo(int posicion){
        if(IsEmptyList()){
            return 0;
        }else{
            nodo puntero = head;
            int contador = 0;
            while(contador<posicion&&puntero.next!=null){
                puntero = puntero.next;
                contador++;
            }
            if(contador!=posicion){
                return 0;
            
            }else{
                return puntero.data;
            }
        }
    }

    public int ContarNodos(){
        return length;
    }

    public void MostrarNodos(){
        nodo current = head;
        int contador = 0;
        while(current != null){
            System.out.println("El elemento "+(contador+1)+" el nodo es: "+current.data);
            current = current.next;
            contador++;
        }
    }

    public void InsertarAlInicio(int valor){ 
        nodo ndo = new nodo(valor); //Insertar un nodo al inicio
        ndo.next = head; //Apuntar el puntero del nodo a la cabeza
        head = ndo; //
        length++;

    }

    public void InsertarAlFinal(int valor){
        nodo ndo = new nodo(valor);
        if(IsEmptyList()){
            head = ndo;
        }else{
            nodo puntero = head;
            while(puntero.next != null){
                puntero= puntero.next;

            }
            puntero.next = ndo;
        }
        length++;
    }

    public void InsertarEnPosicion(int posicion, int valor){
        nodo ndo = new nodo(valor);
        if(IsEmptyList()){
            head = ndo;
        }else{
            nodo puntero = head;
            int contador = 0;
            while(contador < (posicion-1) && puntero.next != null){
                puntero = puntero.next;
                contador++;
            }
            ndo.next = puntero.next;
            puntero.next = ndo;
        }
        length++;

    }

    public void EliminarAlInicio(){
        if(!IsEmptyList()){
            nodo first = head;
            head = head.next;
            first.next = null;
            length--;
        }
    }

    public void EliminarAlFinal(){
        if(!IsEmptyList()){ //La lista no tiene que estar vacia
            if(head.next == null){ // Verificar que al menos hay un nodo
                head = null;
                length--;
            }else{
                nodo puntero = head;
                while(puntero.next.next != null){
                    puntero = puntero.next;

                }
                puntero.next = null;
                length--;
            }
        }
    }

    public void EliminarNodo(int posicion){
        if (head!=null) {
            if (posicion==0) {
                nodo first=head;
                head=head.next;
                first.next=null;
                length--;
            } else if (posicion<length) {
                nodo puntero=head;
                int contador=0;
                while(contador<(posicion-1)){
                    puntero=puntero.next;
                    contador++;
                }
                nodo temp=puntero.next;
                puntero.next=temp.next;
                temp.next=null;
                length++;
            }
        } 
    }
}