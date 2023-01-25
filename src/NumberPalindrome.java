public class NumberPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
    }
    public static boolean isPalindrome (int number){
        int reverse = 0, temp = number;
        while (temp != 0 ){
            reverse += temp%10;
            temp = temp/10;
            if (temp != 0){
                reverse *= 10;
            }
        }
        return number==reverse;
    }
}
