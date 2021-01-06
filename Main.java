package SchiffeVersenken;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scMenu = new Scanner(System.in);
        int size = scMenu.nextInt();
        Matchfield matchfield = new Matchfield(size);

        matchfield.createMatchfield();
        matchfield.printMatchfield();

    }
}
