package SchiffeVersenken;

import java.util.Random;

public class Matchfield{
    //Attributes
        private char[][] matchField;
        private int[] matchfieldIndex;
        private int size;
    //Constructors

    //Methods
        public void createMatchfield(){
            //Write matchfield index
            for (int im = 0; im < this.matchfieldIndex.length; im++) {
                this.matchfieldIndex[im] = im+1;
            }
            //Write matchfield field
            for (int i = 0; i < this.matchField.length; i++) {
                for (int j = 0; j < this.matchField[i].length; j++) {
                    this.matchField[i][j] = '~';
                }
            }
        }

        public static String IntIntoChar(char[] a) {
            //Modify Indexnumbers in to letters
            if (a == null)
                return "null";
            int iMax = a.length - 1;
            if (iMax == -1)
                return "[]";

            StringBuilder b = new StringBuilder();
            b.append(' ');
            for (int i = 0; ; i++) {
                b.append(a[i]);
                if (i == iMax)
                    return b.append(' ').toString();
                b.append(" ");
            }
        }

        public void printMatchfield(){
            //Print matchfield
            System.out.print(" ");
            char[] letters = new char[this.matchfieldIndex.length];
            for (int im = 0; im < this.matchfieldIndex.length; im++) {
                letters[im] =  (char)('A' + im);
            }
            System.out.println(IntIntoChar(letters));
            for (int i = 0; i < this.matchField.length; i++) {
                System.out.print(this.matchfieldIndex[i] + " ");
                for (int j = 0; j < this.matchField[i].length; j++) {
                    System.out.print(this.matchField[i][j] + " ");
                }
                System.out.println();
            }
        }

        public int randomNumber() {
            //Generate random number
            int min = 0;
            int max = ((this.size*this.size)-1);
            Random random = new Random();
            int randomInt = random.nextInt((max - min) + 1) + min;
            return randomInt;
        }

    //Getters&Setters
    public int getSize() {
        return size;
    }

    public int[] getMatchfieldIndex() {
        return matchfieldIndex;
    }

    public void setMatchFieldSize(int size){
        this.size = size;
        if(this.size < 0 || this.size > 9){
            System.out.println();
            System.out.println("Ungültige Eingabe!");
            System.out.println();
        }
        this.matchField = new char[this.size][this.size];
        this.matchfieldIndex = new int[this.size];
    }
}

