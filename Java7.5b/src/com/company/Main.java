package com.company;
public class Main {

    public static class Node
    {
        int info;
        Node next;
    }

    static Node push(Node head_ref, int new_data)
    {
        Node new_node = new Node();
        new_node.info = new_data;
        new_node.next = (head_ref);
        (head_ref) = new_node;
        return head_ref;
    }

    static void printList(Node node)
    {
        if (node != null) {
            printList(node.next);
            System.out.print(node.info + " ");
        }
    }

    static void print(Node node)
    {
        while (node != null)
        {
            System.out.print(node.info + " ");
            node = node.next;
        }
    }

    public static void main(String[] args)
    {
        Node head = null;
        head = push(head, 100);
        head = push(head, 75);
        head = push(head, 50);
        head = push(head, 25);
        System.out.print("Elementele listei sunt: ");
        print(head);
        System.out.print("\n"+"Elementele listei in ordine inversa sunt: ");
        printList(head);
    }
}
