import java.util.Scanner;
public class ReadingUserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double sum = 0;int count=1;
        do {
            System.out.print("Enter number "+count+ " :- ");
            String value = sc.nextLine();
            try {
                double number = Double.parseDouble(value);
                count++;
                sum+=number;
            }catch (NumberFormatException nfe){
                System.out.println("Invalid Number.");
            }
        }while (count <=5);
        System.out.println("The sum of the numbers is : "+sum);
    }
}
