package com.coders.bay;

import java.util.Scanner;

public class zahleneigenschaften {
    public static void main(String[] args) {

        int num;

        Scanner sc = new Scanner(System.in);
        System.out.println("Bitte Zahl zur Überprüfung eingeben");
        num = sc.nextInt();

        //Runde Zahl
        if (num % 10 == 0) {
            System.out.println("Die Zahl ist rund!");
        } else {
            System.out.println("Die Zahl ist nicht rund!");
        }

        //Gerade / Ungerade
        if (num % 2 == 0) {
            System.out.println("Die Zahl ist gerade!");
        } else {
            System.out.println("Die Zahl ist ungerade!");
        }
        //Lieblingszahl
        if (num == 42) {
            System.out.println("Die Zahl ist meine Lieblingszahl!");
        } else {
            System.out.println("Die Zahl ist nicht meine Lieblingszahl :(");
        }
        //Länge 2 checken
        int length = String.valueOf(num).length();
        if (length == 2) {
            System.out.println("Die Zahl ist zweistellig!");
        } else {
            System.out.println("Die Zahl hat " + length + " Stellen!");
        }
    }
}
