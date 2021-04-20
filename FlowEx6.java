import java.util.*;

public class FlowEx6 {
    public static void main(String[] args) {
        System.out.print("month : ");

        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();

        switch(month) {
            case 3: case 4: case 5:
                System.out.println("season : spring");
                break;
            case 6: case 7: case 8:
                System.out.println("season : summer");
                break;
            case 9: case 10: case 11:
                System.out.println("season : fall");
                break;
            case 12: case 1: case 2:
                System.out.println("season : winter");
        }
    }
    
}
