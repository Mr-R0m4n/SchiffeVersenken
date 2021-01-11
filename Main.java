package SchiffeVersenken;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Matchfield matchfield = new Matchfield();
        Ships ships = new Ships();
        Player player = new Player();
        boolean loop = true;
        while (loop) {
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
                    System.out.println("Bitte geben Sie eine größe (2 - 9) für das Spielfeld ein: ");
                    //Set matchfieldsize
                        try {
                            matchfield.setMatchFieldSize();
                        } catch (PlayerInputException pie) {
                            System.out.println();
                            System.out.println("Ihr Eingabe war Ungültig");
                            System.out.println();
                            break;
                        }
                    System.out.println();
                    System.out.println("Wieviele Schiffe sollen auf dem Spielfeld generiert werden?");
                    System.out.println("         Wählen Sie eine Zahl zwischen 1 und " + ((matchfield.getSize()* matchfield.getSize()/2)) );
                    //Set number of ships
                        try {
                        ships.setNumberOfShips(matchfield);
                        } catch (PlayerInputException pie) {
                            System.out.println();
                            System.out.println("Ihr Eingabe war Ungültig");
                            System.out.println();
                            break;
                        }
                    System.out.println();
                    //Set chosen number of ships randomly in the matchfield
                    ships.setShips(matchfield);
                    System.out.println();
                    System.out.println("Ihr Spiel ist nun konfiguriert");
                    System.out.println("Sie können Ihr Spiel nun starten!");
                    System.out.println();
                }
                case 2 -> {
                    if (matchfield.getMatchfieldIndex() == null) {
                        System.out.println();
                        System.out.println("Bitte konfigurieren Sie zuerst das Spiel");
                        System.out.println();
                        break;
                    }
                    //Generate matchfield
                    matchfield.createMatchfield();
                    //Print matchfield
                    matchfield.printMatchfield();
                    //Loop Game till all Ships are hit
                    while (!ships.getShipPosition().isEmpty()) {
                        System.out.println();
                        //Insert Index for Field Player except a ship
                        try {
                            player.insertIndex(matchfield);
                        } catch (PlayerInputException pie) {
                            System.out.println();
                            System.out.println("Ihr Eingabe war Ungültig");
                            System.out.println();
                            break;
                        }
                        //Refresh Matchfield
                        matchfield.refreshMatchfield(ships, player);
                        //print matchfield
                        matchfield.printMatchfield();
                        System.out.println();
                        }
                        System.out.println();
                        System.out.println("**************************");
                        System.out.println("***!SIE HABEN GEWONNEN!***");
                        System.out.println("**************************");
                        System.out.println();
                        loop = false;

                }
                case 3 -> {
                    System.out.println();
                    System.out.println("Bis zum nächsten mal!");
                    loop = false;
                }
                default -> {
                    System.out.println();
                    System.out.println("Ihr Eingabe war Ungültig");
                    System.out.println();
                }
            }
        }
    }
}
