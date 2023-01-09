public class MethodChallenge {
    public static void displayHighScorePosition(String playerName, int playerPosition){
        System.out.println(playerName+ " managed to get into position "+playerPosition);
    }
    public static int calculateHighScorePosition(int playerScore){
        int pos = 4;
        if(playerScore>=1000){
            pos=1;
        } else if (playerScore>=500 ){      //The score which comes to this step already less than 1000,so we don't need to add the less than 1000 condition again.
            pos=2;
        } else if (playerScore>=100){
            pos=3;
        }
        return pos;  //The else statement will be unnecessary as the method can simply return a value for any other condition.
    }
    public static void main(String[] args) {
        int playerPosition=calculateHighScorePosition(500);
        displayHighScorePosition("John",playerPosition);
    }
}
