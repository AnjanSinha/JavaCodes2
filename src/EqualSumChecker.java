public class EqualSumChecker {
    public static boolean hasEqualSum(int num1, int num2, int num3){
        if (num2+ num1 == num3){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(hasEqualSum(1,1,0));
    }
}
