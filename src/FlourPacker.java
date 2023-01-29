public class FlourPacker {
    public static void main(String[] args) {
        System.out.println(canPack(4, 18, 19));
    }
    public static boolean canPack(int bigCount, int smallCount, int goal) {
        boolean result;
        if (bigCount < 0 || smallCount < 0 || goal < 0) {   //When any of the parameters are negative.
            result = false;
        } else if (goal % 5 == 0 && goal / 5 <= bigCount) {     //When goal can be achieved by only using the 5 Kilos.
            result = true;
        } else if (goal <= smallCount) {    //When goal can't be achieved by 5 kilo but achieved by only using the 1 Kilos.
            result = true;
        } else{
            while(goal>=5){     //When goal is more/equal than 5 kilos then we can use the 5 kilos to fulfil the goal
                if( bigCount>0 ){   //If no of 5 kilos are available then
                    goal -= 5;      //Fulfil 5 kilo to goal
                    bigCount --;    //no of one five kilo should subtract after fulfilling goal with one five kilo
                }else{      //if the no of 5 kilos are 0 or finished during fulfilling the goal then break the loop
                    break;
                }
            }
            while ( goal>0){    //now when the goal is greater than zero after fulfilling with all 5 kilos or the goal is actually less than 5 kilo
                if(smallCount>0){   //if 1kilos are available to satisfy the goal
                    goal-=1;    //then try to fulfil the goal with one 1kilo
                    smallCount--;   //no of 1kilos used, so it should subtract from the previous count
                }else {     //If the no of 1kilos are also finished then break
                    break;
                }
            }
            result = (goal==0);     //return if the goal is satisfied or not after the process of fulfilling with 5 and 1 kilos
        }
        return result;
    }
}
