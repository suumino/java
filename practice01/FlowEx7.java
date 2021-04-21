import java.util.*;

public class FlowEx7 {
    public static void main(String[] args) {
        System.out.print("M(1), J(2), B(3) : ");

        Scanner sc = new Scanner(System.in);
        int user = sc.nextInt();
        int com = (int)(Math.random() + 3) + 1;

        System.out.println("you is "+user);
        System.out.println("computer is "+com);

        switch(user - com) {
            case 2: case -1:
                System.out.println("you lose");
                break;
            case 1: case -2:
                System.out.println("you win");
                break;
            case 0:
                System.out.println("same");
                break;
        }
    }
    
}
