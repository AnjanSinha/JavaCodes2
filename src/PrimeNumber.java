public class PrimeNumber {
    public static void main(String[] args) {
        int counter = 0;
        for (int i = 90; i<=100; i++){
            if (isPrime(i)){
                System.out.println(i);
                counter++;
                if (counter==3){
                    System.out.println("Found three prime numbers exiting the loop!");
                    break;
                }
            }
        }
    }
    public static boolean isPrime(int wholeNum){
        if (wholeNum <=2){
            return wholeNum==2;
        }
        for (int divisor = 2; divisor <= wholeNum/2; divisor++){
            if (wholeNum % divisor == 0){
                return false;
            }
        }
        return true;
    }
}
