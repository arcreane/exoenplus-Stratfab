package com.company;

import java.util.Scanner;


public class Menu {


    public static void displayMenu() {

        Scanner sc = new Scanner(System.in);



        System.out.println("Select your exercise : ");
        System.out.println("\t - Guess a number         type 1");
        System.out.println("\t - Palindrome             type 2");
        System.out.println("\t - Tableaux               type 3");
        System.out.println("\t - Demineur:              type 4");
        System.out.println("\t - Quit :                 type 5");

        int choice = sc.nextInt();

        switch (choice) {

            case 1:
                Exercice1.guessanumber();
                break;
            case 2:
                Exercice2.palindrome();
                break;
            case 3:
                Exercice3.tableaux();
                break;
            case 4:
                Exercice4.demineur();
                break;
            case 5:
                default:
                System.out.println("bye bye");
                System.out.println();
                displayMenu();

        }


    }
}