public class SumOfDigitsInNumber {
    public static void main(String[] args) {
        System.out.println("The sum of the digits is "+ sumDigits(4));
    }
    public static int sumDigits(int number){
        int sum = 0;
        if (number>=0){
            while (number != 0){
                sum += number%10;   //Keeps the most last digit
                number = number/10;     //Drops the most last digit.
            }
            return sum;
        }
        return -1;
    }
}
