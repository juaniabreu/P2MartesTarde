package Interface;

public interface ConjuntoTDAString {
    void InicializarConjunto();
    void Agregar(String x);
    void Sacar(String x);
    boolean ConjuntoVacio();
    boolean Pertenece(String x);
    String Elegir();
}
