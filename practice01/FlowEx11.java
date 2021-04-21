import java.util.*;

public class FlowEx11 {
    public static void main(String[] args) {
        System.out.print("Resident registration number : ");

        Scanner sc = new Scanner(System.in);
        String regNo = sc.nextLine();
        char gender = regNo.charAt(7);

        switch(gender) {
            case '1': case '3':
            switch(gender) {
                case '1': 
                    System.out.println("~2000 man");
                    break;
                case '3':
                    System.out.println("2000~ man");
            }
            break;
            case '2': case '4':
            switch(gender) {
                case '2':
                    System.out.println("~2000 woman");
                    break;
                case '4':
                    System.out.println("2000~ woman");
            }
            break;
        }
    }
    
}
