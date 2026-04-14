import Implementacion.*;
import Interfaces.PilaTDA;
import Interfaces.ColaTDA;

public class Main {
    public static void main(String[] args) {
        //cola dinamica
         ColaTDA colaD = new ColaDinamica();
         colaD.InicializarCola();
        colaD.Acolar(1);
        System.out.println("colaD apliado " + colaD.Primero());
        colaD.Acolar(5);
        System.out.println("colaD apliado " + colaD.Primero());
        colaD.Acolar(2);
        System.out.println("colaD apliado " + colaD.Primero());
        //pila dinamic

        PilaTDA pilaD = new PilaDinamica();
        System.out.println();
        pilaD.InicializarPila();
        while (!colaD.ColaVacia()){
            pilaD.Apilar(colaD.Primero());
            System.out.println("pilaD acolado " + pilaD.Tope());
            colaD.Desacolar();
        }
        System.out.println("ColaD vacio " + colaD.ColaVacia());

        //pila estatica
        PilaTDA pilaE = new Estrategia_1();
        pilaE.InicializarPila();
        while (!pilaD.PilaVacia()){
        pilaE.Apilar(pilaD.Tope());
        System.out.println("PilaE apliado " + pilaE.Tope());
        pilaD.Desapilar();
        }
        System.out.println("PilaD vacio " + pilaD.PilaVacia());

        //cola estatica
        ColaTDA colaE = new ColaEstatica();
        colaE.InicializarCola();
        while (!pilaE.PilaVacia()){
            colaE.Acolar(pilaE.Tope());
            System.out.println("ColaE acolado " + colaE.Primero());
            pilaE.Desapilar();
        }
        System.out.println("ColaE vacio " + pilaE.PilaVacia());


    }
}