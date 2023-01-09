public class SpeedConverter {
    // write your code here
    public static long toMilesPerHour(double kilometersPerHour){
        if(kilometersPerHour>=0){
            long km =Math.round((kilometersPerHour*0.621504039));
            return km;
        }
        return -1;
    }
    public static void printConversion(double kilometersPerHour){
        if (kilometersPerHour<0){
            System.out.println("Invalid Value");
        }
        else{
            System.out.println(kilometersPerHour+" km/h = "+toMilesPerHour(kilometersPerHour)+" mi/h");
        }
    }

    public static void main(String[] args) {
        printConversion(95.75);
    }
}