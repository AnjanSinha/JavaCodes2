public class MethodOverloading {
    public static void main(String[] args) {
        int finalScore = calculateScore("Anjan",60);
        System.out.println("Final Score = "+finalScore);

        int finalScore1 = calculateScore(80);
        System.out.println("Final Score = "+finalScore1);

        int noValue = calculateScore();
        System.out.println(noValue);
    }
    public static int calculateScore(String playerName, int score){
        System.out.println("Player "+ playerName + " scored " + score);
        return score*100;
    }
    public static int calculateScore(int score){
        System.out.println("Anonymous player scored " + score);
        return score*100;
    }
    public static int calculateScore(){
        System.out.println("No player name and no score received.");
        return 0;
    }
}
