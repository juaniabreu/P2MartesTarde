package Implementacion;
import Interface.ConjuntoTDAString;

public class ConjuntoEstaticoString implements ConjuntoTDAString {
    private String[] datos;
    private int cant;

    public void InicializarConjunto() {
        datos = new String[100];
        cant = 0;
    }

    public void Agregar(String x) {
        if (!Pertenece(x)) {
            datos[cant] = x;
            cant++;
        }
    }

    public void Sacar(String x) {
        for (int i = 0; i < cant; i++) {
            if (datos[i].equals(x)) {
                datos[i] = datos[cant - 1];
                cant--;
                return;
            }
        }
    }

    public boolean Pertenece(String x) {
        for (int i = 0; i < cant; i++) {
            if (datos[i].equals(x)) {
                return true;
            }
        }
        return false;
    }

    public String Elegir() {
        return datos[cant - 1];
    }

    public boolean ConjuntoVacio() {
        return cant == 0;
    }
}
