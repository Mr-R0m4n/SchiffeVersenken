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
        ArrayList<Integer> shipPosition = new ArrayList<Integer>();
        while(shipPosition.size() < this.numberOfShips) {
            int a = random.nextInt(matchfield.getSize()*matchfield.getSize());
            if(!shipPosition.contains(a)){
                shipPosition.add(a);
            }
        }
        for (int i = 0; i < shipPosition.size(); i++){
            System.out.println(shipPosition.get(i));
        }
    }

    //Getter&Setter
    public void setNumberOfShips(int numberOfShips, Matchfield matchfield) {
        if(numberOfShips < 1 || numberOfShips > (matchfield.getSize()*matchfield.getSize()/2)){
            System.out.println();
            System.out.println("Ungültige Eingabe!");
            System.out.println();
        }
        this.numberOfShips = numberOfShips;
    }
}
