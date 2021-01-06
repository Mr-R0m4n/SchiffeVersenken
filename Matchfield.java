package SchiffeVersenken;

import java.util.Scanner;

public class Matchfield{
        Scanner scSize = new Scanner(System.in);
    //Attributes
        private int fields;
        private char[][] matchField = new char[fields][fields];
    //Constructors
        public Matchfield(int fields){
            this.fields = fields;
    }
    //Methods
        public void createMatchfield(){
            for (int i1 = 0; i1 < matchField.length; i1++){
                for (int i2 = 0; i2 < matchField[i1].length; i2++){
                    matchField[i1][i2] = '~';
                }
            }
        }

        public void printMatchfield(){
            for(char[] field : matchField) {
                System.out.println(field);
            }
        }

    //Exceptions

    //Getters&Setters
}
