import java.util.Scanner;
public class InputCalculator {
    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }
    public static void inputThenPrintSumAndAverage(){
        Scanner sc = new Scanner(System.in);
        int sum = 0, count = 0 ; double average = 0;
        while (true){
            String value = sc.nextLine();
            try {
                int number = Integer.parseInt(value);
                sum += number;
                count++;
            }catch (NumberFormatException nfe){
                break;
            }
        }
        if (count>0){
            average = (double) sum/count;
            System.out.println("SUM = "+sum+" AVG = "+Math.round(average));
        }else{
            System.out.println("SUM = "+sum+" AVG = "+Math.round(average));
        }
    }
}
