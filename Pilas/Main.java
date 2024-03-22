public class Main {
    public static void main(String[] args) {
        Pila_1 Pilita = new Pila_1();
        Pilita.apilar(1, "Ossiel Ruiz", "Pilita_1");
        Pilita.apilar(2, "Jorge", "Pilita_2");
        Pilita.obtenerTope();
        System.out.println("|||||||||||||||||||||||||||||||||||||");
        Pilita.desapilar();
        Pilita.obtenerTope();
    }
}
