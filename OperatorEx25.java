import java.util.*;

class OperatorEx25{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        char ch = ' ';

        System.out.printf("input : ");
        String input = sc.nextLine();
        ch = input.charAt(0);

        if ('0' <= ch && ch <= '9') {
            System.out.printf("this is number \n");
        }
        if (('a' <= ch && ch <= 'z') || ('A' <= ch && ch <= 'Z')) {
            System.out.printf("this is letter\n");
        }
    }
    
}
