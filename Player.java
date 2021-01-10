package SchiffeVersenken;

import java.util.Scanner;
import java.lang.Character;

public class Player {
    //Attributes
    private int indexHorizontal;
    private int indexVertical;

    //Constructors
    //Methods
    public void insertIndex() {
        Scanner scCoordinates = new Scanner(System.in);
        System.out.println();
        System.out.println("Bitte geben Sie die Koordinaten für ein Feld ein: ");
        System.out.println("1. Horizontale Koordinate: ");
        this.indexHorizontal = scCoordinates.nextInt();
        System.out.println("2. Vertikale Koordinate: ");
        this.indexVertical = scCoordinates.nextInt();
        System.out.print(this.indexHorizontal);
        System.out.println(this.indexVertical);
    }
    //Getter&Setter
    public int getIndexHorizontal() {
        return indexHorizontal;
    }

    public int getIndexVertical() {
        return indexVertical;
    }
}
