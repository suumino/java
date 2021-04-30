import java.util.*;


 
//         // 8 -1
//         class Human {
//             String name;
//             int height;
//             int weight;
//         }

//         // 8-3

        

//         Car(String name, String number, int width, int height, 
//         int length, double tank, double x, double y, double fuel, double mpg) {
//             this.name = name;
//             this number = number; 
//             this width = width;
//             this.height = height;
//             this length = length;
//             this.tank = tank;
//             this.mpg = mpg;
//         }
//     }
// }
// class Car{
//     public String name;
//     public String number;
//     public int width;
//     public int height;
//     public int length;
//     public double tank;
//     public double x;
//     public double y;
//     public double fuel;
//     public double mpg;
// }



// 9-7

// class Period {
//     private Day from; 
//     private Day to;
  
//     public Period(Day form, Day to){
//       this.from = new Day(from);
//       this.to = new Day(to);
//     }
    
//     public Day getFrom() { return new Day(from); }
//     public Day getTo()   { return new Day(to); }
  
//     public String toString() {
//       return "{" + from + "~" + to + ")";
//     }
// }
  
  
//   class Main_04 {
//     public static void main(String[] args){
//       Period taejo = new Period(new Day(1392,8,5), new Day(1398,10,14));
  
//       System.out.println("taejo = "+ taejo);
//     }
// }
  

// 10-6

// class main_04 {
//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in); 
//         System.out.print("r : ");
//         double r = sc.nextDouble();

//         System.out.println("abs : " + Math.abs(r));
//         System.out.println("root : " + Math.sqrt(r));
//         System.out.println("width : " + (Math.PI*r*r));
//     }
// }
 

// 10-7

// class main_04 {
//     public static int min(int a, int b) {       
//         return a <= b? a: b;
//     }
//     public static int min(int a, int b, int c) {
//         int m = a;
//         if (b < m) m = b;
//         if (c < m) m = c;
//         return m; 
//     }
//     public static int max(int a, int b) {
//         return a >= b? a : b;
//     }
//     public static int max(int a, int b, int c) {
//         int m = a;
//         if (b > m) m = b;
//         if (c > m) m = c;
//         return m;
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("a : "); int a = sc.nextInt();
//         System.out.print("b : "); int b = sc.nextInt();
//         System.out.print("c : "); int c = sc.nextInt();

//         System.out.println("a, b min : " + min(a, b));
//         System.out.println("a, b max : " + max(a, b));
//         System.out.println("a, b, c min : " + min(a, b, c));
//         System.out.println("a, b, c max : " + max(a, b, c));
//     }
// }

// // 10-7

// class main_04 {
//     public static int min(int[] a) {
//         int m = a[0];
//         for (int i = 0; i < a.length; i++) {
//             if (a[i] <= m) m = a[i];
//         }
//         return m;
//     }

//     public static int max(int[] a) {
//         int m = a[0];
//         for (int i = 0; i < a.length; i++) {
//             if (a[i] >= m) m = a[i];
//         }
//         return m;
//     }

//     public static int[] minIndexArr(int[] a) {
//         int min = min(a);
//         int count = 0;
//         for (int i = 0; i < a.length; i++) {
//             if (a[i] == min) count++;
//         }
//         int[] c = new int[count--];
//         for (int i = a.length-1; count >= 0; i--) {
//             if (a[i] == min) {
//                 c[count--] = i;
//             }
//         }
//         return c;
//     }




//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("a : "); int n = sc.nextInt();
//         int[] a = new int[n];

//         for (int i = 0; i < n; i++) {
//             System.out.print("a["+i+"] : "); a[i] = sc.nextInt();
//         }
//         int xmin[] = minIndexArr(a);
//         System.out.println("min : " + min(a));
//         for (int i = 0; i < xmin.length; i++)
//             System.out.print(xmin[i] + " ");
//         System.out.println();
//         System.out.println("max : " + max(a));
//         //System.out.println("index : " + a.indexOf(max));
//     }
//  }




// // 13-1
// public class main_04 {

