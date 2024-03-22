package listaE;

public class main_1 {
    public static void main(String[] args) {
     lista_1 lista = new lista_1();
     lista.InsertarAlInicio(10);
     lista.InsertarEnPosicion(2, 50);
     lista.InsertarAlFinal(288);
     lista.MostrarNodos();
     System.out.println();
     lista.EliminarAlInicio();
     lista.MostrarNodos();   
    }
    
}
