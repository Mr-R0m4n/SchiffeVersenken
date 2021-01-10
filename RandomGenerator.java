package SchiffeVersenken;

import java.util.Random;

public class RandomGenerator {
    //Attributes
    private int maxNumber;
    //Methods
    public int randomNumber() {
        //Generate random number
        int min = 0;
        int max = ((this.maxNumber*this.maxNumber)-1);
        Random random = new Random();
        return random.nextInt((max - min) + 1) + min;
    }
    //Getter&Setter
    public int getMaxNumber() {
        return maxNumber;
    }

    public void setShipPositions(int maxNumber){
        this.maxNumber = maxNumber;
        if(this.maxNumber < 0 || this.maxNumber > 9){
            System.out.println();
            System.out.println("Ungültige Eingabe!");
            System.out.println();
        }
    }

}
