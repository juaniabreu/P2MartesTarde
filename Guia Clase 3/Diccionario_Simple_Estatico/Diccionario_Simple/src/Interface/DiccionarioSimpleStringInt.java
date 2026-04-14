package Interface;

public interface DiccionarioSimpleStringInt {
    void InicializarDiccionario();
    void Agregar(String clave, int valor);
    void Eliminar(String clave);
    String[] Claves();
}