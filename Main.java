package SchiffeVersenken;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Spielfeld
        Matchfield matchfield = new Matchfield();
        Ships ships = new Ships();
        Player player = new Player();
        boolean loopGame = true;
        while (loopGame) {
            //Welcome screen
            System.out.println("-----------------------------------------");
            System.out.println("*****WILLKOMMEN ZU SCHIFFE VERSENKEN*****");
            System.out.println("-----------------------------------------");
            System.out.println();
            System.out.println("1 = Spiel konfigurieren");
            System.out.println("2 = Spiel starten");
            System.out.println("3 = Spiel beenden");
            System.out.println();
            System.out.println("-----------------------------------------");

            Scanner scMenu = new Scanner(System.in);
            switch (scMenu.nextInt()) {
                case 1 -> {
                    System.out.println();
                    System.out.println("Bitte geben Sie eine größe (1 - 9) für das Spielfeld ein: ");
                    //Spielfeldgröße festlegen
                    matchfield.setMatchFieldSize(scMenu.nextInt());
                    System.out.println();
                    System.out.println("Wieviele Schiffe sollen auf dem Spielfeld generiert werden?");
                    System.out.println("         Wählen Sie eine Zahl zwischen 1 und " + ((matchfield.getSize() * matchfield.getSize())-1));
                    //Set number of ships
                    ships.setNumberOfShips(scMenu.nextInt(), matchfield);
                    System.out.println();
                    //Set chosen number of ships randomly in the matchfield
                    ships.setShips(matchfield);
                }
                case 2 -> {
                    if (matchfield.getMatchfieldIndex() == null){
                        System.out.println();
                        System.out.println("Bitte konfigurieren Sie zuerst das Spiel");
                        System.out.println();
                    }
                    else {
                        System.out.println();
                        //Spielfeld erstellen
                        matchfield.createMatchfield();
                        //Spielfeld darstellen
                        matchfield.printMatchfield();
                        System.out.println();
                        player.insertIndex();
                    }
                }
                case 3 -> {
                    System.out.println();
                    System.out.println("Bis zum nächsten mal!");
                    loopGame = false;
                }
                default -> {
                    System.out.println();
                    System.out.println("Ungültige Eingabe!");
                    System.out.println("Bitte versuchen es Erneut!");
                    System.out.println();
                }
            }
        }
    }
}