//     public static void main(String[] args) {
//         // Dog dog = new Dog("mongchi", "dog");
//         // Cat cat = new Cat("nabi", 6);

//         // System.out.print(dog.name + " ");
//         // dog.bark();
//         // System.out.print(cat.name + " ");
//         // cat.bark();

//         Animal[] a = new Animal[2];
//         a[0] = new Dog("mongch", "dog");
//         a[1] = new Cat("nabi", 7);

//         for (int i = 0; i < a.length; i++) {
//             System.out.println("a["+i+"] = " + a[i]);
//         }
//         for (int i = 0; i < a.length; i++) {
//             System.out.print("a["+i+"] = ");
//             a[i].introduce();
//         }


        
//         // System.out.print(a[0].getName() + " ");
//         // a[0].bark();
//         // System.out.print(a[1].getName() + " ");
//         // a[1].bark();
//     }
// }

// abstract class Animal {
//     String name;
//     public Animal(String name) {
//         this.name = name;
//     }
//     public abstract void bark();

//     public String getName() {
//         return name;
//     }

//     public void introduce() {
//         System.out.print(toString());
//         bark();
//     }
// }

// class Dog extends Animal {
//     private String type;
//     public Dog(String name, String type) {
//         super(name); this.type = type;
//     }
//     public void bark() {
//         System.out.println("Woooooooo");
//     }
//     public String toString() {
//         return type + "'s " + getName();
//     }
// }

// class Cat extends Animal {
//     private int age;
//     public Cat(String name, int age) {
//         super(name); this.age = age;
//     }
//     public void bark() {
//         System.out.println("Nyaaaaaaaa");
//     }
//     public String toString() {
//         return age + "'s " + getName(); 
//     }
// }

// 13-5

// class main_04 {
//     public static void main(String[] args) {
        
//         Human hp = new Human();
//         Computer cp = new Computer();

//         int humanHand = hp.humanHand();
//         int computerHand = cp.computerHand();
//         String[] hands = {"M", "J", "B"};

//         System.out.println("i'm "+hands[computerHand]+", you're "+hands[humanHand]);

//         if ((computerHand - humanHand == -1) || (computerHand - humanHand == 2))
//             System.out.println("you lose");
//         else if (humanHand - computerHand == 0) System.out.println("same");
//         else System.out.println("you win");

//     }
// }

// abstract class Player {
//     int hand;
// }

// class Human extends Player {
//     Scanner sc = new Scanner(System.in);
//     public int humanHand() {
//         do {
//             System.out.print("game start!!\n0...M/1...J/2...B : ");
//             hand = sc.nextInt();
//         } while(hand < 0  && hand > 2);
//         return hand;
//     }
// }

// class Computer extends Player {
//     Random rand = new Random();

//     public int computerHand() {
//         return rand.nextInt(3);
//     }
// }


// 14-1

// public interface Wearable {
//     void putOn();
//     void putOff();
// }

// public class Headphone implements Wearable{
//     public void putOn() {
//         System.out.println("headphone puton!");
//     }
//     public void putOff() {
//         System.out.println("headphone putoff!");
//     }
//     public void setVolume(int volume) {
//         System.out.println("control volume");
//     }
// }

// public class computer implements Wearable{
//     public void putOn() {
//         System.out.println("computer turnon!");
//     }
//     public void putOff() {
//         System.out.println("computer turnoff!");
//     }
//     public void setVolume(int volume) {
//         System.out.println("computer restart");
//     }
// }


// 15-4

// public class main_04 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Stringarray : "); String a = sc.next();

//         System.out.println("reverse magic ! ");
//         for (int i = a.length()-1; i>= 0 ; i--) {
//             System.out.print(a.charAt(i));
//         }
//     }
// }


// 15-6

public class main_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("s1 : "); String s1 = sc.next();
        System.out.print("s2 : "); String s2 = sc.next();

        int idx = s1.indexOf(s2);
        if (idx == -1) System.out.println("not include");
        else System.out.println(s1); 
        for (int i = 0; i < idx; i++) System.out.print(" ");
        System.out.println(s2);

    }
}