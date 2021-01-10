package SchiffeVersenken;

import java.util.ArrayList;
import java.util.Random;

public class Ships {
    //Attributes
    private int numberOfShips;

    //Constructors
    //Methods
        //Set ships
    public void setShips(Matchfield matchfield){
        Random random = new Random();
        ArrayList<Integer> shipPosition = new ArrayList<>();
        while(shipPosition.size() < this.numberOfShips) {
            int a = random.nextInt(matchfield.getSize()*matchfield.getSize());
            if(!shipPosition.contains(a)){
                shipPosition.add(a);
            }
        }
        for (Integer integer : shipPosition) {
            System.out.println(integer);
        }
    }

    //Getter&Setter
    public void setNumberOfShips(int numberOfShips, Matchfield matchfield) {
        if(numberOfShips < 1 || numberOfShips > (matchfield.getSize()*matchfield.getSize()/2)){
            System.out.println();
            System.out.println("Ungültige Eingabe!");
            System.out.println();
        }
        else {
            this.numberOfShips = numberOfShips;
        }
    }
}
