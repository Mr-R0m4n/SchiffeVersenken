package SchiffeVersenken;

import java.util.Arrays;

public class Matchfield{
    //Attributes
        private char[][] matchField;
        private int[] matchfieldIndex;

    //Constructors

    //Methods
        public void createMatchfield(){
            //Write matchfield index
            for (int i = 0; i < this.matchfieldIndex.length; i++) {
                this.matchfieldIndex[i] = i+1;
            }
            //Write matchfield field
            for (char[] chars : this.matchField) {
                Arrays.fill(chars, '~');
            }
        }

        public void printMatchfield(){
            //Print matchfield
            System.out.print("  ");
            for (int index : this.matchfieldIndex) {
                System.out.print(index + " ");
            }
            System.out.println();
            for (int i = 0; i < this.matchField.length; i++) {
                System.out.print(this.matchfieldIndex[i] + " ");
                for (int j = 0; j < this.matchField[i].length; j++) {
                    System.out.print(this.matchField[i][j] + " ");
                }
                System.out.println();
            }
        }

    //Getters&Setters
    public int[] getMatchfieldIndex() {
        return matchfieldIndex;
    }

    public void setMatchFieldSize(int size){
        this.matchField = new char[size][size];
        this.matchfieldIndex = new int[size];
    }


}

