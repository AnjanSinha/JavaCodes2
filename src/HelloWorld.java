public class HelloWorld {
    public static void main(String[] args) {
        /*boolean isYear = true;
        if (isYear == true){
            System.out.println("Happy new Year");
        }*/
        int topScore = 30;
        if ((topScore > 100) && (topScore <150)){
            System.out.println("Got the highest score.");
        }

        if ((topScore > 100)||(topScore == 30)){
            System.out.println("Either or both of the conditions are true.");
        }

        boolean isCar = true;
        if (!isCar){  //the '!' operator before isCar simply means if the (isCar != true)
            System.out.println("This is true.");
        }

        String companyName = "Tata";
        boolean isIndian = companyName == "Tata" ? true : false;
        /*if (isIndian){
            System.out.println("This is an Indian company.");
        }*/
        System.out.println((companyName == "Tata" ? true : false));
        String text = (isIndian) ? "This is an Indian company" : "Not an Indian Company";
        System.out.println(text);

        int ageStudent = 14;
        String ageText = (ageStudent>=18) ? "Student is adult." : "Student is amateur.";  //assigning return value in a string.
        System.out.println(ageText);    //printing the return value
        System.out.println(((ageStudent>=18) ? "Student is adult." : "Student is amateur."));  //One line output
    }
}
