public class Pila_1 {
    /*Tope nos sirve para indicar en donde tenemos que insertar 
    Longitud se emplea para obtener el tamaño de la pila
    */
    private Nodo tope= null;
    private int length=0;

    public class Nodo {
        public int isbn;//es un libro
        public String autor;
        public String titulo; 
        public Nodo fondo= null;

        //Constructor nodo... Cada parametro es separado por  una coma
        public Nodo (int isbn, String autor, String titulo){
            this.isbn= isbn;
            this.autor= autor;
            this.titulo= titulo;
        }
    }

    public boolean isEmptyList(){
        return tope==null;
    }
    public int length(){
        return length;
    }

    public void apilar(int isbn, String autor, String titulo){
        Nodo nodoPush= new Nodo(isbn, autor, titulo);
        nodoPush.fondo= tope;
        tope= nodoPush;
        length++;//Cada vez que se agrega un elemento se incrementa la longitud
    }
    public void desapilar(){
        if (tope!=null) {
            Nodo nodoPop= tope;
            tope= tope.fondo;
            nodoPop=null;
        }
        length--;
    }


    public void obtenerTope(){
        if (!isEmptyList()) {
            Nodo nodoCima= tope;
            System.out.println("El libro actual es: ["+ nodoCima.isbn +","+ nodoCima.autor+","+ nodoCima.titulo+"]");
        }
        else{
            System.out.println("La pila esta vacia");
        }
    }

    //Realizar un metodo destructor que elimine todos los elementos de una pila
    public void destructor(){
        while (!isEmptyList()) {
            desapilar();
            
        }

    }

    public void desapilarN(int cantidad) {
        if(isEmptyList()){
            if(length()>=cantidad){
                for (int i = 0; i < cantidad; i++) {
                    desapilar();
                }
            }
        }
        else{
            System.out.println("No");
        }
    }
}
