public class BoxOfCandy
{   private Candy[][] box;
    public BoxOfCandy (Candy [][] b) {
        box= b;
    }
    /** box contains at least one row and is initialized in the constructor. */
    /**
    * Moves one piece of candy in column col, if necessary and possible, so that the box
    * element in row 0 of column col contains a piece of candy, as described in part (a).
    * Returns false if there is no piece of candy in column col and returns true otherwise.
    * Precondition: col is a valid column index in box. 
    */
    public String toString () {
        String s = "";
        for (int row= 0; row < box.length; row ++) {
            for (int col= 0; col < box[0].length; row ++) {
                s+= box [row][col] + " ";
            }
            s+="/n" ;
        }
        return s;
    }
    public boolean moveCandyToFirstRow(int col)
    { 
        
        
    }

    /**
    * Removes from box and returns a piece of candy with flavor specified by the parameter, or
    * returns null if no such piece is found, as described in part (b)
    */
    public Candy removeNextByFlavor(String flavor)
    { /* to be implemented in part (b) */ }

    // There may be instance variables, constructors, and methods that are not shown.
}