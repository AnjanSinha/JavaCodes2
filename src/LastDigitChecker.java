public class LastDigitChecker {
    public static void main(String[] args) {
        System.out.println(hasSameLastDigit(11, 22, 31));

    }
    public static boolean hasSameLastDigit(int firstNumber, int secondNumber, int thirdNumber){
        if ( isValid(firstNumber) && isValid(secondNumber) && isValid(thirdNumber)) {
            int lastDigit1 = firstNumber % 10, lastDigit2 = secondNumber % 10, lastDigit3 = thirdNumber % 10;
            if( lastDigit1 == lastDigit2 || lastDigit1 == lastDigit3 || lastDigit2 == lastDigit3){
                return true;
            }
        }
        return false;
    }
    public static boolean isValid(int number){
        return number >= 10 && number <= 1000;
    }
}
