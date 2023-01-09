public class PositiveNegativeZero {

    //Normal Method
    public static void checkNumber(int number) {

        if (number > 0) {
            System.out.println("positive");
        } else if (number < 0) {
            System.out.println("negative");
        } else {
            System.out.println("zero");
        }
    }
    //Using Ternary operator
    public static void checkNumber1(int number){
        System.out.println((number>0)?"positive": (number<0)?"negative":"zero");
    }
    public static void main(String[] args) {
        checkNumber(-45);
        checkNumber1(78);
    }
}
