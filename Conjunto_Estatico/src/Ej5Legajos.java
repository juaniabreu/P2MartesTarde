import Interface.ConjuntoTDA;
import Implementacion.ConjuntoEstatico;

public class Ej5Legajos {
    public static void main(String[] args) {
        ConjuntoTDA legajos = new ConjuntoEstatico();
        legajos.InicializarConjunto();

        agregarAlumno(legajos, 10);
        agregarAlumno(legajos, 20);
        agregarAlumno(legajos, 10); // duplicado
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