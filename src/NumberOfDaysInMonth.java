public class NumberOfDaysInMonth {
    public static void main(String[] args) {
        System.out.println(getDaysInMonth(8,2020));
        System.out.println(traditionalGetDaysInMonth(8,2020));
    }
    public static boolean isLeapYear(int year){
        if (year>0 && year<10000 && year%4==0){
            if (year%100==0 && year%400==0){
                return true;
            }
            else if (year%100!=0){
                return true;
            }
        }
        return false;
    }
    public static int getDaysInMonth(int month, int year){
        if (month>0 && month<13 && year>0 && year <10000){
            return switch (month){
                case 1, 3, 5, 7, 8, 10, 12 -> 31;
                case 2 -> {
                    if (isLeapYear(year)) {
                        yield 29;
                    } else {
                        yield 28;
                    }
                }
                case 4, 6, 9, 11 -> 30;
                default -> -1;
            };
        }
        else {
            return -1;
        }
    }
    //Using traditional switch statement.
    public static int traditionalGetDaysInMonth(int month, int year){
        if (month>0 && month<13 && year>0 && year <10000){
            switch (month){
                case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                    return 31;
                case 2:
                    if (isLeapYear(year)){
                        return 29;
                    }else {
                        return  28;
                    }
                case 4: case 6: case 9: case 11:
                    return 30;
                default:
                    return -1;
            }
        }
        else {
            return -1;
        }
    }}
