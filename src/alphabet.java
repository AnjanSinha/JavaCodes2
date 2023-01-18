public class alphabet {
    public static void main(String[] args) {
        char alphabet = 'n';
        switch (alphabet){
            case 'A': case 'a':
                System.out.println("Able");
                break;
            case 'B': case 'b':
                System.out.println("Baker");
                break;
            case 'C': case 'c':
                System.out.println("Charlie");
                break;
            case 'D': case 'd':
                System.out.println("Dog");
                break;
            case 'E': case 'e':
                System.out.println("Easy");
                break;
            default:
                System.out.println(alphabet + " Letter not found.");
        }
    }
}
