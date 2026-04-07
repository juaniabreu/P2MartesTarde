import Implementacion.ConjuntoEstatico;
import Interface.ConjuntoTDA;

public class Ej3Blacklist {
    public static void main(String[] args) {
        ConjuntoTDA blacklist = new ConjuntoEstatico();
        blacklist.InicializarConjunto();

        blacklist.Agregar("Crypto".hashCode());
        blacklist.Agregar("Gana".hashCode());
        blacklist.Agregar("Premio".hashCode());

        String[] mail = {"Hola", "Gana", "dinero"};

        if (esSpam(blacklist, mail)) {
            System.out.println("El mail es SPAM");
        } else {
            System.out.println("Mail valido");
        }
    }

    public static boolean esSpam(ConjuntoTDA blacklist, String[] palabras) {
        for (String p : palabras) {
            if (blacklist.Pertenece(p.hashCode())) {
                return true;
            }
        }
        return false;
    }
}