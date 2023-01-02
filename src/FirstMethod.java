public class FirstMethod {
    public static void main(String[] args) {

        calculateScore(true, 800, 5, 100);
        System.out.println("Executed the calculate method.");
    }

    public static void calculateScore(boolean gameOver, int score, int levelCompleted, int bonus){
        int finalScore = score;

        if (gameOver) {
            finalScore += (levelCompleted * bonus);
            finalScore +=1000;
            System.out.println("Your final score was " + finalScore);
        }
    }
}
