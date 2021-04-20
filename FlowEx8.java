import java.util.*;

public class FlowEx8 {
    public static void main(String[] args) {
        System.out.print("Resident registration number : ");

        Scanner sc = new Scanner(System.in);
        String regNo = sc.nextLine();

        char gender = regNo.charAt(7);

        switch(gender) {
            case'1' : case '3':
                System.out.println("man");
                break;
            case '2': case '4':
                System.out.println("woman");
                break;
            default:
                System.out.println("wrong number");
        }
    }
    
}
