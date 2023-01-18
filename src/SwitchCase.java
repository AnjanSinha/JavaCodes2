public class SwitchCase {
    public static void main(String[] args) {
        int value = 2;
        switch (value) {
            case 1 -> System.out.println("Value was 1");
            case 2 -> System.out.println("Value was 2");
            case 3, 4, 5 -> {
                System.out.println("Was 3 or 4 or 5");
                System.out.println("Actually it was : " + value);
            }
            default -> System.out.println("Not 1, 2, 3, 4, 5 ");
        }
        String month = "JANUARY";
        System.out.println("Month is in the " + getQuarter(month) + " quarter.");
    }
    public static String getQuarter(String month){
        return switch (month) {         //Here the switch statement is being used as an expression.
            case "JANUARY", "FEBRUARY", "MARCH" -> "1st";
            case "APRIL", "MAY", "JUNE" -> "2nd";
            default -> {
                String badResponse = month + " is bad Input.";
                yield badResponse;
            }
        };
    }
}
