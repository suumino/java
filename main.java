import java.util.*;

class main {
    public static void main(String[] args) {

        // 5-5
        // Scanner sc = new Scanner(System.in);
        // System.out.print("x: ");
        // double x = sc.nextInt();
        // System.out.print("y: ");
        // double y = sc.nextInt();
        // System.out.print("z: ");
        // double z = sc.nextInt();
        // System.out.println("avarage : " + ((x + y + z)/3));

        // 5-6
        // Scanner sc = new Scanner(System.in);
        // System.out.print("x: ");
        // double x = sc.nextInt();
        // System.out.print("y: ");
        // double y = sc.nextInt();
        // System.out.print("z: ");
        // double z = sc.nextInt();
        // System.out.println("avarage : " + ((x + y + z)/3.0));

        // 5-8

        // System.out.println("float\tint");

        // float x = 0.0F;
        // for (double i = 0; i <= 1000; i++, x += 0.001) {
        //     System.out.printf("\n%.7f    \t%.7f", x, (float)i/1000);
        // }


        // 6-1
        // double a[] = new double[5];

        // for (int i = 0; i < 5; i++){
        //     System.out.println("a["+i+"] = " + a[i]);
        // }

        // 6-2

        // int a[] = new int[5];

        // for (int i = 0; i < 5; i++) {
        //     int j = 5 - i;
        //     a[i] = j;
        //     System.out.println("a["+i+"] = " + a[i]);
        // }

        // 6-6

        // Scanner sc = new Scanner(System.in);

        // System.out.print("how many you need : ");
        // int n = sc.nextInt();

        // int a[] = new int[n];

        // for (int i= 0; i < n; i++) {
        //     System.out.print("a["+i+"] = ");
        //     a[i] = sc.nextInt();
        // }
        // System.out.println(a);


        // 6-7
        // Scanner sc = new Scanner(System.in); 
        // System.out.print("peopel : ");
        // int n = sc.nextInt();
        // int a[] = new int[5];
        // int sum = 0;

        // for (int i = 0; i < n ; i++) {
        //     System.out.print("number " + (i+1) + " : ");
        //      a[i] = sc.nextInt();
        //      sum += a[i];
        // }
        // System.out.println("sum : " + sum);
        // System.out.println("avarage : " + (double)(sum / n));

        // int max = 0;
        // int min = 100;
        // for (int j = 0; j < n; j++) {
        //     if (a[j] < min) min = a[j];
        //     if (a[j] > max) max = a[j];
        // }
        // System.out.println("max : " + max);
        // System.out.println("min : " + min);

        // 6-10
        //  Random rand = new Random();
        //  Scanner sc = new Scanner(System.in);
        //  System.out.print("number :");
        //  int n = sc.nextInt();
        //  int[] a = new int[n];

        //  for (int j = 0; j < n ; j++) {
        //      a[j] = 1 + rand.nextInt(9);
        //  }

        //  for (int j = 0; j < n; j++) {
        //     System.out.println("a["+j+"] = " +a[j]);           
        //  }


        // 6-11
        // Random rand = new Random();
        // Scanner sc = new Scanner(System.in);
        // System.out.print("number :");
        // int n = sc.nextInt();
        // int[] a = new int[n];

        // a [0] = 1+rand.nextInt(10);

        // for (int j = 1; j < n ; j++) {
        //     do {
        //         a[j] = 1+ rand.nextInt(10);
        //     } while (a[j] == a[j-1]);
        // }

        // for (int j = 0; j < n; j++) {
        //    System.out.println("a["+j+"] = " +a[j]);           
        // }


        // 6-12
        //  Random rand = new Random();
        //  Scanner sc = new Scanner(System.in);
        //  System.out.print("number :");
        //  int n = sc.nextInt();
        //  int[] a = new int[n];

        //  a [0] = 1+rand.nextInt(10);

        //  for (int j = 1; j < n ; j++) {
        //     do {
        //         a[j] = 1+ rand.nextInt(10);
        //         for (int k = 0; k < j; k++){ 
        //             if ( a[j] == a[k]) {
        //                 break;
        //             }
        //         }
        //     } while (k <j);
        // }
    

        //  for (int j = 0; j < n; j++) {
        //     System.out.println("a["+j+"] = " +a[j]);           
        //  }

        // 6-13

        // Random rand = new Random();
        // Scanner sc = new Scanner(System.in);
        // System.out.print("number :");
        // int n = sc.nextInt();
        // int[] a = new int[n];

        // for (int j = 0; j < n ; j++){
        //     System.out.print("a["+j+"] = ");
        //     a[j]= sc.nextInt();
        // }

        // System.out.println("shuffle");

        // for (int i = 0 ; i < n ; i++) {
        //     int x = rand.nextInt(n);
        //     int y = rand.nextInt(n);
        //     int t = a[x];
        //     a[x] = a[y];
        //     a[y] = t;
        // }

        // for (int j = 0; j < n ; j++){
        //     System.out.println("a["+j+"] = " + a[j]);
        // }


        // 6-14

        // Scanner sc = new Scanner(System.in);
        // System.out.print("number :");
        // int n = sc.nextInt();
        // int[] a = new int[n];

        // for (int j = 0; j < n ; j++){
        //     System.out.print("a["+j+"] = ");
        //     a[j]= sc.nextInt();
        // }

        // System.out.println("reverse");
        // for (int i = 0; i < n; i++) {
        //     int b = n-i-1;
        //     System.out.println("a["+i+"] = " + a[b]);
        // }

        // 6-15

        Random rand = new Random();
        Scanner sc = new Scanner(System.in);

        int re = 0;

        String[] months = {
            "Jan", "Feb", "Mar", "Apr", "May", "Jun", 
            "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"
        };            

        System.out.println("Quiz");
        do {
        int month = 1 + rand.nextInt(11);
            while(true) {      
                System.out.print(month + " : ");
                String s = sc.next();
                if (s.equals(months[month-1])) break;
                System.out.println("No");    
            }   
            System.out.print("Yes, again? 1...Yes / 0...No  :");
            re = sc.nextInt();
        } while (re == 1);










        
    }
}