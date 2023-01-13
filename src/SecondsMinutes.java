public class SecondsMinutes {
    public static void main(String[] args) {
        System.out.println(getDurationString(3945));
        System.out.println(getDurationString(65,-45));
    }
    public static String getDurationString(int seconds){
        return (seconds<0)?"Invalid data for seconds.":getDurationString((seconds/60),(seconds%60));    //Using ternary operator instead if else
    }
    public static String getDurationString(int minutes , int seconds){
        return (minutes<0)?"Minutes can't be less than zero.":(seconds<0)||(seconds>59)?"Invalid data for seconds.":(minutes/60)+ "h "+ (minutes%60) + "m "+seconds +"s";
    }
}