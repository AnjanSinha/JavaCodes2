public class IfElseChallenge {
    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 1000;
        int levelCompleted = 8 ;
        int bonus = 200;
        int finalScore = score;

        if (gameOver) {
            finalScore += (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
        }
    }
}
