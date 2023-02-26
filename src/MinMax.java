import java.util.Scanner;
public class MinMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double min = 0 , max = 0;
        int count = 0;
        while (true){
            System.out.println("Enter a number : ");
            String value = sc.nextLine();
            try {
                double number = Double.parseDouble(value);
                if (count==0 || number < min){
                    min = number;
                }
                if (count ==0 || number> max){
                    max = number;
                }
                count++;
            }catch (NumberFormatException nfe){
                break;
            }
        }
        if (count>0){
            System.out.println("The minimum number entered is : "+ min);
            System.out.println("The maximum number entered is : "+ max);
        }
        else {
            System.out.println("No valid dara entered.");
        }
    }
}
