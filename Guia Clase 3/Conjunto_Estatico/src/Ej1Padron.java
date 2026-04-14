import Implementacion.ConjuntoEstatico;
import Interface.ConjuntoTDA;

public class Ej1Padron {
    public static void main(String[] args) {
        ConjuntoTDA padron = new ConjuntoEstatico();
        padron.InicializarConjunto();

        votar(padron, 100);
        votar(padron, 200);
        votar(padron, 100); // repetido
    }

    public static void votar(ConjuntoTDA padron, int legajo) {
        if (!padron.Pertenece(legajo)) {
            padron.Agregar(legajo);
            System.out.println("Voto registrado para " + legajo);
        } else {
            System.out.println("El legajo " + legajo + " ya voto");
        }
    }
}