package SchiffeVersenken;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Player {
    //Attributes
    private char indexHorinzotal;
    private int indexvertical;

    //Constructors
    //Methods
    public void insertIndex() throws InputMismatchException {
        Scanner scCoordinates = new Scanner(System.in);
        System.out.println();
        System.out.println("Bitte geben Sie die Koordinaten für ein Feld ein: ");
        System.out.println("1. Horizontale Koordinate (Buchstabe): ");
        if(scCoordinates.hasNextInt()) {
            System.out.println("Ungültige Eingabe!");
            System.out.println();
        }
        else {
            this.indexHorinzotal = scCoordinates.next().charAt(0);
            System.out.println("2. Vertikale Koordinate (Zahl): ");
            this.indexvertical = scCoordinates.nextInt();
        }
        System.out.print(this.indexHorinzotal);
        System.out.println(this.indexvertical);
    }
}
