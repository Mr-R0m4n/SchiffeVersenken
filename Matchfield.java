package SchiffeVersenken;

public class Matchfield{
    //Attributes
        private char[][] matchField;
        private int[] matchfieldIndex;

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

        public void printMatchfield(){
            //Print matchfield
            System.out.print("  ");
            for (int i = 0; i < this.matchfieldIndex.length; i++) {
                System.out.print(this.matchfieldIndex[i] + " ");
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

