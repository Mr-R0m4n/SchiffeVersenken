package SchiffeVersenken;

public class Ships {
    //Attributes
    private int numberOfShips;
    private int[] shipPosition;
    //Constructors
    //Methods
        //Set ships
    public void setShips(RandomGenerator random){
        //Set ship positions
        this.shipPosition = new int[numberOfShips];
        for (int i = 0; i < this.shipPosition.length; i++){
            this.shipPosition[i] = random.randomNumber();
        }

        //Print ship positions
        for (int j : shipPosition) {
            System.out.print(j);
        }
        System.out.println();

    }

    //Getter&Setter
    public void setNumberOfShips(int numberOfShips, RandomGenerator random) {
        if(numberOfShips < 1 || numberOfShips > random.getMaxNumber()){
            System.out.println();
            System.out.println("Ungültige Eingabe!");
            System.out.println();
        }
        this.numberOfShips = numberOfShips;
    }
}
