public class FirstLastDigitSum {
    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(-5));
    }
    public static int sumFirstAndLastDigit( int number){
        if (number<0){
            return -1;
        }
        int lastDigit = number % 10;
        int sum = 0, remainder;
        while (number != 0 ){
            remainder = number % 10;
            number = number / 10;
            if (number==0){
                sum = lastDigit + remainder;
            }
        }
        return sum;
    }
}
