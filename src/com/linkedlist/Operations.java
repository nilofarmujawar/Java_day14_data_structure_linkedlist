package com.linkedlist;



public class Operations {
    public static void addeElementAtStart() {

        LinkedList linkedList = new LinkedList();
        linkedList.push(70);
        linkedList.push(30);
        linkedList.push(56);

        linkedList.print();

    }

    public static void addElementAtEnd() {
        LinkedList linkedList = new LinkedList();
        linkedList.append(56);
        linkedList.append(30);
        linkedList.append(70);
        linkedList.print();
    }
}