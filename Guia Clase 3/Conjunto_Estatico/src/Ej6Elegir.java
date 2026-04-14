import Interface.ConjuntoTDA;
import Implementacion.ConjuntoEstatico;

public class Ej6Elegir {
    public static void main(String[] args) {
        ConjuntoTDA c = new ConjuntoEstatico();
        c.InicializarConjunto();

        c.Agregar(1);
        c.Agregar(2);
        c.Agregar(3);

        int a = c.Elegir();
        int b = c.Elegir();

        System.out.println("Elegir 1: " + a);
        System.out.println("Elegir 2: " + b);

        c.Sacar(a);

        int c2 = c.Elegir();
        System.out.println("Luego de sacar: " + c2);
    }
}