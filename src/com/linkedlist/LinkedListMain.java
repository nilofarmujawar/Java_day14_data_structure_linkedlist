package com.linkedlist;

import java.util.Scanner;

public class LinkedListMain {
    public static void main(String[] args) {
        System.out.println("Welcome to DataStructure Program On LinkedList ");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 1 to add the data at the start");

        switch (scanner.nextInt()) {
            case 1:
                Operations.addeElementAtStart();
        }

    }
}