import Implementacion.ConjuntoEstaticoString;
import Interface.ConjuntoTDAString;

public class Ej4Tags {
    public static void main(String[] args) {
        ConjuntoTDAString tags = new ConjuntoEstaticoString();
        tags.InicializarConjunto();

        tags.Agregar("Java");
        tags.Agregar("Programacion");
        tags.Agregar("Java"); // duplicado

        System.out.println("Cantidad de tags: " + cantidad(tags));
    }

    public static int cantidad(ConjuntoTDAString c) {
        ConjuntoTDAString aux = new ConjuntoEstaticoString();
        aux.InicializarConjunto();

        int count = 0;

        while (!c.ConjuntoVacio()) {
            String x = c.Elegir();
            aux.Agregar(x);
            c.Sacar(x);
            count++;
        }

        while (!aux.ConjuntoVacio()) {
            String x = aux.Elegir();
            c.Agregar(x);
            aux.Sacar(x);
        }

        return count;
    }
}