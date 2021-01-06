package SchiffeVersenken;

public class Main {

    public static void main(String[] args) {

        //Spielfeld
        Matchfield matchfield = new Matchfield();
        //Spielfeldgröße festlegen
        matchfield.setMatchFieldSize();
        //Spielfeld erstellen
        matchfield.createMatchfield();
        //Spielfeld darstellen
        matchfield.printMatchfield();

    }
}
