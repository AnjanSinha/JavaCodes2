public class NumberToWords {
    public static void main(String[] args) {
        numberToWords(-12);
    }
    public static void numberToWords(int number){
        if (number<0){
            System.out.println("Invalid Value");
        }else {
            int count = getDigitCount(number);
            number = reverse(number);
            for (int i = 0 ; i<count; i++){
                switch (number%10){
                    case 1 -> System.out.println("One");
                    case 2 -> System.out.println("Two");
                    case 3 -> System.out.println("Three");
                    case 4 -> System.out.println("Four");
                    case 5 -> System.out.println("Five");
                    case 6 -> System.out.println("Six");
                    case 7 -> System.out.println("Seven");
                    case 8 -> System.out.println("Eight");
                    case 9 -> System.out.println("Nine");
                    default -> System.out.println("Zero");
                }
                number /= 10;
            }
        }
    }
    public static int reverse(int number){
        int reverse = 0, temp = number;
        while (temp != 0 ){
            reverse += temp%10;
            temp = temp/10;
            if (temp != 0){
                reverse *= 10;
            }
        }
        return reverse;
    }
    public static int getDigitCount(int number){
        if (number>0){
            int count = 0;
            while(number!=0){
                number /=10;
                count++;
            }
            return count;
        }else if (number==0){
            return 1;
        }
        return -1;
    }
}
