package Implementacion;

import Interface.DiccionarioMultipleTDA;
import Interface.DiccionarioSimpleStringInt;

public class PuntajeEsports implements DiccionarioSimpleStringInt {
    private static final int MAX = 100;
    private String[] claves;
    private int[] valores;
    private int cantidad;

    @Override
    public void InicializarDiccionario() {
        claves = new String[MAX];
        valores = new int[MAX];
        cantidad = 0;
    }

    @Override
    public void Agregar(String clave, int valor) {
        int i = 0;

        while (i < cantidad && claves[i] != clave) {
            i++;
        }

        if (i < cantidad) {
            valores[i] = valor; // actualiza si la clave ya existe
        } else if (cantidad < MAX) {
            claves[cantidad] = clave;
            valores[cantidad] = valor;
            cantidad++;
        }
    }

    @Override
    public void Eliminar(String clave) {
        int i = 0;

        while (i < cantidad && claves[i] != clave) {
            i++;
        }

        if (i < cantidad) {
            claves[i] = claves[cantidad - 1];
            valores[i] = valores[cantidad - 1];
            cantidad--;
        }
    }

    @Override
    public String[] Claves() {
        String[] aux = new String[cantidad];
        for (int i = 0; i < cantidad; i++) {
            aux[i] = claves[i];
        }
        return aux;
    }

}