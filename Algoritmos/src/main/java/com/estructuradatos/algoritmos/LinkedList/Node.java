package com.estructuradatos.algoritmos.LinkedList;


/**
 * Va a representar cada uno de los nodos
 */
public class Node {

    private Object data; //Contenido del Nodo
    private Node next; //Una referencia al siguiete nodo

    public Node(Object dato){
        this.data = dato;
    }

    public Object value(){
        return this.data;
    }

    public Node next(){
        return this.next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    //Imprimir el valor del nodo
    public void showContent(){
        System.out.println("Value: " + data);
    }

}
