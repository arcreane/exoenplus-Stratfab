package com.company;

import java.util.Scanner;


public class Menu {



    public static void displayMenu() {

        Scanner sc = new Scanner(System.in);


        System.out.println("Select your exercise : ");
        System.out.println("\t - Guess a number         type 1");
        System.out.println("\t - Palindrome             type 2");
        System.out.println("\t - Tableau                type 3");
        System.out.println("\t - Demineur:              type 4");
        System.out.println("\t - Quit :                 type 5");
    }

}