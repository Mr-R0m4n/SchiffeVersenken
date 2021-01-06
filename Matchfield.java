package SchiffeVersenken;

import java.util.Scanner;

public class Matchfield{
    //Attributes
        private char[][] matchField;
    //Constructors

    //Methods
        public void setMatchFieldSize(){
            Scanner scSize = new Scanner(System.in);
            int size = scSize.nextInt();
            char[][] Matchfieldsize = new char[size][size];
            this.matchField = Matchfieldsize;
        }

        public void createMatchfield(){
            for (int i = 0; i < this.matchField.length; i++) {
                for (int j = 0; j < this.matchField[i].length; j++) {
                    this.matchField[i][j] = '~';
                }
            }
        }

        public void printMatchfield(){
            for (int i = 0; i < this.matchField.length; i++) {
                for (int j = 0; j < this.matchField[i].length; j++) {
                    System.out.print(this.matchField[i][j]);
                }
                System.out.println();
            }
        }

    //Exceptions

    //Getters&Setters

}

