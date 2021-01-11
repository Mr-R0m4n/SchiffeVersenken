package SchiffeVersenken;

import java.util.Arrays;
import java.util.Scanner;

public class Matchfield{
    //Attributes
        private char[][] matchField;
        private int[] matchfieldIndex;
        private int size;
    //Constructors

    //Methods
        //Generate Matchfield array
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
        //Print Matchfield
        public void printMatchfield(){
            //Print matchfield array with index
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
        //Refresh Matchfield array
        public void refreshMatchfield(Ships ships, Player player){
            if (ships.getShipPosition().contains(player.playerCoordinates)){
                System.out.println("Treffer!");
                System.out.println();
                ships.getShipPosition().remove((Integer) player.playerCoordinates);
                this.matchField[player.getIndexVertical()-1][player.getIndexHorizontal()-1] = 'X';
            }
            else {
                System.out.println("Leider vorbei geschossen!");
                System.out.println();
                this.matchField[player.getIndexVertical()-1][player.getIndexHorizontal()-1] = 'O';
            }
        }

    //Getters&Setters
        public int[] getMatchfieldIndex() {
        return matchfieldIndex;
        }

        public void setMatchFieldSize() throws PlayerInputException{
            Scanner sc = new Scanner(System.in);
            this.size = sc.nextInt();
            if(this.size < 2 || this.size > 9){
                throw new PlayerInputException();
            }
            this.matchField = new char[size][size];
            this.matchfieldIndex = new int[size];

        }

        public int getSize() {
            return this.size;
        }
}

