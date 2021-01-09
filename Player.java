package SchiffeVersenken;

import java.util.Scanner;
import java.lang.Character;

public class Player {
    //Attributes
    private char indexHorizontal;
    private int indexVertical;


    //Constructors
    //Methods
    public void insertIndex() {
        Scanner scCoordinates = new Scanner(System.in);
        System.out.println();
        System.out.println("Bitte geben Sie die Koordinaten für ein Feld ein: ");
        System.out.println("1. Horizontale Koordinate (Buchstabe): ");
        this.indexHorizontal = scCoordinates.next().charAt(0);
        if(!Character.isLetter(this.indexHorizontal)){
            System.out.println("Ungültige Eingabe!");
            System.out.println();
        }
        else {

            System.out.println("2. Vertikale Koordinate (Zahl): ");
            this.indexVertical = scCoordinates.nextInt();
            System.out.print(this.indexHorizontal);
            System.out.println(this.indexVertical);
        }
    }
    //Getter&Setter
    public char getIndexHorizontal() {
        return indexHorizontal;
    }

    public int getIndexVertical() {
        return indexVertical;
    }
}
