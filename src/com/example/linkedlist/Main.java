package com.example.linkedlist;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        System.out.println("Hello, world!");
        System.out.println("Now list is empty!");
        printchoise();

        Scanner scan = new Scanner(System.in);
        String str = scan.next();

        LinkedList<Integer> linkedList = new LinkedList<Integer>();

        while (!str.equals("EXIT")){

            if (str.equals("NEW")) {
                newNumberEnter(linkedList, scan);
            }
            if (str.equals("EXIT")) {
                break;
            }
            if (str.equals("SEARCH")) {
                searchNumber(linkedList, scan);
            }

            printchoise();
            str = scan.next();
        }
        if (str == "EXIT") {
            System.exit(0);
        }
    }

    private static void newNumberEnter(LinkedList<Integer> linkedList, Scanner scan){
        System.out.println("Enter number which you want add in the list");
        int value = scan.nextInt();
        linkedList.addLast(value);
        System.out.println(linkedList);
    }

    private static void searchNumber(LinkedList<Integer> linkedList, Scanner scan){
        System.out.println("Enter element index");
        int numberIndex = scan.nextInt();
        System.out.println(linkedList.get(numberIndex-1));
    }

    private static void printchoise(){
        System.out.println("You have choise:");
        System.out.println("1) enter SEARCH for search number");
        System.out.println("2) enter NEW for add new number in the list");
        System.out.println("3) enter EXIT for exit from app");
    }
}

