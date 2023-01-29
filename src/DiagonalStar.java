public class DiagonalStar {
    public static void main(String[] args) {
        printSquareStar(8);
    }
    /*Logic behind the diagonal stars: The starts will print if -
    In the first or last row
    In the first or last column
    When the row number equals the column number
    When the column number equals rowCount - currentRow + 1 (where currentRow is current row number)
    */
    public static void  printSquareStar(int number){
        if (number<5){
            System.out.println("Invalid Value");
        }else{
            for (int row = 1; row<=number; row++){
                for (int col = 1; col<= number;col++){
                    if (row==1 || row ==number || col ==1 || col == number){
                        System.out.print("*");
                    }else if(row==col){
                        System.out.print("*");
                    }else if (col==(number-row)+1){
                        System.out.print("*");
                    }else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
    }
}
