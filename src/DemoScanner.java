import java.util.Scanner;

public class DemoScanner {
    public static void main(String[] args) {
        System.out.println(getInput(2023));
    }
    public static String getInput(int currentYear){
        Scanner sc = new Scanner(System.in);
        System.out.print("Please Enter your name: ");
        String name = sc.nextLine();
        System.out.println("Hello, " + name + " Welcome to Java.");
        boolean validDob = false;
        int age = 0;
        do{
            System.out.print("Enter your birth year : ");
            try{
                age = checkData(currentYear,sc.nextLine());
                validDob = age < 0? false: true;
            }catch (NumberFormatException badUserData){
                System.out.println("Characters are not allowed.");
            }
        }while (!validDob);

        return "Hello "+ name + " You are "+ age + " old.";
    }
    public static int checkData ( int currentYear, String Dob){
        int minYear = currentYear - 125;
        int dob = Integer.parseInt(Dob);
        if ( dob < minYear || dob > currentYear){
            return -1;
        }
        return currentYear - dob;
    }
}
