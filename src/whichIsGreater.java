import java.util.Scanner;

public class whichIsGreater {
    static Scanner sc = new Scanner(System.in);
    static int d = sc.nextInt();
    static int e = sc.nextInt();
    static int c = sc.nextInt();

    static void method1() {
        if (d > e && d > c) {
            System.out.println(d + " is greater");
        } else if (c > e && c > d) {
            System.out.println(c + " is greater");
        } else {
            System.out.println(e + " is greater");
        }
    }

    static void method2() {
        if (d>c){
            if (d>e){
                System.out.println(d+ " is greater");
            } else if (d<e) {
                System.out.println(e+ " is greater");
            }else {
                System.out.println(c);
            }
        }
    }

    static void method3(){
        int greater = d;
        if (greater > e) {
            greater = e;
        }
        if (greater >c){
            greater = c;
        }
        System.out.println("greater: "+ greater);
    }
}
