import java.util.Scanner;

class FlowEx3 {
    public static void main(String[] args) {
        System.out.print("number : ");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        if (input == 0) {
            System.out.println("this is 0");
        } else {
            System.out.println("this is not 0");
        }
    }
    
}
