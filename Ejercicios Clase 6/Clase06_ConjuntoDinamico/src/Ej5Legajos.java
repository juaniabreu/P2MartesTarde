package src;

import Interface.ConjuntoTDA;
import Implementacion.ConjuntoDinamico;

public class Ej5Legajos {
    public static void main(String[] args) {
        ConjuntoTDA legajos = new ConjuntoDinamico();
        legajos.InicializarConjunto();

        agregarAlumno(legajos, 10);
        agregarAlumno(legajos, 20);
        agregarAlumno(legajos, 10); //prueba de duplicado
    }

    public static void agregarAlumno(ConjuntoTDA legajos, int legajo) {
        if (!legajos.Pertenece(legajo)) {
            legajos.Agregar(legajo);
            System.out.println("Alumno agregado: " + legajo);
        } else {
            System.out.println("Legajo duplicado: " + legajo);
        }
    }
}