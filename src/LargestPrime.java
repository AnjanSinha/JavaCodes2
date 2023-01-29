public class LargestPrime {
    public static void main(String[] args) {
        System.out.println(getLargestPrime(21));
    }
    public static int getLargestPrime(int num){
        int result = -1;
        for (int i=2 ; i<=num; i++){
            if ((num%i)==0){
                if (i==3){
                    result = i;
                }
                boolean prime = true;
                for (int divisor = 2; divisor <= i/2; divisor++){
                    if (i % divisor == 0){
                       prime = false;
                       break;
                    }
                }
                if (prime){
                    result = i;
                }
            }
        }
        return result;
    }
}
