package SchiffeVersenken;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Ships {
    //Attributes
    private int numberOfShips;
    private final ArrayList<Integer> shipPosition = new ArrayList<>();

    //Constructors
    //Methods
        //Set ships randomly
    public void setShips(Matchfield matchfield){
        int max = matchfield.getSize();
        int min = 1;
        Random random = new Random();
        while(this.shipPosition.size() < this.numberOfShips) {
            int a = min + random.nextInt(max - min+1);
            int b = min + random.nextInt(max - min+1);
            int c = Integer.parseInt(a + "" + b);
            if(!this.shipPosition.contains(c)){
                this.shipPosition.add(c);
            }
        }
        for (Integer position : this.shipPosition) {
            System.out.println(position);
        }
    }

    //Getter&Setter
    public void setNumberOfShips(Matchfield matchfield) throws PlayerInputException{
        Scanner sc = new Scanner(System.in);
        this.numberOfShips = sc.nextInt();
        if(numberOfShips < 1 || numberOfShips > (matchfield.getSize()*matchfield.getSize()/2)){
            throw new PlayerInputException();
        }
    }

    public ArrayList<Integer> getShipPosition() {
        return shipPosition;
    }
}
