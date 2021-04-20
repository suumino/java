import java.util.*;

class FlowEx28 {
    public static void main(String[] args) {
        int input = 0, answer = 0;

        answer = (int)(Math.random() * 100) +1;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("1 ~ 100 : ");
            input = sc.nextInt();

            if (input > answer ) {
                System.out.println("down");
            } else if (input <answer) {
                System.out.println("up");
            } 
        } while (input != answer);
        System.out.println("ok");
        
    }
}