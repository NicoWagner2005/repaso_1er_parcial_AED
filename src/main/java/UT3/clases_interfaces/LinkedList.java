package UT3.clases_interfaces;

import UT3.TA.Producto;

public class LinkedList<T> implements IList<T> {

    private class Nodo<T>{
        private final Comparable etiqueta;
        private T dato;
        private Nodo<T> siguienteNodo;

        public Nodo(Comparable etiqueta, T dato){
            this.etiqueta = etiqueta;
            this.dato = dato;
            this.siguienteNodo = null;
        }
    }


    public void insertarElemento(T elemento){

    }
    public boolean eliminarElemento(int clave){
        return true;
    }
    public boolean buscarElemento(int clave){
        return true;
    }
    public boolean isEmpty(){
        return true;
    }

    public int cantidadElementos(){
        return 1;
    }

}
