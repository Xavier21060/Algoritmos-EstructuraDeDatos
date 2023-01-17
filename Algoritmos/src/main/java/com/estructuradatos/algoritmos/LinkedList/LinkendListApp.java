package com.estructuradatos.algoritmos.LinkedList;

public class LinkendListApp {

    public static void main(String[] args) {

        SimpleLinkedList list = new SimpleLinkedList();
        list.push(1.23);
        list.push(19.23);
        list.push(12.23);

        list.printContent();


        Node nodo = list.insert(19.23, 34.56);

        if (nodo == null) {

            System.out.println("No se pudo insertar un nuevo nodo");
        } else {
            System.out.println("El nodo se ha insertado correctamente");
        }

        System.out.println("el nuevo contenido de la lista enlazada es: ");
        list.printContent();

        nodo = list.contains(4.57);

        if (nodo != null) {
            System.out.println("El nodo no se ha encontrado");
        } else {
            System.out.println("El valor 1.23 se ha encontado en la lista");
        }

        while (!list.isEmpty()) {
            nodo = list.pop();
            System.out.println("Nodo eliminado");
            nodo.showContent();
        }

        list.printContent();
    }
}
