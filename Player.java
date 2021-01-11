package SchiffeVersenken;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Player {
    //Attributes
    int playerCoordinates;
    int indexHorizontal = 1;
    int indexVertical = 1;
    //Constructors
    //Methods
        //Insert Index for Field Player except a ship
    public void insertIndex(Matchfield matchfield) throws PlayerInputException, InputMismatchException {
        Scanner scCoordinates = new Scanner(System.in);
        System.out.println();
        System.out.println("Bitte geben Sie die Koordinaten für ein Feld ein: ");
        System.out.println("1. Horizontale Koordinate: ");
        this.indexHorizontal = scCoordinates.nextInt();
        if(scCoordinates.hasNextInt()) {
            if (this.indexHorizontal < 1 || this.indexHorizontal > matchfield.getSize()) {
                throw new PlayerInputException();
            }
        }
        else{
            throw new InputMismatchException();
        }
        System.out.println("2. Vertikale Koordinate: ");
        this.indexVertical = scCoordinates.nextInt();
        if(scCoordinates.hasNextInt()) {
            if (this.indexVertical < 1 || this.indexVertical > matchfield.getSize()) {
                throw new PlayerInputException();
            }
        else {
            throw new InputMismatchException();
            }
        }
        this.playerCoordinates = Integer.parseInt(this.indexHorizontal + "" + this.indexVertical);
        System.out.println();
    }
    //Getter&Setter
    public int getIndexHorizontal() {
        return indexHorizontal;
    }

    public int getIndexVertical() {
        return indexVertical;
    }
}
