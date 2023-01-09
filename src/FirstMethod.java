public class FirstMethod {
    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;
    //calling method by variable arguments
        System.out.println("Final score is : "+calculateScore(gameOver,score,levelCompleted,bonus));
    //calling method by literals
        System.out.println("Final score is : "+calculateScore(true, 800, 5, 100));
    }
    //Method
    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus){
        int finalScore = score;

        if (gameOver) {
            finalScore += (levelCompleted * bonus);
            finalScore +=1000;
        }
        return finalScore;
    }
}
