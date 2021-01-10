package SchiffeVersenken;

import java.util.Scanner;

public class Player {
    //Attributes
    //Constructors
    //Methods
    public void insertIndex() {
        int indexHorizontal;
        int indexVertical;
        Scanner scCoordinates = new Scanner(System.in);
        System.out.println();
        System.out.println("Bitte geben Sie die Koordinaten für ein Feld ein: ");
        System.out.println("1. Horizontale Koordinate: ");
        indexHorizontal = scCoordinates.nextInt();
        System.out.println("2. Vertikale Koordinate: ");
        indexVertical = scCoordinates.nextInt();
        int playerCoordinates = Integer.parseInt(indexHorizontal + "" + indexVertical);
        System.out.println(playerCoordinates);
    }
    //Getter&Setter

}
