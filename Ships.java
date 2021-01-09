package SchiffeVersenken;

public class Ships {
    //Attributes
    private int numberOfShips;
    //Constructors
    //Methods
        //Set ships
    public void setShips(Matchfield matchfield){
        //Set ship positions
        int[][] shipPosition = new int[numberOfShips][numberOfShips];
        for (int i = 0; i < shipPosition.length; i++){
            for (int j = 0; j < 2; j++){
                shipPosition[i][j] = matchfield.randomNumber();
            }
        }
        //Print ship positions
        /*for (int i = 0; i < shipPosition.length; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(shipPosition[i][j]);
            }
            System.out.println();
        }*/
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
}
