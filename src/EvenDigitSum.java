public class EvenDigitSum {
    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(-22));
    }
    public static int getEvenDigitSum(int number){
        if ( number < 0 ){
            return -1;
        }
        int sum = 0, remainder;
        while ( number != 0){
            remainder = number % 10;
            number = number/10;
            if ( remainder % 2 == 0 ){
                sum += remainder;
            }
        }
        return sum;
    }
}
