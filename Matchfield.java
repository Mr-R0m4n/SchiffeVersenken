package SchiffeVersenken;


public class Matchfield{
    //Attributes
        private int fields;
        private final char[][] matchField = new char[fields][fields];
    //Constructors
        public Matchfield(int fields){
            this.fields = fields;
    }
    //Methods
        public void createMatchfield(){
            for (int i1 = 0; i1 < this.matchField.length; i1++){
                for (int i2 = 0; i2 < this.matchField[i1].length; i2++){
                    this.matchField[i1][i2] = '~';
                }
            }
        }

        public void printMatchfield(){
            for (char[] fieldX : this.matchField) {
                for (char fieldY : fieldX) {
                    System.out.println(fieldY);
                }
                System.out.println();
            }
        }

    //Exceptions

    //Getters&Setters
}
