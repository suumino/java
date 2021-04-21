import java.util.*;

class FlowEx2 {
    public static void main(String[] args) {
        int input;

        System.out.print("number : ");

        Scanner sc = new Scanner(System.in);
        String tmp = sc.nextLine();
        input = Integer.parseInt(tmp);

        if (input == 0) {
            System.out.println("number is 0");
        }
        if (input != 0) {
            System.out.println("number is not 0");
            System.out.printf("number is %d", input);
        }
    }
    
}
