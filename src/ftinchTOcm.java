public class ftinchTOcm {
    public static void main(String[] args) {
        System.out.println(convertToCentimeters(6));

        System.out.println(convertToCentimeters(6, 0));
    }
    public static double convertToCentimeters(int inches){
        return inches * 2.54;
    }
    public static double convertToCentimeters(int feet, int inches){
        return convertToCentimeters((feet * 12) + inches);
    }
}
