import java.util.*;
public class FlowEx32 {
        public static void main(String[] args) {
            int menu = 0;
            int num = 0;

            Scanner sc = new Scanner(System.in);

            while(true) {
                System.out.println("(1) square");
                System.out.println("(2) square root");
                System.out.println("(3) log");
                System.out.print("menu : ");

                String tmp = sc.nextLine();
                menu = Integer.parseInt(tmp);

                if (menu == 0) {
                    System.out.println("turn off");
                    break;
                } else if (!(1 <= menu && menu <= 3)) {
                    System.out.println("wrong menu");
                    continue;
                }
                
            }
            System.out.println("your menu is "+ menu);
    }
    
}
