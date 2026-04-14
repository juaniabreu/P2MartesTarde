import Implementacion.ConjuntoEstaticoString;
import Interface.ConjuntoTDAString;

public class Ej3Blacklist {
    public static void main(String[] args) {
        ConjuntoTDAString blacklist = new ConjuntoEstaticoString();
        blacklist.InicializarConjunto();

        blacklist.Agregar("Crypto");
        blacklist.Agregar("Gana");
        blacklist.Agregar("Premio");

        String[] mail = {"Hola", "Gana", "dinero"};

        if (esSpam(blacklist, mail)) {
            System.out.println("El mail es SPAM");
        } else {
            System.out.println("Mail valido");
        }
    }

    public static boolean esSpam(ConjuntoTDAString blacklist, String[] palabras) {
        for (String p : palabras) {
            if (blacklist.Pertenece(p)) {
                return true;
            }
        }
        return false;
    }
}
