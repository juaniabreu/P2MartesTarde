package Interface;

public interface DiccionarioSimpleStringString {
    void InicializarDiccionario();
    void Agregar(String clave, String valor);
    void Eliminar(String clave);
    String[] Claves();
}