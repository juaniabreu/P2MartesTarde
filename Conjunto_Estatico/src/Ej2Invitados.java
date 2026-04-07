import Implementacion.ConjuntoEstaticoString;
import Interface.ConjuntoTDAString;

public class Ej2Invitados {
    public static void main(String[] args) {
        ConjuntoTDAString invitados = new ConjuntoEstaticoString();
        invitados.InicializarConjunto();

        invitados.Agregar("Tomas");
        invitados.Agregar("Juani");
        invitados.Agregar("Luki");
        invitados.Agregar("Tomas"); // duplicado

        System.out.println("Cantidad de invitados: " + cantidad(invitados));
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
