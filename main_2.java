import java.util.*;

public class main {
    public static void main(String[] args) {

        // 6-16

        // Random rand = new Random();
        // Scanner sc = new Scanner(System.in);

        // int re = 0;

        // String[] weeks = {
        //     "Monday", "Thesday", "Wednesday", "Thursday", 
        //     "Friday", "Saturday", "Sunday"
        // };
        // String[] hangle = {"dnjf", "ghk", "tn", "ahr", "rma", "xh", "dlf"};            

        // System.out.println("Quiz");

        // int last = -1;

        // do {
        // int day;
        //     do {
        //         day = rand.nextInt(7);
        //     } while (day == last);
        //     last = day;

        //     while(true) {      
        //         System.out.print(hangle[day] + " : ");
        //         String s = sc.next();
        //         if (s.equals(weeks[day])) break;
        //         System.out.println("No");    
        //     }   
        //     System.out.print("Yes, again? 1...Yes / 0...No  :");
        //     re = sc.nextInt();
        // } while (re == 1);


        // 6-18

        // Scanner sc = new Scanner(System.in);

        // int[][] a = new int[4][3];
        // int[][] b = new int[3][4];
        // int[][] c = new int[4][4];

        // for (int i = 0; i < 4; i++){
        //     for (int j = 0; j < 3; j++) {
        //         System.out.print("a["+i+"]["+j+"] : ");
        //         a[i][j] = sc.nextInt();

        //     }
        // }
        // for (int i = 0; i < 3; i++){
        //     for (int j = 0; j < 4; j++) {
        //         System.out.print("b["+i+"]["+j+"] : ");
        //         b[i][j] = sc.nextInt();
        //     }
        // }

        // for (int i = 0; i < 4; i++){ 
        //     for (int j = 0; j < 4; j++) {
        //         c[i][j] = 0;
        //         for (int k = 0; k < 3; k++) {
        //             c[i][j] += a[i][k] * b[k][j];
        //         }
        //     }
        // }

        // for (int i = 0; i < 4; i++){ 
        //     for (int j = 0; j < 4; j++) {
        //         System.out.print(c[i][j] + "  ");       
        //     }
        //     System.out.println();
        // }

        // 6-19
        
        // Scanner sc = new Scanner(System.in);

        // System.out.println("6 students");

        // int[][] point = new int[6][2];
        // int[] sumStudent = new int[6];
        // int[] sumSubject = new int[2];

        // for (int i = 0; i < 6; i++) {
        //     System.out.print((i+1) + "\tlang : ");
        //     point[i][0] = sc.nextInt();
        //     System.out.print("\tmath : ");
        //     point[i][1] = sc.nextInt();

        //     sumStudent[i] = point[i][0] + point[i][1];

        //     sumSubject[0] += point[i][0];
        //     sumSubject[1] += point[i][1];
        // }

        // System.out.println("no.\tlang\tmath\tave");
        // for (int i = 0; i < 6; i++) {
        //     System.out.println((i+1) + "\t" + point[i][0] +"\t"
        //      + point[i][1] + "\t" + (double)sumStudent[i]/2);
        // }

        // System.out.printf("ave\t%.1f\t%.1f", 
        // (double)sumSubject[0]/6, (double)sumSubject[1]/6);


        // 6-21

        Scanner sc = new Scanner(System.in);

        System.out.print("number of class : ");
        int n = sc.nextInt();
        int[] cl = new int[n];
        int[] stu = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print((i+1) + " class's students : ");
            stu[i] = sc.nextInt();
            for (int j = 0; j < stu[i]; j++) {
                System.out.print((i+1)+" class "+(j+1)+" student score : ");
                cl[i] += sc.nextInt();
            }
        }

        System.out.println("class\tsum\tavr");
        System.out.println("-----------------------");
        for (int i = 0; i < n; i++) {
            System.out.printf((i+1) + "class\t"+cl[i]+"\t%.1f",(double)cl[i]/stu[i]);
            System.out.println();
        }
        System.out.println("-----------------------");
        System.out.printf("sum\t"+(cl[0]+cl[1])+"\t%.1f", (double)(cl[0]+cl[1])/(stu[0]+stu[1]));


        // 7-1





    }
}
