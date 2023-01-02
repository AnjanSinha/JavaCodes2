public class Keywords {
    public static void main(String[] args) {
        double kilometers = (100 * 1.609344);    //everything except datatype and semicolon is expression(operator,value,variable).
                                                //datatype and semicolon makes the line a valid statement.
        int highScore = 50;
        if (highScore > 25){
            highScore = 1000 + highScore;   //Three expressions are present in the if statement.
        }
        //if-then-else keyword
        int score = 500;

        if ((score >= 100) && (score <= 500)){
            System.out.println("Your score is in between 500-100");
        }else if(score < 100){
            System.out.println("Score is less than 100");
        }else{
            System.out.println("Score must be greater than 500.");
        }
    }
}
