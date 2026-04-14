import Implementacion.DiccionarioMultipleEstatico;
import Implementacion.DiccionarioSimpleEstatico;
import Implementacion.PuntajeEsports;
import Interface.DiccionarioMultipleStringString;
import Interface.DiccionarioSimpleStringInt;

public class Main {
    public static void main(String[] args) {

        //---------------------Diccionario de Sinónimos---------------------------
       /** AgendaContactosTDA d = new DiccionarioSimpleEstatico();

        d.InicializarDiccionario();

        d.Agregar("contacto1", "100");
        d.Agregar("contacto2", "200");
        d.Agregar("contacto3", "300");
        d.Agregar("contacto2", "250"); // actualiza el valor de la clave 2

        System.out.println("Claves del diccionario:");
        String[] claves1 = d.Claves();
        for (int i = 0; i < claves1.length; i++) {
            System.out.println(claves1[i]);
        }

        d.Eliminar("contacto2");

        System.out.println("Claves luego de eliminar la clave contacto2:");
        String[] claves2 = d.Claves();
        for (int i = 0; i < claves2.length; i++) {
            System.out.println(claves2[i]);
        }
**/


        //---------------------Diccionario de Sinónimos---------------------------
 /**       DiccionarioMultipleStringString sinonimos = new DiccionarioMultipleEstatico();
        sinonimos.InicializarDiccionario();
        sinonimos.Agregar("palabra", "sinonimo1");
        sinonimos.Agregar("palabra", "sinonimo2");
        sinonimos.Agregar("palabra", "sinonimo3");
        sinonimos.Agregar("palabra2", "sinonimo1");

        System.out.println("Claves del diccionario:");
        String[] palabras = sinonimos.Claves();
        for (int i = 0; i < palabras.length; i++) {
            System.out.println(palabras[i]);
        }

        System.out.println("Valores de la clave palabra:");
        String[] valoresPalabra = sinonimos.Recuperar("palabra");
        for (int i = 0; i < valoresPalabra.length; i++) {
            System.out.println(valoresPalabra[i]);
        }

        sinonimos.EliminarValor("palabra", "sinonimo2");

        System.out.println("Valores de la clave 7 luego de eliminar el valor 1:");
        String[] valoresPalabraB = sinonimos.Recuperar("palabra");
        for (int i = 0; i < valoresPalabraB.length; i++) {
            System.out.println(valoresPalabraB[i]);
        }

        sinonimos.Eliminar("palabra");

        System.out.println("Claves luego de eliminar la clave 7:");
        String[] valoresPalabra2= sinonimos.Claves();
        for (int i = 0; i < valoresPalabra2.length; i++) {
            System.out.println(valoresPalabra2[i]);
        }

**/
        //---------------------Puntajes de Torneo de E-Sports---------------------------
        DiccionarioSimpleStringInt puntajes = new PuntajeEsports();
        puntajes.InicializarDiccionario();
        puntajes.Agregar("usuario1", 1111);
        puntajes.Agregar("usuario2", 22);
        puntajes.Agregar("usuario3", 2525);

        //---------------------Índice de un Libro de Algoritmos---------------------------
        //---------------------Inscripción por Alumno---------------------------
        //---------------------DNS (Domain Name System)---------------------------
        //---------------------Chipotle Support Bot (Meme Context)---------------------------




    }


}