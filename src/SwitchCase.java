public class SwitchCase {
    public static void main(String[] args) {
        int value = 2;
        switch (value){
            case 1:
                System.out.println("Value was 1");
                break;
            case 2:
                System.out.println("Value was 2");
                break;
            case 3: case 4: case 5:
                System.out.println("Was 3 or 4 or 5");
                System.out.println("Actually it was : "+ value);
                break;
            default:
                System.out.println("Not 1, 2, 3, 4, 5 ");
                break;
        }
    }
}
