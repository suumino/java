import java.util.*;

public class main_3 {
    public static void main(String[] args) {


    //     // 7-1

    //     Scanner sc = new Scanner(System.in);
    //     System.out.print("input : ");
    //     int x = sc.nextInt();

    //     int s = signOf(x);
    //     System.out.println("signOf(x) : " + s);
    // }

    // static int signOf(int n) {
    //     if (n > 0) return 1;
    //     else if (n < 0) return -1;
    //     else return 0;
    // }


    // 7-2
    
    // Scanner sc = new Scanner(System.in);

    // System.out.print("a : ");
    // int a = sc.nextInt();
    // System.out.print("b : ");
    // int b = sc.nextInt();
    // System.out.print("c : ");
    // int c = sc.nextInt();

    // int s = min(a, b, c);
    // System.out.println("min : " + s);
    // }


    // static int min(int a, int b, int c) {
    //     int m = 0;
    //     if (a <= b && a <= c) m = a;
    //     else if (b <= a && b <= c) m = b; 
    //     else if (c <= a && c <= b) m = c;
    //     return m;
    // }

    // 7-3

    // Scanner sc = new Scanner(System.in);

    // System.out.print("a : "); int a = sc.nextInt();
    // System.out.print("b : "); int b = sc.nextInt();
    // System.out.print("c : "); int c = sc.nextInt();

    // int s = med(a, b, c);
    // System.out.println("med : " + s);
    // }


    // static int med(int a, int b, int c) {
    //     int m = a;
    //     if (c <= b && c >= a || c <= a && c >= b) m = c;
    //     else if (b <= a && b >= c || b <= c && b >= a) m = b; 
    //     return m;
    // }


    // 7-4

    // Scanner sc = new Scanner(System.in);

    // System.out.print("x : "); int x = sc.nextInt();


    // int s = sumUp(x);
    // System.out.println("sum : " + s);
    // }


    // static int sumUp(int x) {
    //     int sum = 0;
    //     for (int i = 0; i <= x; i++) sum += i;
    //     return sum;
    // }


    // 7-6

    // Scanner sc = new Scanner(System.in);
    // System.out.print("month : "); int n = sc.nextInt();

    // String s = mon(n);
    // System.out.println("season : " + s);

    // }

    // static String mon(int n) {
    //     String m = "";
    //     switch (n) {
    //         case 12: case 1: case 2:
    //         m = "winter"; break;

    //         case 3: case 4: case 5:
    //         m = "spring"; break;

    //         case 6: case 7: case 8:
    //         m = "summer"; break;

    //         case 9: case 10: case 11: 
    //         m = "fall"; break;
    //     }
    //     return m;
    // }


    // 7-7

    // Scanner sc = new Scanner(System.in);

    // System.out.print("c : "); String c = sc.next();
    // System.out.print("n  :"); int n = sc.nextInt();

    // putStar(c, n);

    // }

    // static void putStar(String c, int n) {
    //     for (int i = 0; i <= n; i++) {
    //         putChar(c, i);
    //         System.out.println();
    //     }
    // }

    // static void putChar(String c, int n) {
    //     for (int i = 0; i <= n; i++) {
    //         System.out.print(c);
    //     }
    // }


    // 7-8

    // Scanner sc = new Scanner(System.in);
    

    // System.out.print("a : "); int a = sc.nextInt();
    // System.out.print("b : "); int b = sc.nextInt();

    // int x = random(a, b);
    // System.out.println("random number : " + x);

    // }

    // static int random(int a, int b) {
    //     int m = 0;;
    //     Random rand = new Random();
    //     m = a + rand.nextInt(b-a+1);
    //     return m;
    // }


    // 7 - 9

    // re();
    // }

    // static void re() {
    //     Scanner sc = new Scanner(System.in);
    //     int n = -1;
    
    //     do {
    //         System.out.print("n : "); n = sc.nextInt();
    //     } while (n <= 0);
        
    //     readPlusInt(n);
    // }

    // static void readPlusInt(int n) {

    //     do {
    //         System.out.print(n%10);
    //         n = n/10;
 
    //     } while(n > 0);
    //     System.out.println();
        
    //     Scanner sc = new Scanner(System.in);
    //     System.out.print("again? <Yes...1/No...0> : "); int s = sc.nextInt();
    //     if (s == 1) re();
    // }
    

    // 7-10


    // Scanner sc = new Scanner(System.in);
    // Random rand = new Random();

    // System.out.println("caculation practice!!");

    // do {
    // int x = rand.nextInt(900) + 100;
    // int y = rand.nextInt(900) + 100;
    // int z = rand.nextInt(900) + 100;
    // int p = rand.nextInt(4);        

    // int answer = 0;
    // switch (p){
    //     case 0: answer = x + y + z; break;
    //     case 1: answer = x + y - z; break;
    //     case 2: answer = x - y + z; break;
    //     case 3: answer = x - y - z; break;

    // }while(true){
    // System.out.print(x + ((p<2) ? "+":"-")+y+((p%2==0) ? "+":"-")+z+"=");
    // int k = sc.nextInt();
    // if (k==answer)
    //     break;
    // System.out.println("not answer");
    // }

    // }while(retry());
    // } // main end

    // static boolean retry() {
    // Scanner sc = new Scanner(System.in);
    // int cond;
    // do {
    //     System.out.print("again? <Yes...1/No...0> :");
    //     cond = sc.nextInt();
    // }while (cond != 0 && cond != 1);
    // return cond == 1;
    // }


        // 7-19

        Scanner sc = new Scanner(System.in);

        System.out.print("number : "); int n = sc.nextInt();

        int[] a = new int[n];

        for (int i= 0; i < n; i++) {
            System.out.print("a["+i+"] = "); a[i] = sc.nextInt();
        }

        System.out.print("delet index : "); int d = sc.nextInt();
        System.out.print("how many? : "); int e = sc.nextInt();

        aryRmv(a, d, e);

        for (int i = 0; i < n; i++) {
            System.out.println("a["+i+"] = "+a[i]);
        }
    }

    static void aryRmv(int[]a, int d, int e) {
        if (e > 0 && d >= 0 && d+e < a.length) {
            int d2 = d + e - 1;
            if (d2 > a.length -e -1) d2 = a.length -e -1;
            for (int i = d; i <= d2 ; i++) {
                a[i] = a[i+e];
            } 
        }
    }







    



    
}