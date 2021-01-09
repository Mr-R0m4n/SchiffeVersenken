package SchiffeVersenken;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Ships {
    //Attributes
    private int numberOfShips;
    private int[] shipPosition;
    //Constructors
    //Methods
        //Set ships
    public void setShips(Matchfield matchfield){
        //Set ship positions
        this.shipPosition = new int[numberOfShips];
        for (int i = 0; i < this.shipPosition.length; i++){
            this.shipPosition[i] = matchfield.randomNumber();
        }

        //Print ship positions
        for (int i = 0; i < shipPosition.length; i++) {
            System.out.print(this.shipPosition[i]);
        }
        System.out.println();

    }

    //Getter&Setter
    public void setNumberOfShips(int numberOfShips, Matchfield matchfield) {
        if(numberOfShips < 1 || numberOfShips > matchfield.getSize()){
            System.out.println();
            System.out.println("Ungültige Eingabe!");
            System.out.println();
        }
        this.numberOfShips = numberOfShips;
    }

    public void compareShipPositionWithInsertIndex(Player player){

    }
}
