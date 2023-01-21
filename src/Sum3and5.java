public class Sum3and5 {
    public static void main(String[] args) {
        int sum = 0; int count =0;
        for (int i = 1; i<=1000; i++){
            if (i % 3==0 && i % 5 ==0){
                System.out.println("Found a match " + i);
                count++;
                sum +=i;
                if (count==5){
                    break;
                }
            }
        }
        System.out.println("Sum of the 5 numbers that are divisible by 5 & 3 is "+ sum);
    }
}
