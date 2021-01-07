package SchiffeVersenken;

import java.util.Arrays;
import java.util.Scanner;

public class Matchfield{
    //Attributes
        private char[][] matchField;
        private int[] matchfieldIndex;
    //Constructors

    //Methods
        public void setMatchFieldSize(){
            Scanner scSize = new Scanner(System.in);
            int size = scSize.nextInt();
            if(size < 0 || size > 9){
                System.out.println();
                System.out.println("Ungültige Eingabe!");
                System.out.println();
            }
            char[][] Matchfieldsize = new char[size][size];
            this.matchField = Matchfieldsize;

            int[] matchfieldIndex = new int[size];
            this.matchfieldIndex = matchfieldIndex;
        }

        public void createMatchfield(){
            //Matchfield index
            for (int im = 0; im < this.matchfieldIndex.length; im++) {
                this.matchfieldIndex[im] = im+1;
            }
            //Matchfield field
            for (int i = 0; i < this.matchField.length; i++) {
                for (int j = 0; j < this.matchField[i].length; j++) {
                    this.matchField[i][j] = '~';
                }
            }
        }

        public static String IntToChar(char[] a) {
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
            System.out.print(" ");
            char[] letters = new char[this.matchfieldIndex.length];
            for (int im = 0; im < this.matchfieldIndex.length; im++) {
                letters[im] =  (char)('A' + im);
            }
            System.out.println(IntToChar(letters));
            for (int i = 0; i < this.matchField.length; i++) {
                System.out.print(this.matchfieldIndex[i] + " ");
                for (int j = 0; j < this.matchField[i].length; j++) {
                    System.out.print(this.matchField[i][j] + " ");
                }
                System.out.println();
            }
        }

    //Exceptions

    //Getters&Setters

}

