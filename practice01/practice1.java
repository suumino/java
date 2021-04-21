import java.util.Scanner;

class practice1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("input number : ");
        String input = sc.nextLine();
        int num = Integer.parseInt(input);

        System.out.println("zz" + input);
        System.out.printf("num = %d", num);
        
    }
}