package book.study;

import java.util.Random;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Random randomizer = new Random();
        Scanner sc = new Scanner(System.in);
        int[] tableau = new int[5];

        int indexPion = randomizer.nextInt(0, 5);

        int[] nouveauTableauGauche = moveLeft(tableau, indexPion);

        System.out.println("Tableau après déplacement à gauche : ");
        for (int i : nouveauTableauGauche) {
            System.out.print(i + " ");
        }


    }


//Mouvement a gauche

    public static int[] moveLeft(int[] monTableau, int index) {
        if (index > 0 && index < monTableau.length) {
            int temp = monTableau[index];
            monTableau[index] = monTableau[index - 1];
            monTableau[index - 1] = temp;
        }
        return monTableau;
    }
    //mouvement a droite

    public static int[] moveRight(int[] monTableau, int index) {
        if (index >= 0 && index < monTableau.length - 1) {
            int temp = monTableau[index];
            monTableau[index] = monTableau[index + 1];
            monTableau[index + 1] = temp;
        }
        return monTableau;
    }




}
























































/*
    // this is a class
*//*    public static void printItems(int whatever) {





        for (int i = 0; i < whatever; i++) {
            System.out.println(i);

        }


    }*//*


    // this is the main app that will be executed
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean keepPlaying = true;

        // Invocation de l'utilitair random qui vas permettre de generer des nombres de manière aléatoire

        Random randomizer = new Random();
        //attention print de 0 à 5 non inclus
        int pionPositionRandom = randomizer.nextInt(0, 5);
        int indexPion = pionPositionRandom;

        int[] plateau = new int[5];


        // place le pion de manière aléatoire
        //        plateau[pionPositionRandom] = "Pion";


        // Affichage du plateau dans la console.


        do {

            for (int i = 0; i < plateau.length; i++) {
                System.out.print(" " + plateau[i] + " ");
            }
            System.out.println("Pour bouger votre pion a gauche ou a droite veuillez introduire g ou d, pour arreter de jouer introduisez la touche e");
            System.out.print("> vous voulez bouger g / d ?");
            String playerMove = sc.nextLine().toLowerCase();

            playerMove = sc.nextLine().toLowerCase();
            System.out.println();


            switch (playerMove) {
                case "d":
                    if (indexPion == plateau.length - 1) {
                        plateau[pionPositionRandom] = plateau[plateau.length - 1];

                        plateau[pionPositionRandom] = plateau[pionPositionRandom++];
                    }
                    ;
                    break;
                case "g":
                    if (indexPion == 0) {

                }
                ;
                break;
                case "e":
                    if {

                }
                ;
                break;
                default:
                    System.out.println("veuillez entrer les bonnes touches.");

            }

            if (playerMove.equals("d")) {

                if {
                }


            } else if (playerMove.equals("g")) {
                plateau[pionPositionRandom] = plateau[pionPositionRandom--];

            }

            if (playerMove.equals("e")) {
                keepPlaying = false;
                System.out.println("Merci d'avoir joué !");
            }

        } while (keepPlaying);


    }*/