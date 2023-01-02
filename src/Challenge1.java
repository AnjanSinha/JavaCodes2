public class Challenge1 {
    public static void main(String[] args) {

        double var1 = 20.00d;
        double var2 = 80.00d;
        double myTotal = (var1 + var2) * 100.00d;
        System.out.println("My total values : " + myTotal);
        double remainder = myTotal % 40.00d;
        System.out.println(remainder);
        boolean returnValue = (remainder == 0) ? true : false;
        System.out.println(returnValue);

        if (!returnValue) {
            System.out.println("Got some remainder.");
        }

    }
}