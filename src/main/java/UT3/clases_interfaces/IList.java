package UT3.clases_interfaces;

public interface IList<T> {

    public void insertarElemento(T elemento);
    public boolean eliminarElemento(int clave);
    public boolean buscarElemento(int clave);
    public boolean isEmpty();
    public int cantidadElementos();

}
