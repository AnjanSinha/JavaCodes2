public class CalculateMultipleInterest {
    public static void main(String[] args) {
        for (double rate=7.5; rate<=10; rate+=0.25){
            double interestAmount  = calculateInterest(100,rate);
            if (interestAmount>8.5){
                break;  //The break statement is used to break the loop and transfers the control out of the enclosing statement.
            }
            System.out.println(rate+ "% interest of 100 is " + interestAmount);
        }
    }
    public static double calculateInterest(double amount, double interest){
        return (amount* (interest/100));
    }
}
