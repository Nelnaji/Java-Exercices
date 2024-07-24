package book.study;

import java.util.Random;
import java.util.Scanner;

public class Main {


    // this is a class
/*    public static void printItems(int whatever) {





        for (int i = 0; i < whatever; i++) {
            System.out.println(i);

        }


    }*/


    // this is the main app that will be executed
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean keepPlaying = true;
        String playerMove;

        // Invocation de l'utilitair random qui vas permettre de generer des nombres de manière aléatoire

        Random randomizer = new Random();
        //attention print de 0 à 5 non inclus
        int pionPositionRandom = randomizer.nextInt(0, 5);


        int[] plateau = new int[5];

        // place le pion de manière aléatoire
        plateau[pionPositionRandom] = 1;


        // Affichage du plateau dans la console.


        do {

            System.out.println("Pour bouger votre pion a gauche ou a droite veuillez taper G ou D et E pour arreter de jouer");

            System.out.print("> vous voulez bouger g / d ?");

            playerMove = sc.nextLine().toLowerCase();

            if (playerMove.equals("d")) {
                if (plateau[pionPositionRandom] == plateau.length - 1) {
                    plateau[pionPositionRandom] = 0;
                } else {
                    plateau[pionPositionRandom] = plateau[pionPositionRandom++];
                }

            } else if (playerMove.equals("g")) {

                if (plateau[pionPositionRandom] == 0) {
                    plateau[pionPositionRandom] = plateau.length - 1;
                } else {
                    plateau[pionPositionRandom] = plateau[pionPositionRandom--];
                }

            }

            if (playerMove.equals("e")) {
                keepPlaying = false;
            }

            for (int i = 0; i < 5; i++) {
                System.out.print(" " + plateau[i] + " ");
            }
        } while (keepPlaying);

        System.out.println(plateau.length);

    }
}