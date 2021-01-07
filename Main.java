package SchiffeVersenken;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Spielfeld
        Matchfield matchfield = new Matchfield();
        boolean loopGame = true;
        while (loopGame) {
            //Welcome screen
            System.out.println("-----------------------------------------");
            System.out.println("*****WILLKOMMEN ZU SCHIFFE VERSENKEN*****");
            System.out.println("-----------------------------------------");
            System.out.println();
            System.out.println("1 = Anzahl der Spieler");
            System.out.println("2 = Spiel konfigurieren");
            System.out.println("3 = Spiel starten");
            System.out.println("4 = Spiel beenden");
            System.out.println();
            System.out.println("-----------------------------------------");

            Scanner scMenu = new Scanner(System.in);
            switch (scMenu.nextInt()) {
                case 1 -> {
                    System.out.println();
                    System.out.println("1 Spieler");
                    System.out.println("2 Spieler");
                    System.out.println();
                }
                case 2 -> {
                    System.out.println();
                    System.out.println("Bitte geben Sie eine größe (Ganzzahl) für das Spielfeld ein");
                    //Spielfeldgröße festlegen
                    matchfield.setMatchFieldSize();
                    System.out.println();
                }
                case 3 -> {
                    System.out.println();
                    //Spielfeld erstellen
                    matchfield.createMatchfield();
                    //Spielfeld darstellen
                    matchfield.printMatchfield();
                    System.out.println();
                }
                case 4 -> {
                    System.out.println();
                    System.out.println("Bis zum nächsten mal!");
                    loopGame = false;
                }
                default -> {
                    System.out.println("Ungültige Eingabe!");
                    System.out.println("Bitte versuchen es Erneut!");
                }
            }
        }
    }
}
