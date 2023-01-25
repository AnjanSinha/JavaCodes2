public class whileLoopChallenge {
    public static void main(String[] args) {
        int number = 4, evenCount = 0, oddCount = 0;
        while ( number<=20 ) {
            number++;
            if (!isEvenNumber(number)){
                oddCount++;
                continue;       //Using continue statement to ignore the rest codes for odd numbers.
            }
            System.out.println(number+ " is an even number.");
            evenCount++;
            if (evenCount==5){
                System.out.println("Total no of Even Numbers: "+ evenCount);
                System.out.println("Total no of Even Numbers: "+ oddCount);
                break;
            }
        }
    }
    public static boolean isEvenNumber(int num){
        return (num%2==0);
    }
}
